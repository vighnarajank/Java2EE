<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- This is JSP Comment --%>
<%
Date d = new Date();
String date = d.toString();
%>
Current Date and Time is : 
<%=date %>
</body>
</html>