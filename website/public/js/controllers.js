'use strict';

/* Controllers */

angular.module('androidApp.controllers', []).
  controller('AppController', function ($scope, $location, $window, $filter, ApkService) {

    // Determine navbar offset
    $scope.offset = $('#top').outerHeight();

    // Is the data from the database currently loading?
    $scope.viewLoading = true;

    // Logic for navbar
    $scope.isCollapsed = true;

    // Get APK data from the database
    ApkService.apks.query(function (response) {
      $scope.apks = response;
      $scope.displayedApks = $scope.apks;
      $scope.topApks = $filter('topApks')($scope.apks, 5);
      $scope.viewLoading = false;
    });

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
    $scope.$on('filterApks', function (event, filteredApks) {
      $scope.displayedApks = filteredApks;
    });

    // When a navbar link is clicked, return to the top of the page
    $scope.$on('$routeChangeSuccess', function () {
      $scope.isCollapsed = true;
      $window.scrollTo(0, 0);
    });
    
  }).
  controller('HomeController', function ($scope) {

    var colors = [
      {
        color: '#33b5e5',
        highlight: '#50C0e9'
      },
      {
        color: '#aa66cc',
        highlight: '#ba75dc'
      },
      {
        color: '#99cc00',
        highlight: '#a8d324'
      },
      {
        color: '#ffbb33',
        highlight: '#ffc641'
      },
      {
        color: '#ff4444',
        highlight: '#ff5f5f'
      }
    ];

    $scope.$watch('topApks', function () {
      if ($scope.topApks) {
        $scope.segments = [];
        for (var i = 0; i < $scope.topApks.length; i++) {
          var segment = {
            label: $scope.topApks[i].Name,
            value: $scope.topApks[i].Overpermissions.length,
            color: colors[i].color,
            highlight: colors[i].highlight
          };
          $scope.segments.push(segment);
        }
      }
    });

    $scope.$watch('viewLoading', function () {
      if ($scope.segments) {
        $scope.options =  {
          animation: true,
          animationSteps: 100,
          animationEasing: 'easeOutBounce',
          animateRotate: true,
          animateScale: false,
          responsive: false,
          segmentShowStroke: true,
          segmentStrokeColor: '#fff',
          segmentStrokeWidth: 5,
          percentageInnerCutout: 50,
          showTooltips: true,
          tooltipEvents: ['mousemove', 'touchstart', 'touchmove'],
          tooltipFillColor: 'rgba(0, 0,0 , 0.75)',
          tooltipFontFamily: '"Roboto", "Helvetica Neue", "Helvetica", "Arial", sans-serif',
          tooltipTemplate: '<%=label%>: <%= value %>'
        };

        var helpers = Chart.helpers;
        var canvas = document.getElementById('chart1');
        var chart1 = new Chart(canvas.getContext('2d')).Doughnut($scope.segments, $scope.options);
        var legendHolder = document.createElement('div');

        legendHolder.innerHTML = chart1.generateLegend();

        helpers.each(legendHolder.firstChild.childNodes, function (legendNode, index) {
          helpers.addEvent(legendNode, 'mouseover', function () {
            var activeSegment = chart1.segments[index];
            activeSegment.save();
            activeSegment.fillColor = activeSegment.highlightColor;
            chart1.showTooltip([activeSegment]);
            activeSegment.restore();
          });
        });

        helpers.addEvent(legendHolder.firstChild, 'mouseout', function () {
          chart1.draw();
        });

        canvas.parentNode.parentNode.appendChild(legendHolder.firstChild);
      }
    });

  }).
  controller('ApkDetailController', function ($scope, $routeParams, ApkService) {

    // Get the singluar APK object to display
    ApkService.apk.query({rowid: $routeParams.apkId}, function (response) {
      $scope.apk = response;
    });

  }).
  controller('DataController', function ($scope, $sce, $location, $window) {

    // Pagination
    $scope.totalItems = 1;
    $scope.currentPage = 1;
    $scope.itemsPerPage = 25;
    $scope.maxSize = 5;

    // Selected download format and all available formats
    $scope.fileFormat = {};
    $scope.fileFormats = [
      'SQLite'
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
    $scope.$watch('displayedApks', function () {
      if ($scope.displayedApks) {
        $scope.totalItems = $scope.displayedApks.length;
      }
    });

    // Download the data as the selected file format
    $scope.download = function (fileFormat) {
      if (fileFormat === 'SQLite') {
        // TODO: Download the .sqlite file here...
      }
    };

    // Sort the table according to the given column and current sort
    $scope.sortTable = function (column) {
      var sort = $scope.sort;
      if (sort.column == column) {
          sort.sortOrder = sort.sortOrder * -1;
        } else {
          sort.column = column;
          sort.sortOrder = 1;
        }
      $scope.displayedApks.sort(function (a, b) {
        var result = (a[column] < b[column]) ? -1 : (a[column] > b[column]) ? 1 : 0;
        return result * sort.sortOrder;
      });
    };

    // Determine which icon to display based on sort order
    $scope.getSortIconClass = function (column) {
      return $scope.sort.sortOrder == 1 ? 'fa-caret-down' : 'fa-caret-up';
    };

    // When a table row is selected, display the page for that individual APK
    $scope.selectTableRow = function () {
      $location.path('data/' + this.apk.rowid);
    };

    // Used to avoid an error with the ui-select component
    $scope.trustAsHtml = function (value) {
      return $sce.trustAsHtml(value);
    };

  }).
  controller('FilterController', function ($scope, $filter) {

    // Filter the displayed table of APKs
    $scope.$watch('search', function (newVal, oldVal) {
      var filteredApks = $filter('filter')($scope.apks, {Name: newVal});
      $scope.$emit('filterApks', filteredApks);
    });

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
        ApkService.filter.query(params, function (response) {
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
      } else if (bound == 'to') {
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

    // Clears the current selection
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
