var sqlite3 = require('sqlite3').verbose();

var file = 'public/assets/sqlite/EvolutionOfAndroidApplications.sqlite';
var db = new sqlite3.Database(file, sqlite3.OPEN_READONLY);

var apkProperties = 'apk.rowid, apk.Name, apk.Version, apk.Developer, apk.Genre, ' +
	'apk.UserRating, apk.DatePublished, apk.GeneratedFileSize as FileSize, apk.LowerDownloads, apk.UpperDownloads';

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

	var query = 'SELECT ' + apkProperties + ' FROM ApkInformation apk INNER JOIN ToolResults tr on tr.ApkId = apk.rowid';

	db.all(query, function (err, apks) {

		if (err) return next(err);
		if (!apks || apks.length == 0) return next(new Error());

		res.send(apks);

	});
};

exports.getApkCount = function (req, res, next) {

	var query = 'SELECT COUNT(Name) AS TotalCount from ApkInformation apk INNER JOIN ToolResults tr on tr.ApkId = apk.rowid';

	db.all(query, function (err, count) {
		if (err) return next(err);
		res.send({ TotalCount: count[0].TotalCount });
	});

};

exports.getOverprivilegeCountsForTopApks = function (req, res, next) {

	var query = 'SELECT apk.Name, MAX(apk.ModifiedDatePublished), IFNULL(oprivCount.oCount, 0) as OverPrivCount ' +
		'FROM ApkInformation apk ' +
		'INNER JOIN (SELECT ApkId, COUNT(o.ApkId) AS oCount FROM Overprivilege o GROUP BY ApkId) oprivCount ON oprivcount.apkid = apk.rowid ' +
		'GROUP BY Name ' +
		'ORDER BY UpperDownloads DESC LIMIT 5';

	db.all(query, function (err, apks) {
		if (err) return next(err);
		res.send(apks);
	});

};

exports.getTopOverprivilegedGenres = function (req, res, next) {

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
		if (err) return next(err);
		res.send(genres);
	});

};

exports.getAvgOverpermissionsByVersionGroup = function (req, res, next) {

	var query = function (genre) {
		return 'SELECT apk.Genre as Genre, apk2.Range, ' +
			'ROUND(AVG(overprivCount.oprivcount), 2) AS OverPrivCount ' +
			'FROM ApkInformation apk ' +
			'INNER JOIN ToolResults tr ON tr.ApkId = apk.RowId ' +
			'INNER JOIN (SELECT apk2.RowId, apk2.Range ' +
			'FROM (SELECT rowid, Name, Version, CASE ' +
			'WHEN Version BETWEEN 0 AND 1 THEN "0" ' +
			'WHEN Version BETWEEN 1 AND 2 THEN "1" ' +
			'WHEN Version BETWEEN 2 AND 3 THEN "2" ' +
			'WHEN Version BETWEEN 3 AND 4 THEN "3" ' +
			'WHEN Version BETWEEN 4 AND 5 THEN "4" ' +
			'WHEN Version BETWEEN 5 AND 6 THEN "5" ' +
			'WHEN Version BETWEEN 6 AND 7 THEN "6" ' +
			'WHEN Version BETWEEN 7 AND 8 THEN "7" ' +
			'ELSE "x" END AS Range FROM ApkInformation) apk2) apk2 ' +
			'ON apk2.rowid = apk.rowid ' +
			'LEFT OUTER JOIN (SELECT COUNT(PermissionId) AS oprivcount, ApkId FROM Overprivilege GROUP BY ApkId) overprivCount ' +
			'ON (overprivCount.ApkId) = apk.rowid ' +
			'WHERE LowerDownloads >= 10000 ' +
			'AND GENRE = "' + genre + '" ' +
			'GROUP BY apk2.Range ' +
			'ORDER BY apk2.Range';
	};

	var result = {
		tools: undefined,
		entertainment: undefined,
		music: undefined,
		puzzle: undefined,
		education: undefined
	};

	db.serialize(function () {
		db.all(query('Tools'), function (err, tools) {
			if (err) return next(err);
			result.tools = tools;
		});

		db.all(query('Entertainment'), function (err, entertainment) {
			if (err) return next(err);
			result.entertainment = entertainment;
		});

		db.all(query('Music & Audio'), function (err, music) {
			if (err) return next(err);
			result.music = music;
		});

		db.all(query('Puzzle'), function (err, puzzle) {
			if (err) return next(err);
			result.puzzle = puzzle;
		});

		db.all(query('Education'), function (err, education) {
			if (err) return next(err);
			result.education = education;
			res.send(result);
		});
	});

};

