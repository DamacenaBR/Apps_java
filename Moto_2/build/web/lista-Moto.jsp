<jsp:include page="includes/topo.jsp"/>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" type="text/css" href="css/estilo-listar.css">
        <center>
            <h2><a href="index.jsp">Index</a> </h2>
            <h2><a href="cadastra.jsp">Cadastro de Motos</a></h2>  
        </center>

        
        <table>
            <caption>LISTA DE MOTOS</caption>
            
            <thead>
                <th>ID</th>
                <th>MARCA</th>
                <th>COR</th>
                <th>OPÇÃO</th>                 
            </thead>
            <tbody>
                 
            </tbody>
            <c:forEach items="${moto}" var="moto">

                <tr>
                    <td>${moto.id}</td>
                    <td>${moto.marca}</td>
                    <td>${moto.cor}</td>
                    <td><a href="alterar-moto.jsp?id=${moto.id}&cor=${moto.cor}&marca=${moto.marca}">EDITAR</a> /
                    <a href="./exluirMoto?id=${moto.id}">EXCLUIR</td>
                </tr>

            </c:forEach>
            </tbody>
            
        </table>
   
    </body>
</html>
