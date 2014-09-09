
var sqlite3 = require('sqlite3').verbose();

var file = '../EvolutionOfAndroidApplications.sqlite';
var db = new sqlite3.Database(file, sqlite3.OPEN_READONLY);

var apkProperties = 'apk.rowid, apk.Name, apk.Version, apk.Developer, apk.Genre, ' +
	'apk.UserRating, apk.DatePublished, apk.FileSize, apk.LowerDownloads, apk.UpperDownloads';

var mergeApkList = function (apks) {

	var i = 0;

	// A real use case for a do-while loop!
	do {

		// If the APK has no over- and/or underpermissions, initialize an empty array.
		// If the APK does have over- and/or underpermissions, convert the permission 
		// name to an array containing the permission name.
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

		// Look at the next APK in the array. If it has over- and/or underpermissions, and these 
		// permissions are not duplicates, then add the permissions to the current APK.
		if (apks.length > 1) {
			if (apks[i].rowid === apks[i + 1].rowid) {
				if (apks[i + 1].Overpermissions != null && apks[i].Overpermissions.indexOf(apks[i + 1].Overpermissions) == -1) {
					apks[i].Overpermissions.push(apks[i + 1].Overpermissions);
				}

				if (apks[i + 1].Underpermissions != null && apks[i].Underpermissions.indexOf(apks[i + 1].Underpermissions) == -1) {
					apks[i].Underpermissions.push(apks[i + 1].Underpermissions);
				}

				// Remove the next APK in the array, so we don't look at it again.
				apks.splice(i + 1, 1);
				i--;
			}
		}

		i++;
		
	}
	while (i < apks.length - 1);

	return apks;

};

exports.getApk = function (req, res, next) {

	var query = 'SELECT ' + apkProperties + ', ' +
		'p.Name as Overpermissions, p2.Name as Underpermissions, ' +
		'tr.FuzzyRiskValue, tr.DefectCount, tr.JavaFiles, tr.JlintResult ' +
		'FROM ApkInformation apk ' +
		'LEFT JOIN ToolResults tr ON apk.rowid = tr.ApkId ' +
		'LEFT JOIN Overprivilege o ON apk.rowid = o.ApkId ' +
		'LEFT JOIN Underprivilege u ON apk.rowid = u.ApkId ' +
		'LEFT JOIN Permissions p on p.pid = o.PermissionId ' +
		'LEFT JOIN Permissions p2 on p2.pid = u.PermissionId ' +
		'WHERE apk.rowid IS ' + req.query.rowid;

	db.all(query, function (err, apks) {

		if (err) return next(err);
		if (!apks || apks.length == 0) return next(new Error());

		var apk = mergeApkList(apks)[0];
		res.send(apk);

	});

};

exports.getApks = function (req, res, next) {

	var query = 'SELECT ' + apkProperties + ', ' +
		'p.Name as Overpermissions, p2.Name as Underpermissions ' +
		'FROM ApkInformation apk ' +
		'LEFT JOIN Overprivilege o ON apk.rowid = o.ApkId ' +
		'LEFT JOIN Underprivilege u ON apk.rowid = u.ApkId ' +
		'LEFT JOIN Permissions p on p.pid = o.PermissionId ' +
		'LEFT JOIN Permissions p2 on p2.pid = u.PermissionId';

	db.all(query, function (err, apks) {

		if (err) return next(err);
		if (!apks || apks.length == 0) return next(new Error());

		res.send(mergeApkList(apks));

	});
};

exports.getTopApks = function (req, res, next) {

	var query = 'SELECT apk.rowid, apk.Name, ' + 
		'p.Name as Overpermissions, p2.Name as Underpermissions ' +
		'FROM ApkInformation apk ' +
		'LEFT JOIN Overprivilege o ON apk.rowid = o.ApkId ' +
		'LEFT JOIN Underprivilege u ON apk.rowid = u.ApkId ' +
		'LEFT JOIN Permissions p on p.pid = o.PermissionId ' +
		'LEFT JOIN Permissions p2 on p2.pid = u.PermissionId ' +
		'INNER JOIN (SELECT rowid, MAX(CollectionDate) FROM ApkInformation GROUP BY Name ORDER BY UpperDownloads DESC LIMIT 6) apk2 ON apk2.rowid = apk.rowid ' +
		'WHERE Overpermissions IS NOT NULL';

	db.all(query, function (err, apks) {

		if (err) return next(err);
		if (!apks || apks.length == 0) return next(new Error());

		res.send(mergeApkList(apks));

	});

};

exports.getTopOverprivilegedGenres = function (req, res) {

	var query = 'SELECT apk.Genre, ROUND(CAST(COUNT(apk.Genre) AS FLOAT) / CAST(TotalGenre.TotalGenreCount AS FLOAT), 2) * 100 as AtLeastXOverPrivPercentage ' +
		'FROM ApkInformation apk ' +
		'LEFT OUTER JOIN (SELECT COUNT(PermissionId) AS OprivCount, ApkId FROM Overprivilege GROUP BY ApkId) OverprivCount ' +
		'ON (OverprivCount.ApkId) = apk.rowid ' +
		'INNER JOIN (SELECT Genre, COUNT(Genre) AS TotalGenreCount ' +
		'FROM ApkInformation GROUP BY Genre) TotalGenre ' +
		'ON TotalGenre.Genre = apk.Genre ' +
		'WHERE Oprivcount > 0 ' +
		'GROUP BY apk.Genre ORDER BY AtleastXOverPrivPercentage DESC LIMIT 5';

	db.all(query, function (err, genres) {
		res.send(genres);
	});

};

exports.getGenres = function (req, res) {

	db.all('SELECT DISTINCT Genre FROM ApkInformation ORDER BY Genre', function (err, genres) {
		res.send(genres);
	});

};

exports.getFilteredApks = function (req, res) {
	
	var statement = 'SELECT ' + apkProperties + ' FROM ApkInformation apk';
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

exports.getOverprivileges = function (req, res) {

	db.all('SELECT * FROM Overprivilege', function (err, overpermissions) {
		res.send(overpermissions);
	})

};

exports.getUnderprivileges = function (req, res) {

	db.all('SELECT * FROM Underprivilege', function (err, underpermissions) {
		res.send(underpermissions);
	})

};
