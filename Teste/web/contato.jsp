<%@page import="java.net.URLEncoder"%>
<%@include file="includes/topo.jsp" %>
    
    <%
    String var1 = "Contato";
    out.println(var1);
    
    String var = "Meu conte�do";
    String cont = URLEncoder.encode(var, "UTF-8");
    
    String var2 = "Principal";       
    %>
    
    <br><br>
    Ir para p�gina <a href="http://localhost:8080/Teste/?info=<%=var2%>">Principal</a>

    <br>
    Ir para p�gina <a href="http://localhost:8080/Teste/portifolio.jsp?info=<%=cont%>">Portifolio</a>
    
    <form action="http://localhost:8080/Teste/recebe-dados.jsp" method="post">
        <br>
        <input type="text" name="nome" placeholder="Insira o nome">
        <input type="text" name="email" placeholder="Insira o email">
        
        <br><br>
        
        <select name="jogadores">
            <option value="romario">Rom�rio</option>
            <option value="zidane">Zidane</option>
            <option value="forlan">Forlan</option>
        </select>
   
        <input type="checkbox" name="opcao_classe" value="natacao"> Nata��o
        <input type="checkbox" name="opcao_classe" value="ginastica"> Gin�stica
        <input type="checkbox" name="opcao_classe" value="volei"> V�lei
        <input type="checkbox" name="opcao_classe" value="futebol"> Futebol
        
        <br> <br> Qual o seu sexo?<br>
        <input type="radio" value="feminino" name="opcao_sexo" > feminino
        <input type="radio" value="masculino" name="opcao_sexo"> masculino
        
        <br><br>
        <input type="submit" value="Enviar">
    </form>
    </body>
</html>
