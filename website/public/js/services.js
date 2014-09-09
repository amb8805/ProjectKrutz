'use strict';

/* Services */

angular.module('androidApp.services', ['ngResource']).
	factory('ApkService', function ($resource) {

		return {
			apk:						$resource('/apk', {}, {'query': {isArray: false}}),
			apks:						$resource('/apks', {}),
			topApks:					$resource('/topApks', {}),
			topOverprivilegedGenres:	$resource('/topOverprivilegedGenres', {}),
			genres:						$resource('/genres', {}),
			filter:						$resource('/filter', {}),
			overpermissions:			$resource('/overpermissions', {}),
			underpermissions:			$resource('/underpermissions', {}) 
		};

	}).
	factory('ApkListService', function (ApkService) {

		return {
			apks: undefined,
			filteredApks: undefined,
			topApks: undefined,
			topOverprivilegedGenres: undefined
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
