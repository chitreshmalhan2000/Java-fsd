<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <title>Test JSP IMPLICIT OBJECTS</title>
</head>
<body>
    <h1>Test JSP IMPLICIT OBJECTS</h1>
    <p>Current Date And Time: <%= new java.util.Date() %></p>
    <p>Client's IP Address: <%= request.getRemoteAddr() %></p>
    <p>User Agent: <%= request.getHeader("User-Agent") %></p>
</body>
</html>