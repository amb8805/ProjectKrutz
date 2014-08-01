
var sqlite3 = require('sqlite3').verbose();

var file = '../EvolutionOfAndroidApplications.sqlite';
var db = new sqlite3.Database(file, sqlite3.OPEN_READONLY);

var apkProperties = 'rowid, Name, Version, Developer, Genre, UserRating, DatePublished, FileSize';

exports.getApkList = function (req, res) {

	var query = 'SELECT apk.rowid, apk.Name, apk.Version, apk.Developer, apk.Genre, apk.UserRating, apk.DatePublished, apk.FileSize, ' +
	'o.PermissionId as Overpermissions, u.PermissionId as Underpermissions ' +
	'FROM ApkInformation apk ' +
	'LEFT JOIN Overprivilege o ' +
		'ON apk.rowid = o.ApkId ' +
	'LEFT JOIN Underprivilege u ' +
		'ON apk.rowid = u.ApkId';

	db.all(query, function (err, apks) {

		// TODO: This code is atrocious... clean up if possible
		for (var i = 1; i < apks.length; i++) {

			if (apks[i - 1].Overpermissions == null) {
				apks[i - 1].Overpermissions = [];
			} else if (typeof apks[i - 1].Overpermissions == 'number') {
				apks[i - 1].Overpermissions = [apks[i - 1].Overpermissions];
			}

			if (apks[i - 1].Underpermissions == null) {
				apks[i - 1].Underpermissions = [];
			} else if (typeof apks[i - 1].Underpermissions == 'number') {
				apks[i - 1].Underpermissions = [apks[i - 1].Underpermissions];
			}

			if (apks[i - 1].rowid === apks[i].rowid) {
				if (apks[i].Overpermissions != null && apks[i - 1].Overpermissions.indexOf(apks[i].Overpermissions) == -1) {
					apks[i - 1].Overpermissions.push(apks[i].Overpermissions);
				}

				if (apks[i].Underpermissions != null && apks[i - 1].Underpermissions.indexOf(apks[i].Underpermissions) == -1) {
					apks[i - 1].Underpermissions.push(apks[i].Underpermissions);
				}

				apks.splice(i, 1);
				i--;
			}
		}

		res.send(apks);
	});
};

exports.getTopApkList = function (req, res) {

	db.all('SELECT Name FROM ApkInformation GROUP BY Name ORDER BY UpperDownloads DESC LIMIT 5', function (err, apks) {
		res.send(apks);
	});

};

exports.getGenreList = function (req, res) {

	db.all('SELECT DISTINCT Genre FROM ApkInformation ORDER BY Genre', function (err, genres) {
		res.send(genres);
	});

};

exports.getFilteredApkList = function (req, res) {
	
	var statement = 'SELECT ' + apkProperties + ' FROM ApkInformation';

	if (req.query.name) {
		statement += ' WHERE Name LIKE "%' + req.query.name + '%"';
	}
	if (req.query.version) {
		statement += ' WHERE Version LIKE "%' + req.query.version + '%"';
	}
	if (req.query.developer) {
		statement += ' WHERE Developer LIKE "%' + req.query.developer + '%"';
	}
	if (req.query.genre) {
		statement += ' WHERE Genre LIKE"%' + req.query.genre + '%"';
	}
	if (req.query.userRatingFrom && req.query.userRatingTo) {
		statement += ' WHERE Rating BETWEEN ' + req.query.userRatingFrom + ' AND ' + req.query.userRatingTo;
	}
	// TODO: DatePublished and FileSize queries are not functional
	if (req.query.releaseDateFrom && req.query.releaseDateTo) {
		statement += ' WHERE DatePublished BETWEEN ' + req.query.releaseDateFrom + ' AND ' + req.query.releaseDateTo;
	}
	if (req.query.fileSizeFrom && req.query.fileSizeTo) {
		statement += ' WHERE FileSize BETWEEN "' + req.query.fileSizeFrom + req.query.fileSizeFromUnit + '" AND "' + req.query.fileSizeTo + req.query.fileSizeToUnit + '"';
	}

	db.all(statement, function (err, apks) {
		res.send(apks);
	});
	
};

exports.getPermissionList = function (req, res) {

	db.all('SELECT * FROM Permissions', function (err, permissions) {
		res.send(permissions);
	})

};

exports.getOverprivilegeList = function (req, res) {

	db.all('SELECT * FROM Overprivilege', function (err, overpermissions) {
		res.send(overpermissions);
	})

};

exports.getUnderprivilegeList = function (req, res) {

	db.all('SELECT * FROM Underprivilege', function (err, underpermissions) {
		res.send(underpermissions);
	})

};
