
var sqlite3 = require('sqlite3').verbose();

var file = '../EvolutionOfAndroidApplications.sqlite';
var db = new sqlite3.Database(file, sqlite3.OPEN_READONLY);

var apkProperties = 'rowid, Name, Version, Developer, Genre, UserRating, DatePublished, FileSize, LowerDownloads, UpperDownloads';

var mergeApkList = function (apks) {

	for (var i = 0; i < apks.length - 1; i++) {

		if (apks[i].Overpermissions == null) {
			apks[i].Overpermissions = [];
		} else if (!(apks[i].Overpermissions instanceof Array)) {
			apks[i].Overpermissions = [apks[i].Overpermissions];
		}

		if (apks[i].Underpermissions == null) {
			apks[i].Underpermissions = [];
		} else if (!(apks[i].Underpermissions instanceof Array)) {
			apks[i].Underpermissions = [apks[i].Underpermissions];
		}

		if (apks.length > 1) {
			if (apks[i].rowid === apks[i + 1].rowid) {
				if (apks[i + 1].Overpermissions != null && apks[i].Overpermissions.indexOf(apks[i + 1].Overpermissions) == -1) {
					apks[i].Overpermissions.push(apks[i + 1].Overpermissions);
				}

				if (apks[i + 1].Underpermissions != null && apks[i].Underpermissions.indexOf(apks[i + 1].Underpermissions) == -1) {
					apks[i].Underpermissions.push(apks[i + 1].Underpermissions);
				}

				apks.splice(i + 1, 1);
				i--;
			}
		}
		
	}

	return apks;

};

exports.getApk = function (req, res) {

	var query = 'SELECT apk.rowid, apk.Name, apk.Version, apk.Developer, apk.Genre, ' +
		'apk.UserRating, apk.DatePublished, apk.FileSize, apk.LowerDownloads, apk.UpperDownloads, ' +
		'p.Name as Overpermissions, p2.Name as Underpermissions, ' +
		'tr.FuzzyRiskValue, tr.DefectCount ' +
		'FROM ApkInformation apk ' +
		'LEFT JOIN ToolResults tr ON apk.rowid = tr.ApkId ' +
		'LEFT JOIN Overprivilege o ON apk.rowid = o.ApkId ' +
		'LEFT JOIN Underprivilege u ON apk.rowid = u.ApkId ' +
		'LEFT JOIN Permissions p on p.pid = o.PermissionId ' +
		'LEFT JOIN Permissions p2 on p2.pid = u.PermissionId ' +
		'WHERE apk.rowid IS ' + req.query.rowid;

	db.all(query, function (err, apks) {
		var apk = mergeApkList(apks)[0];
		res.send(apk);
	});

};

exports.getApkList = function (req, res) {

	var query = 'SELECT apk.rowid, apk.Name, apk.Version, apk.Developer, apk.Genre, ' +
		'apk.UserRating, apk.DatePublished, apk.FileSize, apk.LowerDownloads, apk.UpperDownloads, ' +
		'p.Name as Overpermissions, p2.Name as Underpermissions ' +
		'FROM ApkInformation apk ' +
		'LEFT JOIN Overprivilege o ON apk.rowid = o.ApkId ' +
		'LEFT JOIN Underprivilege u ON apk.rowid = u.ApkId ' +
		'LEFT JOIN Permissions p on p.pid = o.PermissionId ' +
		'LEFT JOIN Permissions p2 on p2.pid = u.PermissionId';

	db.all(query, function (err, apks) {
		res.send(mergeApkList(apks));
	});
};

// TODO: Maybe use this instead of topApk filter?
exports.getTopApkList = function (req, res) {

	// SELECT Name, Version, Developer, MAX(CollectionDate), UpperDownloads FROM ApkInformation GROUP BY Name ORDER BY UpperDownloads DESC LIMIT 10
	var query = 'SELECT apk.rowid, apk.Name, MAX(apk.CollectionDate), ' +
		'p.Name as Overpermissions, p2.Name as Underpermissions ' +
		'FROM ApkInformation apk ' +
		'LEFT JOIN Overprivilege o ON apk.rowid = o.ApkId ' +
		'LEFT JOIN Underprivilege u ON apk.rowid = u.ApkId ' +
		'LEFT JOIN Permissions p on p.pid = o.PermissionId ' +
		'LEFT JOIN Permissions p2 on p2.pid = u.PermissionId ' +
		'GROUP BY apk.Name ORDER BY apk.UpperDownloads DESC LIMIT 5';

	db.all(query, function (err, apks) {
		res.send(mergeApkList(apks));
	});

};

exports.getGenreList = function (req, res) {

	db.all('SELECT DISTINCT Genre FROM ApkInformation ORDER BY Genre', function (err, genres) {
		res.send(genres);
	});

};

exports.getFilteredApkList = function (req, res) {
	
	var statement = 'SELECT ' + apkProperties + ' FROM ApkInformation';
	var multipleConditions = false;

	if (req.query.name) {
		statement += ' WHERE Name LIKE "%' + req.query.name + '%"';
		multipleConditions = true;
	}
	if (req.query.version) {
		if (multipleConditions) {
			statement += ' AND';

		} else {
			statement += ' WHERE';
			multipleConditions = true;
		}
		statement += ' Version LIKE "%' + req.query.version + '%"';
	}
	if (req.query.developer) {
		if (multipleConditions) {
			statement += ' AND';

		} else {
			statement += ' WHERE';
			multipleConditions = true;
		}
		statement += ' Developer LIKE "%' + req.query.developer + '%"';
		multipleConditions = true;
	}
	if (req.query.genre) {
		if (multipleConditions) {
			statement += ' AND';

		} else {
			statement += ' WHERE';
			multipleConditions = true;
		}
		statement += ' Genre LIKE"%' + req.query.genre + '%"';
		multipleConditions = true;
	}
	if (req.query.userRatingFrom && req.query.userRatingTo) {
		if (multipleConditions) {
			statement += ' AND';

		} else {
			statement += ' WHERE';
			multipleConditions = true;
		}
		statement += ' UserRating BETWEEN ' + req.query.userRatingFrom + ' AND ' + req.query.userRatingTo;
	}

	db.all(statement, function (err, apks) {
		res.send(apks);
	});
	
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
