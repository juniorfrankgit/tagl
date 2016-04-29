var student = {"nom":"Ngassam", "prenom":"Frank"};
var http = new XMLHttpRequest();
var url = "http://localhost:8080/tagl/MainServlet/?student=Frank";

var request = function(){
		http.onreadystatechange = function() {
			if(http.readyState == 4 && http.status == 200){
				console.log("success!");
			}
		};
	
		http.open('POST', url, true);
		http.setRequestHeader("Content-type", "application/json");
		//http.send('student='+JSON.stringify(student));
		http.send();
		console.log(JSON.stringify(student));
};


