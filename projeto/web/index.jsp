
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN</title>
        <link rel="stylesheet" type="text/css" href="css/estilos.css">
            
    </head>
    
    <body>

        <form action="LogarPsicologo" method="post">   

            <div id="login">

                <div id="login-interno">
                    
                    <div id="login-titulo">
                        Login Psicologo                       
                    </div>

                    <div class="input-div" id="input-usuario">
                        <input autocomplete="on" type="text" name="login" placeholder="Login" maxlength="15" size="15">
                    </div>

                    <div class="input-div" id="input-senha">
                        <input type="password" name="senha" placeholder="Senha" maxlength="15" size="15">
                    </div>

                    <div id="botoes">
                        <div id="botao">
                            <input name="Login" type="submit" value="Login">
                        </div>
                        
                        <div id="cadastrar">
                            <a href="">CADASTRE-SE AQUI</a>
                        </div>
                    </div>
                    
                </div>
                
            </div> 
            
        </form>

    </body>
</html>
