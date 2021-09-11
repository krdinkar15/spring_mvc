<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello Title</title>
</head>
<body>
<h1>Hello Peter</h1>
<h2>This is home page</h2>
<%
	String name=(String) request.getAttribute("name");
	Integer empId=(Integer) request.getAttribute("Empid");
	List<String> friends= (List<String>) request.getAttribute("f");
%>
<h1>Name is <%=name %> </h1>
<h1> Employee ID <%=empId %></h1>
<%
	for(String s:friends)
	{
%>
		<h4><%=s %></h4>
<%
	}
%>
</body>
</html>