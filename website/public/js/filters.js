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
	}).
	filter('fileSize', function () {
		return function (fileSize) {
			if (fileSize >= 1048576) {
				// Convert to megabytes
				return (fileSize * 0.000001).toFixed(1) + 'M';
			} else {
				// Convert to kilobytes
				return (fileSize * 0.001).toFixed(0) + 'k';
			}
		}
	});
