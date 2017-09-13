var playerApp = angular.module('player', []);

playerApp.factory('playersData', ['$http', function($http){
  var playersData ={
    playerDetail: function() {
      return $http(
      {
        url: "/api/players",
        method: "GET",
      })
      .then(function (response) {
        return response.data;
        });
      }
    };
    return playersData;

}]);

playerApp.controller('home', ['$http', '$scope', 'playersData', function($http, $scope, playersData) {
	playersData.playerDetail().then(function(response) {
		$scope.players = response;
		console.log(response);
	})

	$scope.select = function(item) {
      console.log('/api/players/' + item);
      $scope.selected = $http({
            url: "/api/players/" + item,
            method: "GET",
          })
          .then(function (response) {
            $scope.selected = response.data;
          });
    }
    $scope.selected = {};
}]);
