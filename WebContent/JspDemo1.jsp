<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		out.print("Hello");
	%>
	<%
		int age=10;
		out.print("age = "+age);
	%>
	<%!int count=0; %>
	
	<%
		count++;
		out.print("count = "+count);
	%>
	
	<%! String name = "royal"; %>
	<%=name %>
	
	

</body>
</html>