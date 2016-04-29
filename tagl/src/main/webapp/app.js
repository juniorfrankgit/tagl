var app = angular.module('app',[]);

app.controller('Ctrl',['$scope', '$http',function($scope, $http) {
	$scope.student = {};
	var url = "http://localhost:8080/tagl/MainServlet";
	var config = {
        headers : {
            'Content-Type': 'application/json;charset=utf-8;'
        }
     };
     var data = {};

	$scope.request = function(){
		data = JSON.stringify($scope.student);
 	 	console.log(data);
		$http.post(url, data, config).then(function(response){
			//success

		}).then(function(response){
			//error
		});
	};
}]);