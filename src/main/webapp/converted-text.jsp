<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Week 4 Assessment</title>
</head>
<body>
	<h1>Mocking SpongeBob Text Generator</h1>
	<p><img src="https://i.kym-cdn.com/entries/icons/original/000/022/940/mockingspongebobbb.jpg" width="300"></p>
	<p><b>${text.getMockingText()}</b></p>
	<a href="index.jsp">Convert another!</a>
	
	<p>Would you like to know if this assessment is worthy of an A?
	<form action="getGradeOutlookServlet" method="post">
		<input type="radio" id="option1" name="userChoice" value="y">
  		<label for="option1">Yes</label><br>

		<input type="radio" id="option2" name="userChoice" value="n">
  		<label for="option2">No</label><br><br>

		<input type="submit" value="Submit">
	</form>
</body>
</html>