package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Index - JDBC WebApp</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/styles.css\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<style>\n");
      out.write(".skills {\n");
      out.write("      max-width: 50%;\n");
      out.write("      margin: 40px auto;\n");
      out.write("      text-align: center;\n");
      out.write("      .hr-text {\n");
      out.write("        font-size: 20px;\n");
      out.write("        position: relative;\n");
      out.write("        border: 0;\n");
      out.write("        height: 1.5em;\n");
      out.write("        &:before {\n");
      out.write("          content: '';\n");
      out.write("          background: linear-gradient(to right, transparent, $detail, transparent;\n");
      out.write("          position: absolute;\n");
      out.write("          left: 0;\n");
      out.write("          top: 50%;\n");
      out.write("          width: 100%;\n");
      out.write("          height: 1px;\n");
      out.write("        }\n");
      out.write("        &:after {\n");
      out.write("          content: attr(data-content);\n");
      out.write("          position: relative;\n");
      out.write("          display: inline-block;\n");
      out.write("          color: black;\n");
      out.write("\n");
      out.write("          padding: 0 .5em;\n");
      out.write("          line-height: 1.5em;\n");
      out.write("          color: $title;\n");
      out.write("          background-color: black;\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <br>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("<a href=\"index.jsp\"  class=\"btn btn-primary\">INÍCIO</a> ||\n");
      out.write("<a href=\"customers.jsp\" class=\"btn btn-secondary\">CLIENTES</a> ||\n");
      out.write("<a href=\"fabricantes.jsp \"  class=\"btn btn-success\">FABRICANTES</a>\n");
      out.write("</center>\n");
      out.write("  <div class=\"skills\">\n");
      out.write("    <hr class=\"hr-text\">\n");
      out.write("  </div></body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      <div class=\"jumbotron\" style=\"padding: 40px\">\n");
      out.write("    <center> <h1 class=\"display-4\"> \n");
      out.write(" Projeto 05 - POO!\n");
      out.write(" </h1>     \n");
      out.write("        <div class=\"alert alert-primary\" role=\"alert\">\n");
      out.write("Integrantes: Mirelle Gushomoto e Gabriel Reverte\n");
      out.write("</div>\n");
      out.write("      </div>\n");
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
