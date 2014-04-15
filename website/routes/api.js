/*
 * Serve JSON to our AngularJS client
 */

var sqlite3 = require('sqlite3').verbose();

var file = '../Evolution of Android Applications.sqlite';
var db = new sqlite3.Database(file, sqlite3.OPEN_READONLY);

exports.getApkList = function (req, res) {
	/*
		SELECT info.*, permissions.*
		FROM ApkInformation info, PERMISSIONS permissions
		WHERE info.Name=permissions.Name
		AND info.Version=permissions.Name
	*/
	db.all('SELECT * FROM ApkInformation', function (err, apks) {
		res.send(apks);
	});
};

exports.getGenreList = function (req, res) {

	db.all('SELECT DISTINCT Genre FROM ApkInformation ORDER BY Genre', function (err, genres) {
		res.send(genres);
	});

};

exports.getFilteredApkList = function (req, res) {
	
	var statement = 'SELECT * FROM ApkInformation';

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