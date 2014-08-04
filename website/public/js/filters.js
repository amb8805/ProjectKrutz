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
	filter('topApks', function () {
		return function (apks, end) {
			if (apks) {
				return apks.slice().sort(function (a, b) {
					return b.UpperDownloads - a.UpperDownloads;
				}).slice(0, end);
			}
		};
	});
