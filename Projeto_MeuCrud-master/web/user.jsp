<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css"
              href="css/estilo.css"rel="stylesheet" />
        
        <title>Adicionar Usuário</title>
    </head>
    <body>
        <div class="centralizar">
        <form method="POST" action='UserController' name="frmAddUser">
            CPF : <input type="text"  name="CPF"                       
                value="<c:out value="${user.CPF}" />" /> <br /> 
            
            Nome : <input type="text" name="nome"
                value="<c:out value="${user.nome}" />" /> <br /> 
            
            Sexo : <input type="text" name="sexo"
                value="<c:out value="${user.sexo}" />" /> <br />
            
            Salário : <input type="text" name="salario"
                value="<c:out value="${user.salario}" />" /> <br />
            <input type="submit" value="Submit" />
        </div>
    </body>
</html>