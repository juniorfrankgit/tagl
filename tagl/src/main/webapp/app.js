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
	
	$scope.getStudent = function() {
		var url = "http://localhost:8080/tagl/MainServlet";
		var config = {
        	headers : {
            	'Content-Type': 'text/plain;charset=utf-8;'
        	},
        	params : {'studentNumber':$scope.studentNumber}
     	};
		$http.get(url,config).then(function(response){
			//success
			console.log("success");
		}, function(response) {
			console.log("error")
		});
	};
}]);