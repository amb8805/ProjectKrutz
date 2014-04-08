'use strict';

/* Services */

angular.module('androidApp.services', ['ngResource']).
	factory('ApkInfo', function ($resource) {
		return $resource('api/rows', {});
  	}).

	value('version', '0.1');

