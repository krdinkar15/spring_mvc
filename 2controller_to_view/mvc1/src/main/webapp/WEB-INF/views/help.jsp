<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help</title>
</head>
<body>
<h1>Hello Buddy , This is help page</h1>
<h3>New method of printing</h3>
<h3>Hello My name is ${ name }  and Roll No = ${ Roll } </h3>
<h2> Date and time is ${ time.toString() }  </h2>
<hr>
	<c:forEach var="item" items="${marks }">
	<!-- <h1>${item }</h1> -->
	<h1><c:out value="${item }"></c:out></h1>
	</c:forEach>
</body>
</html>