'use strict';

/* Services */

angular.module('androidApp.services', ['ngResource']).
	factory('ApkService', function ($resource) {
		return {
			apks:	$resource('/apks', {}),
			genres:	$resource('/genres', {}),
			search:	$resource('/search', {})
		};
	}).
	value('version', '0.1');

