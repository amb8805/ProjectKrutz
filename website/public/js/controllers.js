'use strict';

/* Controllers */

angular.module('androidApp.controllers', []).
  controller('AppController', function ($scope, $location, ApkService) {

    // Get APK data from the database
    ApkService.query(function (response) {
      $scope.apks = response;
    });

    // Logic for navbar
    $scope.isCollapsed = true;

    $scope.$on('$routeChangeSuccess', function () {
      $scope.isCollapsed = true;
    });

    // Logic for routing
    $scope.getClass = function (path) {
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
  controller('DataController', function ($scope) {

    // Download format dropdown
    $scope.disabled = undefined;

    $scope.enable = function () {
      $scope.disabled = false;
    };

    $scope.disable = function () {
      $scope.disabled = true;
    };

    $scope.clear = function () {
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

    $scope.$watch('apks', function () {
      $scope.totalItems = $scope.apks.length;
    });

    // Search bar
    $scope.selected = undefined;

  }).
  controller('AdvancedSearchController', function ($scope, $modal, $log) {

    $scope.open = function () {

      var modalInstance = $modal.open({
        templateUrl : 'partials/advanced',
        controller  : 'AdvancedSearchInstanceController',
        resolve     : {
        
        } 
      });

      modalInstance.result.then(function () {
        
      });
    };

  }).
  controller('AdvancedSearchInstanceController', function ($scope, $modalInstance) {

    $scope.ok = function () {
      $modalInstance.close();
    };

  }).
  controller('AboutController', function ($scope) {

    $scope.message = 'About';

  });
