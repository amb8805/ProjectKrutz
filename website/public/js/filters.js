'use strict';

/* Filters */

angular.module('androidApp.filters', []).
	filter('startFrom', function () {
		return function (apks, start) {
			if (apks) {
				return apks.slice(start);
			}
		}
	}).

	filter('interpolate', function (version) {
		return function (text) {
			return String(text).replace(/\%VERSION\%/mg, version);
		};
	});
