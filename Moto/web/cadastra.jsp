<jsp:include page="includes/topo.jsp"/>
<%@page import="br.edu.fescfafic.controller.ControlaMoto" %>
    <center>
        <h1>Cadastro de Moto</h1>
        <form action="ControlaMoto" method="post">
            Marca<br><input name="marca"><br>
            Cor<br><input name="cor"><br>
            <input name="enviar" type="submit" value="Enviar">
        </form>
    </center>
    </body>
</html>
