package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/footer.jsp");
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
      out.write("<html lang=\"es\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>EuloWar</title>\n");
      out.write("        <link href=\"css/newcss.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("        <!-- CSS de Bootstrap -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("\n");
      out.write("        <!-- librerías opcionales que activan el soporte de HTML5 para IE8 -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"bodyimg\" onload=\"mostrarErrorLogin('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensaje}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("');\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <section class=\"row\">\n");
      out.write("\n");
      out.write("                <div  class=\"row\">\n");
      out.write("\n");
      out.write("                    <!--<img src=\"img/war1.png\" class=\"img-responsive img-thumbnail col-md-4 col-md-offset-4\" alt=\"Responsive image\">--></br>\n");
      out.write("                    <div  class=\"panel panel-default col-md-4 col-md-offset-4\">\n");
      out.write("\n");
      out.write("                        <!--<h4 class=\"text-center\">Registrado</h4>-->\n");
      out.write("                        <img src=\"./img/logotipo.png\" class=\"img-responsive \" alt=\"Logo EuloWar\">\n");
      out.write("                        <div id=\"seccionErrores\" class=\"row col-md-10 col-md-offset-1\">\n");
      out.write("                            <!--                            <div class=\"alert alert-danger\" role=\"alert\">\n");
      out.write("                                                            <span class=\"glyphicon glyphicon-exclamation-sign\" aria-hidden=\"true\"></span>\n");
      out.write("                                                            <span class=\"sr-only\">Error:</span>\n");
      out.write("                                                            Usuario ó contraseña incorectos\n");
      out.write("                                                        </div>        -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Formulario de inicio sesion / Registro -->\n");
      out.write("                        <div id=\"formularios\">\n");
      out.write("                            <form action=\"Login\"  method=\"POST\">\n");
      out.write("                                <div class=\" form-group\">\n");
      out.write("                                    <label for=\"ejemplo_password_1\">Usuario</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"nombre\" placeholder=\"Nombre de usuario\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"ejemplo_password_1\">Contraseña</label>\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" name=\"password\" id=\"ejemplo_password_1\" \n");
      out.write("                                           placeholder=\"Contraseña\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary col-md-8 col-md-offset-2\">Acceder</button>\n");
      out.write("                                </br>\n");
      out.write("                                </br>\n");
      out.write("\n");
      out.write("                                <a onClick=\"mostrarRegistro();\">\n");
      out.write("                                    <p class=\"text-center\">Registrate</p>\n");
      out.write("                                </a>\n");
      out.write("                                </br>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <footer class=\"container\">\n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <div class=\"row col-md-2 col-md-offset-0\">\r\n");
      out.write("        </br>\r\n");
      out.write("        Unizar 2015\r\n");
      out.write("    </div>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("        </footer>\n");
      out.write("        <!-- Librería jQuery requerida por los plugins de JavaScript -->\n");
      out.write("        <script src=\"http://code.jquery.com/jquery.js\"></script>\n");
      out.write("        \n");
      out.write("        <script src=\"./js/myJavaScript.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Todos los plugins JavaScript de Bootstrap (también puedes\n");
      out.write("             incluir archivos JavaScript individuales de los únicos\n");
      out.write("             plugins que utilices) -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
