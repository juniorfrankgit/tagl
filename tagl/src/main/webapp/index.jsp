<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="">
        <title>Welcome</title>
    </head>
    <body>
        <script type="text/javascript" src="student.js"></script>
        <h1 style="text-align:center">This app uses Redis services to store and load data from server</h1>
        <h2 style="text-align:center">Student informations</h2>

        <form  style="text-align:center" method="POST" action="MainServlet">
        	<label>Name </label><input type="text"/><br/>
        	<label>Firstname </label><input type="text"/><br/>
        	<label>Age </label><input type="text"/><br/>
        	<label>Student number </label><input type="text"/><br/>
        	<label>Courses</label>
        	<input type="checkbox" name="tagl" value="tagl">TAGL<br>
    			<input type="checkbox" name="cse" value="cse">CSE<br>
    			<input type="checkbox" name="slpc" value="slpc">SLPC<br>
    			<input type="checkbox" name="ro" value="ro">RO<br>
    			<input type="checkbox" name="tli" value="tli">TLI<br>
    			<input type="checkbox" name="arc" value="arc">ARC<br>
    			<input type="checkbox" name="atd" value="atd">ATD<br>
    			<input type="checkbox" name="alr" value="alr">ALR<br>
    			<label>Hobbies </label>
        	<input type="checkbox" name="soccer" value="soccer">SOOCER<br>
    			<input type="checkbox" name="basket" value="basket">BASKET<br>
    			<input type="checkbox" name="running" value="running">RUNNING<br>
    			<input type="checkbox" name="music" value="music">MUSIC<br>
    			<input type="submit" value="SEND"/>
        </form>
    </body>
</html>
