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

exports.filterApkList = function (req, res) {
	var name = req.params.name;
	var version = req.params.version;
	var developer = req.params.developer;
	var genre = req.params.genre;
	var userRating = req.params.userRating;
	var releaseDate = req.params.releaseDate;
	var fileSize = req.params.fileSize;

	db.all('SELECT * FROM ApkInformation WHERE Name LIKE "%' + name + '%" WHERE Version LIKE "%' + version + '% WHERE Developer LIKE "%' + developer + '%" WHERE Genre="' + genre + '"', function (err, apks) {
		res.send(apks);
	});
};