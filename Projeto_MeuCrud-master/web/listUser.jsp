<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link type="text/css"
              href="css/estilo.css"rel="stylesheet" />
<title>Todos Usuários</title>
</head>
<body>
    <table border=1>
        <thead>
            <tr>
                <th>CPF</th>
                <th>Nome</th>               
                <th>Sexo</th>
                <th>Salário</th>
                <th colspan=2>Ação</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td><c:out value="${user.CPF}" /></td>
                    <td><c:out value="${user.nome}" /></td>                         
                    <td><c:out value="${user.sexo}" /></td>
                    <td><c:out value="${user.salario}" /></td>  

                    <td><a href="UserController?action=delete&CPF=<c:out value="${user.CPF}"/>">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <p><a href="UserController?action=insert">Adicionar novo  Usuário</a></p>
</body>
</html>