exports.getGenres = function (req, res, next) {

	db.all('SELECT DISTINCT Genre FROM ApkInformation ORDER BY Genre', function (err, genres) {
		if (err) return next(err);
		res.send(genres);
	});

};

exports.getFilteredApks = function (req, res, next) {
	
	var statement = 'SELECT ' + apkProperties + ', tr.FuzzyRiskValue, ' +
		'tr.JavaFiles, tr.DefectCount, tr.JlintResult, tr.Simcad_CloneFragment, ' +
		'o.OverprivCount, u.UnderprivCount ' +
		'FROM ApkInformation apk ' +
		'INNER JOIN ToolResults tr on tr.ApkId = apk.rowid ' +
		'LEFT OUTER JOIN (SELECT COUNT(PermissionId) AS OverprivCount, ApkId FROM Overprivilege GROUP BY ApkId) o ON (o.ApkId) = apk.rowid ' +
		'LEFT OUTER JOIN (SELECT COUNT(PermissionId) AS UnderprivCount, ApkId FROM Underprivilege GROUP BY ApkId) u ON (u.ApkId) = apk.rowid ';

	var multipleConditions = false;

	if (req.query.name) {
		statement += ' WHERE apk.Name ="' + req.query.name + '"';
		multipleConditions = true;
	}
	if (req.query.version) {
		if (multipleConditions) {
			statement += ' AND';

		} else {
			statement += ' WHERE';
			multipleConditions = true;
		}
		statement += ' apk.Version ="' + req.query.version + '"';
	}
	if (req.query.developer) {
		if (multipleConditions) {
			statement += ' AND';

		} else {
			statement += ' WHERE';
			multipleConditions = true;
		}
		statement += ' apk.Developer LIKE "%' + req.query.developer + '%"';
		multipleConditions = true;
	}
	if (req.query.genre) {
		if (multipleConditions) {
			statement += ' AND';

		} else {
			statement += ' WHERE';
			multipleConditions = true;
		}
		statement += ' apk.Genre = "' + req.query.genre + '"';
		multipleConditions = true;
	}
	if (req.query.userRatingFrom && req.query.userRatingTo) {
		if (multipleConditions) {
			statement += ' AND';

		} else {
			statement += ' WHERE';
			multipleConditions = true;
		}
		statement += ' apk.UserRating BETWEEN ' + req.query.userRatingFrom + ' AND ' + req.query.userRatingTo;
	}
	if (req.query.sort) {
		statement += ' ORDER BY ' + req.query.sort;
	}

	db.all(statement, function (err, apks) {
		if (err) return next(err);
		res.send(apks);
	});
	
};

exports.processQuery = function(req, res){
	db.all(req.params.query, function (err, result) {
		if (err) res.send('fail');
		res.send(result);
    });
};

exports.downloadCSVFile = function(req, res){
	res.download('/home/darwin/ProjectKrutz/website/public/assets/csv/' + req.params.filename + '.csv', req.params.filename + '.csv');
};

exports.downloadPDFFile = function(req, res){
	res.download('/home/darwin/ProjectKrutz/website/public/assets/pdf/' + req.params.filename + '.pdf', req.params.filename + '.pdf');
}
