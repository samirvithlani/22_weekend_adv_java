<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!int age =9; %>
<%
	if(age>=18){
		out.print("valid...");
	}
	else{
		out.print("not valid..");
	}
%>
<%
	if(age>=18){%>
		<h1>Valid...</h1>	
	<%} else{%>
		<h1>not valid....</h1>
	<%} %>


</body>
</html>