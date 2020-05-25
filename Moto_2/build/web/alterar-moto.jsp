<%@page import="br.edu.fescfafic.model.Moto"%>
<jsp:include page="includes/topo.jsp"/>
<link rel="stylesheet" type="text/css" href="css/estilo-C-A.css">

        <center>
            
            <h2><a href="index.jsp">Index</a> </h2>
            <h2><a href="cadastra.jsp">Cadastro de Motos</a></h2>
            <h2><a href="./ListMoto">Listar Motos</a></h2>
            
        </center>

        <form action="AlterarMoto" method="post">   

            <div id="cadastro">

                <div id="cadastro-interno">

                    <div id="cadastro-titulo">
                        Atualizar Dados
                    </div>

                    <div id="input">
                        <input required="true" autocomplete="on" type="text" name="marca" value="${param.marca}">
                    </div>

                    <div id="input">
                        <input required="true" autocomplete="on" type="text" name="cor" value="${param.cor}">
                    </div>

                    <input type="hidden" name="id" value="${param.id}">

                    <div id="botoes">

                        <div id="botao">
                            <input name="atualizar" type="submit" value="ATUALIZAR">
                        </div>   

                    </div>
                </div>
            </div>  

        </form>
                 
    </body>
</html>
