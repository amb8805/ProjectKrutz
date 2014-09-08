'use strict';

/* Controllers */

angular.module('androidApp.controllers', []).
  controller('AppController', function ($scope, $location, $window, $filter) {

    // Logic for navbar
    $scope.isCollapsed = true;

    // When a navbar link is clicked, return to the top of the page
    $scope.$on('$routeChangeSuccess', function () {
      $scope.isCollapsed = true;
      $window.scrollTo(0, 0);
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
    
  }).
  controller('HomeController', function ($scope, ApkService, ApkListService) {

    if (ApkListService.topApks) {
      $scope.topApks = ApkListService.topApks;
    } else {
      $scope.chartsLoading = true;

      ApkService.topApks.query(function (topApks) {
        ApkListService.topApks = topApks;
        $scope.topApks = topApks.slice(0, 5);
        $scope.chartsLoading = false;
      });
    }

    // Chart colors
    var colors = [
      '#33b5e5',
      '#aa66cc',
      '#99cc00',
      '#ffbb33',
      '#ff4444'
    ];

    // Helper function that returns a tint for the given color
    var getHighlight = function (color, amount) {

      var usePound = false;

      if (color[0] == '#') {
        color = color.slice(1);
        usePound = true;
      }

      var num = parseInt(color, 16);
      var r = (num >> 16) + amount;

      if (r > 255) r = 255;
      else if  (r < 0) r = 0;

      var b = ((num >> 8) & 0x00ff) + amount;

      if (b > 255) b = 255;
      else if  (b < 0) b = 0;

      var g = (num & 0x0000ff) + amount;

      if (g > 255) g = 255;
      else if (g < 0) g = 0;

      return (usePound ? '#' : '') + (g | (b << 8) | (r << 16)).toString(16);

    }

    // When the list of top APKs loads, create the chart
    $scope.$watch('topApks', function () {
      if ($scope.topApks) {
        $scope.segments = [];
        for (var i = 0; i < $scope.topApks.length; i++) {
          var segment = {
            label: $scope.topApks[i].Name,
            value: $scope.topApks[i].Overpermissions.length,
            color: colors[i],
            highlight: getHighlight(colors[i], 10)
          };
          $scope.segments.push(segment);
        }
      }
    });

    // When all data has been fetched from the database, render the chart
    $scope.$watch('chartsLoading', function () {
      if ($scope.segments) {
        $scope.options =  {
          animation: true,
          animationSteps: 100,
          animationEasing: 'easeOutBounce',
          animateRotate: true,
          animateScale: false,
          responsive: true,
          maintainAspectRatio: true,
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

        canvas.parentNode.parentNode.lastChild.appendChild(legendHolder.firstChild);
      }
    });

  }).
  controller('ApkDetailController', function ($scope, $routeParams, ApkService) {

    // Is the data from the database currently loading?
    $scope.detailViewLoading = true;

    // Get the singluar APK object to display
    ApkService.apk.query({rowid: $routeParams.apkId}, function (response) {
      $scope.apk = response;
      $scope.detailViewLoading = false;
    });

  }).
  controller('DataController', function ($scope, $sce, $location, $window, ApkService, ApkListService) {

    // When the APK list is filtered, update the list
    $scope.$on('filterApks', function (event, filteredApks) {
      $scope.displayedApks = filteredApks;
    });

    if (ApkListService.apks) {
      $scope.displayedApks = ApkListService.apks;
    } else {
      $scope.dataViewLoading = true;

      ApkService.apks.query(function (apks) {
        ApkListService.apks = apks;
        $scope.displayedApks = apks;
        $scope.dataViewLoading = false;
      });
    }

    // Pagination
    $scope.totalItems = 1;
    $scope.currentPage = 1;
    $scope.itemsPerPage = 25;
    $scope.maxSize = 5;

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

    // Used to avoid an error with the ui-select component
    $scope.trustAsHtml = function (value) {
      return $sce.trustAsHtml(value);
    };

    // When a table row is selected, display the page for that individual APK
    $scope.selectTableRow = function () {
      $location.path('data/' + this.apk.rowid);
    };

    // Determine which icon to display based on sort order
    $scope.getSortIconClass = function (column) {
      return $scope.sort.sortOrder == 1 ? 'fa-caret-down' : 'fa-caret-up';
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

  }).
  controller('FilterController', function ($scope, $filter, ApkListService, SearchService) {

    $scope.search = SearchService.search;

    // Filter the displayed table of APKs
    $scope.change = function () {
      SearchService.changeSearchQuery($scope.search);
      var filteredApks = $filter('filter')(ApkListService.apks, {Name: $scope.search});
      $scope.$emit('filterApks', filteredApks);
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
        ApkService.filter.query(params, function (response) {
          $scope.$emit('filterApks', response);
        });
      });

    };

  }).
  controller('ModalInstanceController', function ($scope, $modalInstance) {

    // Define the filter parameters
    $scope.filter = {
      name: undefined,
      version: undefined,
      developer: undefined,
      genre: {},
      userRatingFrom: undefined,
      userRatingTo: undefined
    };

    // Serve filter parameters to the modal instance
    $scope.search = function () {

      $modalInstance.close({
        name: $scope.filter.name, 
        version: $scope.filter.version, 
        developer: $scope.filter.developer, 
        genre: $scope.filter.genre.selected,
        userRatingFrom: $scope.filter.userRatingFrom,
        userRatingTo: $scope.filter.userRatingTo
      });

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

  });
