<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Motos</title>
    </head>
    <body>
    <center>
        <h1>Lista de Motos</h1>
        
        <ul>
        <c:forEach items="${motos}" var="moto">
            <li>${moto.marca}</li>
        </c:forEach>
            </ul>
    </center>
    </body>
</html>
