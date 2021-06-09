<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- Jasp comment --%>
<!-- HTML comment -->
<% out.println("A jsp file"); %>
<%! int num1=100,num2=200; %>
<%= num1*num2%>
<% Date d = new Date(); %>
<%= d.toString() %>
</body>
</html>