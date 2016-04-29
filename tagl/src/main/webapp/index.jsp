<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html ng-app="app">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular.min.js" ></script>
        <script type="text/javascript" src="app.js"></script>

        <h1 style="text-align:center">This app uses Redis services to store and load data from server</h1>
        <h2 style="text-align:center">Student informations</h2>

            <form  style="text-align:center" id="studentForm" ng-controller="Ctrl">
        	    
                <label>Name </label><input type="text"ng-model="student.name"/><br/>
        	    <label>Firstname </label><input type="text" ng-model="student.firstname"/><br/>
        	    <label>Age </label><input type="text" name="age" ng-model="student.age"/><br/>
        	    <label>Student number </label><input type="text" ng-model="student.number"/><br/> 
    			<input type="button" value="SEND" ng-click="request()"/>
            
            </form>
    </body>
</html>
