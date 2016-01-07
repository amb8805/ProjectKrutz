'use strict';

/* Controllers */

angular.module('androidApp.controllers', []).
  controller('AppController', function ($scope, $location, $window, $filter, ApkService) {

    // Get the total number of applications analyzed
    ApkService.apkCount.get(function (count) {
      $scope.apkCount = count.TotalCount;
    });

    // Chart colors
    $scope.chartColors = [
      '#99cc00',
      '#33b5e5',
      '#aa66cc',
      '#ff4444',
      '#ffbb33'
    ];

    // If more than 5 colors are needed, begin again at the first color
    $scope.getColorForIndex = function (index) {
      return $scope.chartColors[index % $scope.chartColors.length];
    };

    // Helper function that returns a tint for the given color
    $scope.getHue = function (color, amount) {

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

    };

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

    // Load the data for the charts
    if (ApkListService.topApks && ApkListService.topGenres && ApkListService.versionGroupAvgs) {

      $scope.topApks = ApkListService.topApks;
      $scope.topGenres = ApkListService.topGenres;
      $scope.versionGroupAvgs = ApkListService.versionGroupAvgs;

    } else {

      $scope.chartsLoading = true;

      ApkService.topApks.query(function (topApks) {
        ApkListService.topApks = topApks;
        $scope.topApks = topApks;

        ApkService.topGenres.query(function (genres) {
          ApkListService.topGenres = genres;
          $scope.topGenres = genres;

          ApkService.versionGroupAvgs.get(function (averages) {
            ApkListService.versionGroupAvgs = averages;
            $scope.versionGroupAvgs = averages;
            
          });
        });
      });

    }

    // When the list of top APKs loads, create the respective chart
    $scope.$watch('topApks', function () {

      if ($scope.topApks) {

        $scope.segments = [];

        for (var i = 0; i < $scope.topApks.length; i++) {

          var segment = {
            label: $scope.topApks[i].Name,
            value: $scope.topApks[i].OverPrivCount,
            color: $scope.getColorForIndex(i),
            highlight: $scope.getHue($scope.getColorForIndex(i), 10)
          };

          $scope.segments.push(segment);

        }
      }

    });

    // When the list of top overprivileged genres loads, create the respective chart
    $scope.$watch('topGenres', function () {

      if ($scope.topGenres) {
        
        var labels = [];
        var dataValues = [];

        for (var i = 0; i < $scope.topGenres.length; i++) {
          labels.push($scope.topGenres[i].Genre);
          dataValues.push($scope.topGenres[i].AtLeastXOverPrivPercentage);
        }

        $scope.barChartData = {
          labels: labels,
          datasets: [
            {
              fillColor: $scope.getColorForIndex(0),
              strokeColor: $scope.getHue($scope.getColorForIndex(0), -20),
              highlightFill: $scope.getHue($scope.getColorForIndex(0), 10),
              highlightStroke: $scope.getHue($scope.getColorForIndex(0), -10),
              data: dataValues
            }
          ]
        };

      }

      // When the list of average overpermissions by version group loads, create the respective chart
      $scope.$watch('versionGroupAvgs', function () {

        if ($scope.versionGroupAvgs) {

          var labels = ['0', '1', '2', '3', '4', '5'];
          var datasets = [];
          var j = 0;

          for (var genre in $scope.versionGroupAvgs) {

            if ($scope.versionGroupAvgs.hasOwnProperty(genre) && $scope.versionGroupAvgs[genre] instanceof Array) {

              var dataValues = [];
              for (var i = 0; i < 6; i++) {
                dataValues.push($scope.versionGroupAvgs[genre][i].OverPrivCount);
              }

              var dataset = {
                label: $scope.versionGroupAvgs[genre][0].Genre,
                fillColor: 'rgba(255, 255, 255, 0)',
                strokeColor: $scope.getColorForIndex(j),
                pointColor: $scope.getColorForIndex(j),
                pointStrokeColor: '#fff',
                pointHighlightFill: '#fff',
                pointHighlightStroke: $scope.getColorForIndex(j),
                data: dataValues
              };

              datasets.push(dataset);
              j++;

            }

          }
          
          $scope.chart3Data = {
            labels: labels,
            datasets: datasets
          };

          // The data for all three charts has been created
          $scope.chartsLoading = false;

        }

      });

    });

    // When all data has been fetched from the database, render the charts
    $scope.$watch('chartsLoading', function () {

      // Chart #1
      if ($scope.segments) {

        var chartOptions1 = {
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
        var canvas1 = document.getElementById('chart1');
        var chart1 = new Chart(canvas1.getContext('2d')).Doughnut($scope.segments, chartOptions1);
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

        canvas1.parentNode.parentNode.lastChild.appendChild(legendHolder.firstChild);

      }

      // Chart #2
      if ($scope.barChartData) {

        var chartOptions2 = {
          animationSteps: 100,
          responsive: true,
          maintainAspectRatio: false,
          scaleShowGridLines: false,
          tooltipTemplate: '<%=label%>: <%= value %>%'
        };

        var canvas2 = document.getElementById('chart2');
        var chart2 = new Chart(canvas2.getContext('2d')).Bar($scope.barChartData, chartOptions2);
        
      }

      // Chart #3
      if ($scope.chart3Data) {

        var chartOptions3 = {
          animationSteps: 100,
          responsive: true,
          maintainAspectRatio: false,
          scaleShowGridLines: false,
          scaleBeginAtZero: true,
          multiTooltipTemplate: '<%=datasetLabel %>: <%= value %>'
        };

        var canvas3 = document.getElementById('chart3');
        var chart3 = new Chart(canvas3.getContext('2d')).Line($scope.chart3Data, chartOptions3);

      }

    });

  }).
  controller('ApkDetailController', function ($scope, $routeParams, ApkService) {

    // Is the data from the database currently loading?
    $scope.detailViewLoading = true;

    // Get the singluar APK object to display
    ApkService.apk.get({ rowid: $routeParams.apkId }, function (apk) {
      $scope.apk = apk;

      ApkService.filter.query({ name: apk.Name, developer: apk.Developer, sort: 'apk.Version, apk.ModifiedDatePublished' }, function (apks) {
        $scope.allVersionsOfApk = apks;
        $scope.detailViewLoading = false;
      })
    });

    // Create the data for the "Comparison to Other Versions" chart
    $scope.$watch('allVersionsOfApk', function () {

      if ($scope.allVersionsOfApk) {

        var labels = ['Coding Standard Violations', 'Androrisk Score', 'Java Files (in tens)', 'Defect Count (in tens)', 'Overpermissions', 'Underpermissions'];
        var datasets = [];

        for (var i = 0; i < $scope.allVersionsOfApk.length; i++) {

          var a = $scope.allVersionsOfApk[i];

          var dataset = {
            label: a.Version == 'Varies with device' ? a.DatePublished : a.Version,
            fillColor: $scope.getColorForIndex(i),
            strokeColor: $scope.getHue($scope.getColorForIndex(i), -20),
            highlightFill: $scope.getHue($scope.getColorForIndex(i), 10),
            highlightStroke: $scope.getHue($scope.getColorForIndex(i), -10),
            data: [a.DefectCount, a.FuzzyRiskValue, a.JavaFiles / 10, a.JlintResult / 10, $scope.apk.Overpermissions.length, $scope.apk.Underpermissions.length]
          };

          datasets.push(dataset);

        }

        $scope.barChartData = {
          labels: labels,
          datasets: datasets
        };

      }

      // When all data has finished loading, render the "Comparison to Other Versions" chart
      $scope.$watch('detailViewLoading', function () {

        if ($scope.barChartData) {

          var chartOptions = {
            animationSteps: 100,
            responsive: true,
            maintainAspectRatio: false,
            scaleShowGridLines: false,
            multiTooltipTemplate: '<%=datasetLabel %>: <%= value %>'
          };

          var canvas = document.getElementById('apkDetailChart');
          var chart = new Chart(canvas.getContext('2d')).Bar($scope.barChartData, chartOptions);

        }

      });

    });

  }).
  controller('DataController', function ($scope, $sce, $location, $window, ApkService, ApkListService) {

    // Helper function to sort the table of APKs based on column and sort order
    var compareApks = function (sort) {
      return function (a, b) {
        var result = (a[sort.column] < b[sort.column]) ? -1 : (a[sort.column] > b[sort.column]) ? 1 : 0;
        return result * sort.sortOrder;
      }
    };

    // Load the data for the table
    if (ApkListService.apks) {
      $scope.displayedApks = ApkListService.filteredApks;
    } else {
      $scope.dataViewLoading = true;

      ApkService.apks.query(function (apks) {
        ApkListService.apks = apks;
        ApkListService.filteredApks = apks;
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
    $scope.sort = ApkListService.sort;

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
      }
    ];

    // Update pagination when the APK list has loaded
    $scope.$watch('displayedApks', function () {
      if ($scope.displayedApks) {
        $scope.totalItems = $scope.displayedApks.length;
      }
    });

    // When the APK list is filtered, update the list
    $scope.$on('filterApks', function (event, filteredApks) {

      if (ApkListService.sort.column) {
        filteredApks.sort(compareApks(ApkListService.sort));
      }

      $scope.displayedApks = filteredApks;
      ApkListService.filteredApks = filteredApks;

    });

    // Used to avoid an error with the ui-select component
    $scope.trustAsHtml = function (value) {
      return $sce.trustAsHtml(value);
    };

    // When a table row is selected, display the page for that individual APK
    $scope.selectTableRow = function () {
      $location.path('analytics/' + this.apk.rowid);
    };

    // Determine which icon to display based on sort order
    $scope.getSortIconClass = function (column) {
      return $scope.sort.column == column && $scope.sort.sortOrder == 1 ? 'fa-caret-down' : 'fa-caret-up';
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

      ApkListService.sort = sort;

      $scope.displayedApks.sort(compareApks(sort));

    };

  }).
  controller('FilterController', function ($scope, $filter, ApkListService, SearchService) {

    // Retrieve the filter term currently entered by the user
    $scope.search = SearchService.search;

    // Clears the current search
    $scope.clearSearch = function () {
      $scope.search = undefined;
      $scope.change();
    };
    
    // Filter the displayed table of APKs
    $scope.change = function () {
      SearchService.changeSearchQuery($scope.search);
      var filteredApks = $filter('filter')(ApkListService.apks, { Name: $scope.search });
      $scope.$emit('filterApks', filteredApks);
    };

  }).
  controller('ModalController', function ($scope, $modal, $log, ApkService, ApkListService) {

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
          ApkListService.sort.column = '';
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

  }).
  controller('ReportsController', function ($scope, $window) {
    // empty controller
  }).
  controller('ExploreDataController', function($scope, $http, $sce){

        $scope.trustedHTML = function(html){
            return $sce.trustAsHtml(html);
        };

        $scope.executeQuery = function(){

            if ($scope.query !== undefined) {
                $http.get('http://127.0.0.1:8080/process-query/' + $scope.query).success(function (response){
                    var lines = [];
                    var headers = [];

                    var line = '<table class="table">';

                    $scope.content = undefined;

                    line = line + '<tr>';

                    for(var property in response[0]){
                        if(response[0].hasOwnProperty(property)){
                            headers.push(property);
                            line = line + '<td class="query-table-header-elem">' + property + '</td>';
                        }
                    }

                    line = line + '</tr>';

                    for(var i = 0; i < response.length; i++){
                        line = line + '<tr>';

                        for(var u = 0; u < headers.length; u++){
                            line =  line + '<td>' + response[i][headers[u]] + '</td>';
                        }

                        line = line + '</tr>';

                        if((i + 1) == response.length){
                          line = line + '</table>';
                        }

                        lines.push(line);
                        line = '';
                    }
                    $scope.content = String(lines.join(""));
                });
            }
        }
 });