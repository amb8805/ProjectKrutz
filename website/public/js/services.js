'use strict';

/* Services */

angular.module('androidApp.services', ['ngResource']).
	factory('ApkService', function ($resource) {

		return {
			apk:				$resource('/apk', {}),
			apks:				$resource('/apks', {}),
			apkCount:			$resource('/apkCount', {}),
			topApks:			$resource('/topApks', {}),
			topGenres:			$resource('/topGenres', {}),
			versionGroupAvgs:	$resource('/versionGroupAvgs', {}),
			genres:				$resource('/genres', {}),
			filter:				$resource('/filter', {})
		};

	}).
	factory('ApkListService', function (ApkService) {

		return {
			apks: undefined,
			filteredApks: undefined,
			topApks: undefined,
			topGenres: undefined,
			versionGroupAvgs: undefined,
			sort: { column: '', sortOrder: 1 }
		};

	}).
	factory('SearchService', function () {

		var serviceInstance = {};
		serviceInstance.search = '';

		serviceInstance.changeSearchQuery = function (value) {
			serviceInstance.search = value;
		};

		return serviceInstance;

	});
