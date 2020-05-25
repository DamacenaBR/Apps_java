package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastra_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "includes/topo.jsp", out, false);
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilo.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilo-cadastrar.css\">\n");
      out.write("\n");
      out.write("        <center>\n");
      out.write("            <h2><a href=\"index.jsp\">Index</a> </h2>\n");
      out.write("            <h2><a href=\"./ListMoto\">Listar Motos</a></h2>\n");
      out.write("        </center>\n");
      out.write("        \n");
      out.write("        <form action=\"ControlaMoto\" method=\"post\">   \n");
      out.write("\n");
      out.write("        <div id=\"cadastro\">\n");
      out.write("\n");
      out.write("            <div id=\"cadastro-interno\">\n");
      out.write("\n");
      out.write("                <div id=\"cadastro-label\">\n");
      out.write("                    Cadastro de Moto\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"input-div\">\n");
      out.write("                    <input name=\"marca\" placeholder=\"MARCA: \">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"input-div\">\n");
      out.write("                    <input name=\"cor\" placeholder=\"COR: \">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"botoes\">\n");
      out.write("\n");
      out.write("                    <div id=\"botao\">\n");
      out.write("                        <input name=\"cadastrar\" type=\"submit\" value=\"CADASTRAR\">\n");
      out.write("                    </div>   \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>  \n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
