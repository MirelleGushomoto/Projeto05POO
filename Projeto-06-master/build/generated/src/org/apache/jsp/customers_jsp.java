package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.fatecpg.jdbc.Customer;

public final class customers_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/jspf/menu.jspf");
  }

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Clientes - JDBC WebApp</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<a href=\"index.jsp\">INÍCIO</a> ||\n");
      out.write("<a href=\"customers.jsp\">CLIENTES</a> ||\n");
      out.write("<a href=\"fabricantes.jsp\">Fabricantes</a>\n");
      out.write("<hr/>");
      out.write("\n");
      out.write("        <h1>JDBC WebApp</h1>\n");
      out.write("        <h2>Clientes</h2>\n");
      out.write("        ");
try{
      out.write("\n");
      out.write("           <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm\">\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th>Nome</th>\n");
      out.write("                <th>E-mail</th>\n");
      out.write("                <th>Lista de Compras</th>\n");
      out.write("                \n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");
for(Customer c: Customer.getList()){
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(c.getId() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(c.getName() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(c.getEmail() );
      out.write("</td>\n");
      out.write("                <td><a href=\"compras.jsp?id=");
      out.print(c.getId());
      out.write("\">Ver</a></td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        ");
}catch(Exception e){
      out.write("\n");
      out.write("        <h3 style=\"color:red\">ERRO: ");
      out.print( e.getMessage() );
      out.write(" </h3>\n");
      out.write("        ");
}
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
