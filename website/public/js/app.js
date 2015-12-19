'use strict';

var androidApp = angular.module('androidApp', [
  'androidApp.controllers',
  'androidApp.filters',
  'androidApp.services',
  'androidApp.directives',
  'ui.bootstrap',
  'ui.select',
  'ngSanitize',
  'ngRoute'
]);

androidApp.config(function ($routeProvider, $locationProvider) {
  $routeProvider
    .when('/', {
      templateUrl: 'partials/home',
      controller: 'HomeController'
    })
    .when('/analytics', {
      templateUrl: 'partials/data',
      controller: 'DataController'
    })
    .when('/analytics/:apkId', {
      templateUrl: 'partials/apk-detail',
      controller: 'ApkDetailController'
    })
    .when('/reports', {
      templateUrl: 'partials/reports',
      controller: 'ReportsController'
    })
    .when('/about', {
      templateUrl: 'partials/about',
      controller: 'AppController'
    });

  $locationProvider.html5Mode(true);
});

androidApp.config(function (uiSelectConfig) {
  uiSelectConfig.theme = 'bootstrap';
});

androidApp.config(function (datepickerConfig) {
  datepickerConfig.showWeeks = false;
});