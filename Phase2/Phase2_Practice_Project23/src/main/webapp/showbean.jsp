<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>SHOW BEAN </title>
</head>
<body>
    <h1>SHOW BEAN</h1>
    <jsp:useBean id="product" class="com.example.ProductBean" scope="session"/>
    <jsp:setProperty name="product" property="name" value="MOBILE"/>
    <jsp:setProperty name="product" property="price" value="200"/>
    <p>Product Name: <jsp:getProperty name="product" property="name"/></p>
    <p>Product Price: $<jsp:getProperty name="product" property="price"/></p>
</body>
</html>