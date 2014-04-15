'use strict';

/* Services */

angular.module('androidApp.services', ['ngResource']).
	factory('Apk', function ($resource) {
		return $resource('/apks', {});
  	}).
  	factory('Filter', function ($resource) {
		return $resource('/filter?name=":name"&version=":version"&developer=":developer"&genre=":genre"&userRating=":userRating"&releaseDate=":releaseDate"&fileSize=":fileSize"', {
			name: '@Name',	
			version: '@Version',
			developer: '@Develoer',
			genre: '@Genre',
			userRating: '@userRating',
			releaseDate: '@releaseDate',
			fileSize: '@fileSize'
		});
  	}).
	value('version', '0.1');

