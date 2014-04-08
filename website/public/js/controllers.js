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
  controller('DataController', function ($scope, ApkInfo) {

    // Get APK data from the database
    ApkInfo.query(function (response) {
      $scope.rows = response;
      $scope.totalItems = $scope.rows.length;
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

  }).
  controller('AboutController', function ($scope) {

    $scope.message = 'About';

  });
