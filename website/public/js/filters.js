'use strict';

/* Filters */

angular.module('androidApp.filters', []).
	filter('startFrom', function () {
		return function (rows, start) {
			return rows.slice(start);
		}
	}).

	filter('interpolate', function (version) {
		return function (text) {
			return String(text).replace(/\%VERSION\%/mg, version);
		};
	});
