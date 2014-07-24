'use strict';

/* Directives */

angular.module('androidApp.directives', []).
  directive('appVersion', function (version) {

    return function(scope, elm, attrs) {
      elm.text(version);
    };

  }).
  directive('loadingSpinner', function () {

  	return {
  		restrict: 'A',
  		replace: true,
  		transclude: true,
  		scope: {
  			loading: '=loadingSpinner'
  		},
  		templateUrl: 'partials/loading',
  		link: function(scope, element, attrs) {
  			var spinner = new Spinner().spin();
  			var loadingContainer = element.find('.loading-spinner-container')[0];
        loadingContainer.appendChild(spinner.el);
  		}
  	};

  });
