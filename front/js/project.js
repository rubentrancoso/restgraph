angular.module('project', ['ngRoute'])
 
.service('Projects', function($http) {
  
})
 
.config(function($routeProvider) {
 
  $routeProvider
    .when('/', {
      controller:'ProjectController as projectCtrl',
      templateUrl:'templates/list.html'
    })
    .otherwise({
      redirectTo:'/'
    });
})
 
.controller('ProjectController',
  function($scope, $http) {
    var url = "http://192.241.130.162:8080/api/hello/folks";

    $http.get(url)
    .then(function(response) {
        $scope.content = response.data;
        $scope.statuscode = response.status;
        $scope.statustext = response.statusText; 
    });
});
