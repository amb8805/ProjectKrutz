'use strict';

/* Services */

angular.module('androidApp.services', ['ngResource']).
	factory('ApkService', function ($resource) {
		return {
			apk:				$resource('/apk', {}, {'query': {isArray: false}}),
			apks:				$resource('/apks', {}),
			genres:				$resource('/genres', {}),
			filter:				$resource('/filter', {}),
			overpermissions:	$resource('/overpermissions', {}),
			underpermissions:	$resource('/underpermissions', {})
		};
	});
