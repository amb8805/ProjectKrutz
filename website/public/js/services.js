'use strict';

/* Services */

angular.module('androidApp.services', ['ngResource']).
	factory('ApkService', function ($resource) {
		return {
			apk:				$resource('/apk', {}, {'query': {isArray: false}}),
			apks:				$resource('/apks', {}),
			topApks:			$resource('/topApks', {}),
			genres:				$resource('/genres', {}),
			filter:				$resource('/filter', {}),
			overpermissions:	$resource('/overpermissions', {}),
			underpermissions:	$resource('/underpermissions', {}) 
		};
	}).
	factory('SearchService', function () {
		var searchService = {};
		searchService.search = '';
		searchService.changeSearchQuery = function (value) {
			searchService.search = value;
		};
		return searchService;
	});
