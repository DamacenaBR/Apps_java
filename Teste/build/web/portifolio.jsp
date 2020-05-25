<%@include file="includes/topo.jsp" %>

        <%
            String var1 = "Portifolio";
            out.println(var1);
            
            String var2 = "Principal";
        %>
        
        <br><br>
        
        Ir para página <a href="http://localhost:8080/Teste/?info=<%=var2%>">Principal</a>
        <br>
        Ir para página <a href="http://localhost:8080/Teste/contato.jsp"</a>Contato</a>
    </body>
</html>
