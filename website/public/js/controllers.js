'use strict';

/* Controllers */

angular.module('androidApp.controllers', []).
  controller('AppController', function ($scope, $location, $window, $anchorScroll, ApkService) {

    // Is the data from the database currently loading?
    $scope.viewLoading = true;

    // Logic for navbar
    $scope.isCollapsed = true;

    // Get APK data from the database
    ApkService.apks.query(function (response) {
      $scope.apks = response;
      $scope.viewLoading = false;
    });

    // ApkService.permissions.query(function (response) {
    //   $scope.permissions = response;
    // });

    // Logic for navbar and routing
    $scope.getNavItemClass = function (path) {
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

    // When the APK list is filtered, update the list
    $scope.$on('filterApks', function (event, data) {
      $scope.apks = data;
    });

    // When a navbar link is clicked, return to the top of the page
    $scope.$on('$routeChangeSuccess', function () {
      $scope.isCollapsed = true;
      $window.scrollTo(0,0);
    });
    
  }).
  controller('HomeController', function ($scope) {

    $scope.segments = [
      {
        label: 'Gmail',
        value: 3,
        color: '#33b5e5'
      },
      {
        label: 'Maps',
        value: 4,
        color: '#aa66cc'
      },
      {
        label: 'Facebook',
        value: 10,
        color: '#99cc00'
      },
      {
        label: 'Google Play Books',
        value: 0,
        color: '#ffbb33'
      },
      {
        label: 'Google Search',
        value: 2,
        color: '#ff4444'
      }
    ];

    $scope.options =  {
        segmentShowStroke: true,
        segmentStrokeColor: '#fff',
        segmentStrokeWidth: 5,
        percentageInnerCutout: 50,
        animation: true,
        animationSteps: 100,
        animationEasing: 'easeOutBounce',
        animateRotate: true,
        animateScale: false,
        responsive: false,
        showTooltips: true,
        tooltipEvents: ['mousemove', 'touchstart', 'touchmove'],
        tooltipFillColor: 'rgba(0, 0,0 , 0.75)',
        tooltipFontFamily: '"Roboto", "Helvetica Neue", "Helvetica", "Arial", sans-serif',
        tooltipTemplate: '<%if (label){%><%=label%>: <%}%><%= value %>',
        legendTemplate: "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<segments.length; i++){%><li><span style=\"background-color:<%=segments[i].fillColor%>\"></span><%if(segments[i].label){%><%=segments[i].label%><%}%></li><%}%></ul>",
        onAnimationComplete: null
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

    // Selected download format and all available formats
    $scope.format = {};
    $scope.formats = [
      'XML',
      'JSON',
      'CSV'
    ];

    // The current table sort
    $scope.sort = {
      column: '',
      sortOrder: 1
    };

    // Table columns, with a display label and object property for each
    $scope.tableColumns = [
      {
        id: 'Name',
        label: 'Name'
      },
      {
        id: 'Version',
        label: 'Version'
      },
      {
        id: 'Developer',
        label: 'Developer'
      },
      {
        id: 'Genre',
        label: 'Genre'
      },
      {
        id: 'UserRating',
        label: 'User Rating'
      },
      {
        id: 'DatePublished',
        label: 'Release Date'
      },
      {
        id: 'FileSize',
        label: 'File Size'
      }
    ];

    // Update pagination when the APK list has loaded
    $scope.$watch('apks', function () {
      if ($scope.apks) {
        $scope.totalItems = $scope.apks.length;
      }
    });

    // Sort the table according to the given column and current sort
    $scope.sortTable = function (column) {
      var sort = $scope.sort;
      if (sort.column == column) {
          sort.sortOrder = sort.sortOrder * -1;
        } else {
          sort.column = column;
          sort.sortOrder = 1;
        }
      $scope.apks.sort(function (a, b) {
        var result = (a[column] < b[column]) ? -1 : (a[column] > b[column]) ? 1 : 0;
        return result * sort.sortOrder;
      });
    };

    // Determine which icon to display based on sort order
    $scope.getSortIconClass = function (column) {
      return $scope.sort.sortOrder == 1 ? 'fa-caret-down' : 'fa-caret-up';
    };

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

    // Get list of genres from APK info in the database
    ApkService.genres.query(function (response) {
      $scope.genres = [];
      for (var i = 0; i < response.length; i++) {
        $scope.genres.push(response[i].Genre);
      }
    });

    $scope.clear = function () {
      $scope.filter.genre.selected = undefined;
    };

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
