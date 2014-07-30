'use strict';

/* Services */

angular.module('androidApp.services', ['ngResource']).
	factory('ApkService', function ($resource) {
		return {
			apks:				$resource('/apks', {}),
			genres:				$resource('/genres', {}),
			search:				$resource('/search', {}),
			permissions:		$resource('/permissions', {}),
			overpermissions:	$resource('/overpermissions', {}),
			underpermissions:	$resource('/underpermissions', {})
		};
	}).
	value('version', '0.1');

