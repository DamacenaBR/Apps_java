<jsp:include page="includes/topo.jsp"/>
<link rel="stylesheet" type="text/css" href="css/estilo-C-A.css">

        <center>
            
            <h2><a href="index.jsp">Index</a> </h2>
            <h2><a href="./ListMoto">Listar Motos</a></h2>
            
        </center>
        
        <form action="ControlaMoto" method="post">   

            <div id="cadastro">

                <div id="cadastro-interno">

                    <div id="cadastro-titulo">
                        Cadastro de Moto
                    </div>

                    <div id="input">
                        <input required="true" autocomplete="on" type="text" name="marca" placeholder="Marca">
                    </div>

                    <div id="input">
                        <input required="true" autocomplete="on" type="text" name="cor" placeholder="Cor">
                    </div>

                    <div id="botoes">

                        <div id="botao">
                            <input name="cadastrar" type="submit" value="CADASTRAR">
                        </div>   

                    </div>
                </div>
            </div>  

        </form>

    </body>
</html>
