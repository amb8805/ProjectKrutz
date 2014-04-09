/*
 * Serve JSON to our AngularJS client
 */

var sqlite3 = require('sqlite3').verbose();

var file = '../Evolution of Android Applications.sqlite';
var db = new sqlite3.Database(file, sqlite3.OPEN_READONLY);

exports.getApkList = function (req, res) {
	db.all('SELECT * FROM ApkInformation', function (err, apks) {
		res.send(apks);
	});
};