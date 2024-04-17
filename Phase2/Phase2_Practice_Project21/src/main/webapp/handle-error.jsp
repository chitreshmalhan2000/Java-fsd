<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    Exception exception = (Exception) request.getAttribute("javax.servlet.error.exception");
    Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
%>
<!DOCTYPE html>
<html>
<head>
    <title>ERROR HANDLING</title>
</head>
<body>
    <h1>ERROR HANDLING</h1>
    <p>STATUS CODE: <%= statusCode %></p>
    <p>EXCEPTION TYPE: <%= exception != null ? exception.getClass().getName() : "N/A" %></p>
    <p>MESSAGE: <%= exception != null ? exception.getMessage() : "N/A" %></p>
</body>
</html>
    