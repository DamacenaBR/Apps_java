<%@page import="java.net.URLEncoder"%>
<%@include file="includes/topo.jsp" %>
    </body>
    
    <%
        String var = "Principal";
        out.print(var);  
        String var1 = "Meu conte�do";
        String cont = URLEncoder.encode(var1, "UTF-8");
    %>
    
    <br><br>
    Ir para p�gina <a href="http://localhost:8080/Teste/portifolio.jsp?info=<%=cont%>">Portifolio</a>
    
    <br>
    Ir para p�gina <a href="http://localhost:8080/Teste/contato.jsp"</a>Contato</a>
</html>
