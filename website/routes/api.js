
var sqlite3 = require('sqlite3').verbose();

var file = '../EvolutionOfAndroidApplications.sqlite';
var db = new sqlite3.Database(file, sqlite3.OPEN_READONLY);

var apkProperties = 'rowid, Name, Version, Developer, Genre, UserRating, DatePublished, FileSize';

exports.getApkList = function (req, res) {

	db.all('SELECT ' + apkProperties + ' FROM ApkInformation', function (err, apks) {
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

	db.all('SELECT * FROM Permissions', function (err, overpermissions) {
		res.send(overpermissions);
	})

};

exports.getUnderprivilegeList = function (req, res) {

	db.all('SELECT * FROM Permissions', function (err, underpermissions) {
		res.send(underpermissions);
	})

};
