<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
<!-- name will be same as User.java variables -->
	<h3 class="text-center"> ${ Header }</h3>
    <p class="text-center"> ${Desc} </p>
	<h3>Your form data has been submitted successfully</h3>
	<h2>Entered Name : ${user.username} </h2>
	<h2>Entered Email: ${user.email} </h2>
	<h2>Entered Password : ${user.userpassword} </h2>
</body>
</html>
