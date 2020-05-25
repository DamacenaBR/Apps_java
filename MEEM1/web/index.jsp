<jsp:include page="includes/topo.jsp"/>
<link rel="stylesheet" type="text/css" href="css/estilo-login.css">


    <div id="barra_horizontal_topo">
        <img id="logo_psicologia" src="imagens/psicologia_icone.png" width="40" height="40"/>
        <h3>Mini Exame do Estado Mental</h3>
    </div>
    
    
     <form action="LogarPsicologo" method="post">   

            <div id="login">

                <div id="login-interno">
                    
                    <div id="login-titulo">
                        Login Psicologo                       
                    </div>

                    <div class="input-div" id="input-usuario">
                        <input required="true" autocomplete="on" type="text" name="login" placeholder="Login" minlength="6" maxlength="15" size="15">
                    </div>

                    <div class="input-div" id="input-senha">
                        <input  required="true" type="password" name="senha" placeholder="Senha" minlength="8" maxlength="15" size="15">
                    </div>

                    <div id="botoes">
                        <div id="botao">
                            <input name="Login" type="submit" value="Login">
                        </div>
                        
                        <div id="cadastrar">
                            <a href="cadastro-psicologo.jsp">CADASTRE-SE AQUI</a>
                        </div>
                    </div>
                    
                </div>
                
            </div> 
         
         
            <%
                String mensagem = (String) request.getAttribute("mensagem");
                out.print(mensagem);

            %>
            
        </form>
    </body>
</html>
