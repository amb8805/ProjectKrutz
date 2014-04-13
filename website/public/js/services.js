'use strict';

/* Services */

angular.module('androidApp.services', ['ngResource']).
	factory('ApkService', function ($resource) {
		return $resource('api/apks', {});
  	}).
  	
	value('version', '0.1');

