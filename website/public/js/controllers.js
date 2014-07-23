'use strict';

/* Controllers */

angular.module('androidApp.controllers', []).
  controller('AppController', function ($scope, $location, ApkService) {

    // Get APK data from the database

    ApkService.apks.query(function (response) {
      $scope.apks = response;
    });

    // Logic for navbar

    $scope.isCollapsed = true;

    $scope.$on('$routeChangeSuccess', function () {
      $scope.isCollapsed = true;
    });

    $scope.$on('filterApks', function (event, data) {
      $scope.apks = data;
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
  controller('HomeController', function ($scope) {

    $scope.chart = [
        {
            value: 30,
            color:"#F7464A"
        },
        {
            value : 50,
            color : "#E2EAE9"
        },
        {
            value : 100,
            color : "#D4CCC5"
        },
        {
            value : 40,
            color : "#949FB1"
        },
        {
            value : 120,
            color : "#4D5360"
        }
    ];

    $scope.options =  {
        // Boolean - Whether we should show a stroke on each segment
        segmentShowStroke : true,

        // String - The colour of each segment stroke
        segmentStrokeColor : "#fff",

        // Number - The width of each segment stroke
        segmentStrokeWidth : 5,

        // The percentage of the chart that we cut out of the middle.
        percentageInnerCutout : 50,

        // Boolean - Whether we should animate the chart
        animation : true,

        // Number - Amount of animation steps
        animationSteps : 100,

        // String - Animation easing effect
        animationEasing : "easeOutBounce",

        // Boolean - Whether we animate the rotation of the Doughnut
        animateRotate : true,

        // Boolean - Whether we animate scaling the Doughnut from the centre
        animateScale : false,

        // Function - Will fire on animation completion.
        onAnimationComplete : null
    };

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

    // Selected download format and all available formats

    $scope.format = {};
    $scope.formats = [
      'XML',
      'JSON',
      'CSV'
    ];

  }).
  controller('SearchController', function ($scope) {

    $scope.selected = undefined;

    $scope.clear = function () {
      $scope.selected = undefined;
    }

    $scope.search = function (apk) {
      // TODO: Display page for individual APK
    };

  }).
  controller('ModalController', function ($scope, $modal, $log, ApkService) {

    // Opens the modal window

    $scope.open = function () {

      var modalInstance = $modal.open({
        templateUrl: 'partials/advanced',
        controller: 'ModalInstanceController',
        resolve: {} 
      });

      // Filter the APK table with the advanced serach results

      modalInstance.result.then(function (params) {
        ApkService.search.query(params, function (response) {
          $scope.$emit('filterApks', response);
        });
      });
    };

  }).
  controller('ModalInstanceController', function ($scope, $modalInstance) {

    $scope.filter = {
      name: undefined,
      version: undefined,
      developer: undefined,
      genre: {},
      userRatingFrom: undefined,
      userRatingTo: undefined,
      releaseDateFrom: undefined,
      releaseDateTo: undefined,
      fileSizeFrom: undefined,
      fileSizeTo: undefined,
      fileSizeFromUnit: 'M',
      fileSizeToUnit: 'M'
    };

    $scope.search = function () {
      $modalInstance.close({
        name: $scope.filter.name, 
        version: $scope.filter.version, 
        developer: $scope.filter.developer, 
        genre: $scope.filter.genre.selected,
        userRatingFrom: $scope.filter.userRatingFrom,
        userRatingTo: $scope.filter.userRatingTo,
        releaseDateFrom: $scope.filter.releaseDateFrom,
        releaseDateTo: $scope.filter.releaseDateTo,
        fileSizeFrom: $scope.filter.fileSizeFrom,
        fileSizeTo: $scope.filter.fileSizeTo,
        fileSizeFromUnit: $scope.filter.fileSizeFromUnit,
        fileSizeToUnit: $scope.filter.fileSizeToUnit
      });
    };

    $scope.setUnit = function (bound, unit) {
      if (bound == 'from') {
        $scope.filter.fileSizeFromUnit = unit;
      }
      else if (bound == 'to') {
        $scope.filter.fileSizeToUnit = unit;
      }
    };

  }).
  controller('GenreInputController', function ($scope, ApkService) {

    $scope.clear = function () {
      $scope.filter.genre.selected = undefined;
    };

    // Get list of genres from APK info in the database

    ApkService.genres.query(function (response) {
      $scope.genres = [];
      for (var i = 0; i < response.length; i++) {
        $scope.genres.push(response[i].Genre);
      }
    });

  }).
  controller('DateInputController', function ($scope) {

    $scope.dt = new Date();

    $scope.clear = function () {
      $scope.dt = null;
    };

    $scope.open = function ($event) {
      $event.preventDefault();
      $event.stopPropagation();

      $scope.opened = true;
    };

  });
