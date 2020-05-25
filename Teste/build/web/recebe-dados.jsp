<%@include file="includes/topo.jsp" %>
    
    <%
    String var1 = "Dados";
    out.println(var1);
    
    String var2 = "Principal";
    String var3 = "Portifolio";
    %>
    
    <br><br>
    Ir para página <a href="http://localhost:8080/Teste/?info=<%=var2%>">Principal</a>

    <br>
    Ir para página <a href="http://localhost:8080/Teste/portifolio.jsp?info=<%=var3%>">Portifolio</a>
    
    <br>
    Ir para página <a href="http://localhost:8080/Teste/contato.jsp"</a>Contato</a>

    <br><br>
    <%
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        
        String nomeJogadores = request.getParameter("jogadores");
        String opcaoSexo = request.getParameter("opcao_sexo");
        String opcaoClasse[] = request.getParameterValues("opcao_classe");
        
        out.println("O nome é "  + nome + " e o email é " + email + ", ");
        
        out.println(nomeJogadores + " é do sexo " + opcaoSexo + " e ");
        out.println(" pratica esporte de ");
        
        for(int i = 0; i < opcaoClasse.length; i++){ 
            boolean teste = true;
            if (opcaoClasse.length > 1 && i < opcaoClasse.length - 1) {
                out.println(opcaoClasse[i] + ", ");
                teste = false;
            }
            if (teste){
                out.println(opcaoClasse[i] + ".");
            }
        }
    %>
    </body>
</html>
