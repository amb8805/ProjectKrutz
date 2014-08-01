'use strict';

var androidApp = angular.module('androidApp', [
  'androidApp.controllers',
  'androidApp.filters',
  'androidApp.services',
  'androidApp.directives',
  'ui.bootstrap',
  'ui.select',
  'duScroll',
  'ngSanitize',
  'ngRoute'
]).value('duScrollDuration', 1150);

androidApp.config(function ($routeProvider, $locationProvider) {
  $routeProvider
    .when('/', {
      templateUrl : 'partials/home',
      controller  : 'HomeController'
    })

    .when('/data', {
      templateUrl : 'partials/data',
      controller  : 'DataController'
    })

    .when('/about', {
      templateUrl : 'partials/about',
      controller  : 'AppController'
    });

  $locationProvider.html5Mode(true);
});
