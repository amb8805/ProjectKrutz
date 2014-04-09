'use strict';

/* Controllers */

angular.module('androidApp.controllers', []).
  controller('AppController', function ($scope, $location) {

    $scope.isCollapsed = true;

    $scope.$on('$routeChangeSuccess', function() {
      $scope.isCollapsed = true;
    });

    $scope.getClass = function(path) {
      if (path === '/') {
        if ($location.path() === '/') {
          return 'active';
        } else {
          return '';
        }
      }

      if ($location.path().substr(0, path.length) === path) {
        return 'active';
      } else {
        return '';
      }
    }
    
  }).
  controller('DataController', function ($scope, ApkService) {

    // Get APK data from the database
    ApkService.query(function (response) {
      $scope.apks = response;
      $scope.totalItems = $scope.apks.length;
    });

    // Download format dropdown
    $scope.disabled = undefined;

    $scope.enable = function() {
      $scope.disabled = false;
    };

    $scope.disable = function() {
      $scope.disabled = true;
    };

    $scope.clear = function() {
      $scope.format.selected = undefined;
    };

    $scope.format = {};
    $scope.formats = [
      'XML',
      'JSON',
      'CSV'
    ];

    // Pagination
    $scope.totalItems = 1;
    $scope.currentPage = 1;
    $scope.itemsPerPage = 25;
    $scope.maxSize = 5;

    // Search bar
    $scope.selected = undefined;

    // Datepicker
    $scope.today = function() {
      $scope.dt = new Date();
    };
    $scope.today();

    $scope.clear = function () {
      $scope.dt = null;
    };
    
    $scope.open = function ($event) {
      $event.preventDefault();
      $event.stopPropagation();

      $scope.opened = true;
    };

  }).
  controller('AboutController', function ($scope) {

    $scope.message = 'About';

  });
