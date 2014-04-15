'use strict';

/* Controllers */

angular.module('androidApp.controllers', []).
  controller('AppController', function ($scope, $location, Apk) {

    // Get APK data from the database

    Apk.query(function (response) {
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

    // Toggle view button

    $scope.toggleViewModel = 'Table';

    // Pagination

    $scope.totalItems = 1;
    $scope.currentPage = 1;
    $scope.itemsPerPage = 25;
    $scope.maxSize = 5;

    $scope.$watch('apks', function () {
      if ($scope.apks) {
        $scope.totalItems = $scope.apks.length;
      }
    });

  }).
  controller('SearchController', function ($scope) {

    $scope.selected = undefined;

  }).
  controller('ModalController', function ($scope, $modal, $log) {

    $scope.open = function () {

      var modalInstance = $modal.open({
        templateUrl: 'partials/advanced',
        controller: 'ModalInstanceController',
        resolve: {
          
        } 
      });

      modalInstance.result.then(function (params) {
        // TODO: Use params to generate SQL statement
      });
    };

  }).
  controller('ModalInstanceController', function ($scope, $modalInstance) {

    $scope.filter = {
      name: null,
      version: null,
      developer: null,
      genre: {},
      userRatingFrom: null,
      userRatingTo: null,
      releaseDateFrom: null,
      releaseDateTo: null,
      fileSize: null
    };

    $scope.ok = function () {
      $modalInstance.close({
        name: $scope.filter.name, 
        version: $scope.filter.version, 
        developer: $scope.filter.developer, 
        genre: $scope.filter.genre.selected,
        userRatingFrom: $scope.filter.userRatingFrom,
        userRatingTo: $scope.filter.userRatingTo,
      });
    };

    $scope.cancel = function () {
      $modalInstance.dismiss('cancel');
    };

  }).
  controller('GenreController', function ($scope) {

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

    // TODO: Make this not hard coded
    $scope.genre = {};
    $scope.genres = [
      'Books & Reference', 
      'Business',
      'Comics', 
      'Communication',
      'Education',
      'Entertainment',
      'Finance',
      'Health & Fitness', 
      'Libraries & Demo',
      'Lifestyle',
      'Live Wallpaper',
      'Media & Video',
      'Medical',
      'Music & Audio',
      'News & Magazines',
      'Personalization',
      'Photography',
      'Productivity',
      'Shopping',
      'Social',
      'Sports',
      'Tools',
      'Transportation'
    ];

  }).
  controller('DateController', function ($scope) {

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
  controller('DownloadController', function ($scope) {

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

  }).
  controller('AboutController', function ($scope) {

    $scope.message = 'About';

  });
