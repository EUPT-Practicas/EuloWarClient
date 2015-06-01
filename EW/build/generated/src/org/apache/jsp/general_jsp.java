package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class general_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/head.jsp");
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/nav.jsp");
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("    <head>\r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>EuloWar</title>\n");
      out.write("\n");
      out.write("        <!-- CSS de Bootstrap -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("\n");
      out.write("        <!-- librerías opcionales que activan el soporte de HTML5 para IE8 -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("</html>\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <header>    \r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-3 col-md-offset-1\">\r\n");
      out.write("            <a href=\"general.jsp\">\r\n");
      out.write("                <img src=\"./img/logotipo.png\" class=\"img-responsive \" alt=\"Logo EuloWar\">\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-2 col-md-offset-5\">            \r\n");
      out.write("            </br></br></br\r\n");
      out.write("            </br>\r\n");
      out.write("            <div class=\"row text-right\">\r\n");
      out.write("                <h5 class=\"text-primary\"><img src=\"img/icon/iron.png\" class=\" \" alt=\"Responsive image\">\r\n");
      out.write("                    <strong>Hierro: 5.000</strong></h5>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row text-right\">\r\n");
      out.write("                <h5 class=\"text-primary\"><img src=\"img/icon/tropa.png\" class=\"  \" alt=\"Responsive image\"><strong>Tropas:170/200</strong></h5>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-3 col-md-offset-5\">\r\n");
      out.write("            </div>   \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("        </header>\r\n");
      out.write("        <nav>\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <nav class=\"navbar navbar-inverse panel-default col-md-10 col-md-offset-1\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <!--<a class=\"navbar-brand\" href=\"#\">Project name</a>-->\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                        <li class=\"active\"><a href=\"general.jsp\">Vista general</a></li>\r\n");
      out.write("                        <li><a href=\"minas.jsp\">Minas</a></li>\r\n");
      out.write("                        <li><a href=\"defensa.jsp\">Defensa</a></li>\r\n");
      out.write("                        <li><a href=\"ataque.jsp\">Ataque</a></li>\r\n");
      out.write("                        <li><a href=\"campamentos.jsp\">Campamentos</a></li>\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                        <li><a href=\"../navbar-static-top/\">Ricardo</a></li>\r\n");
      out.write("                        <li class=\"dropdown active\">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\"><span class=\"glyphicon glyphicon-plus\" aria-hidden=\"true\"></span> <span class=\"caret\"></span></a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"#\">\r\n");
      out.write("                                        <span class=\"glyphicon glyphicon-cog\" aria-hidden=\"true\"></span> Preferencias      \r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"#\">\r\n");
      out.write("                                        <span class=\"glyphicon glyphicon-log-out\" aria-hidden=\"true\"></span> Salir      \r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <!--                  <li><a href=\"#\">Defensa</a></li>\r\n");
      out.write("                                                  <li class=\"divider\">Ataque</li>\r\n");
      out.write("                                                  <li class=\"dropdown-header\">Campamento</li>\r\n");
      out.write("                                                  <li><a href=\"#\">Separated link</a></li>\r\n");
      out.write("                                                  <li><a href=\"#\">One more separated link</a></li>-->\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div><!--/.nav-collapse -->\r\n");
      out.write("            </div><!--/.container-fluid -->\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row col-md-10 col-md-offset-1\">\r\n");
      out.write("            <div class=\"panel panel-primary\">\r\n");
      out.write("                <div class=\"panel-heading text-center\">Bienvendio: Eulogio</div>\r\n");
      out.write("                <div class=\"panel-body\">\r\n");
      out.write("                    <p class=\"text-center\">10/05/2015</p>\r\n");
      out.write("                    <p class=\"text-center\">Ninguna actividad recientemente</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!--<div class=\"panel panel-default\">-->\r\n");
      out.write("            <div class=\"panel panel panel-primary\">\r\n");
      out.write("                <div class=\"panel-heading\">\r\n");
      out.write("                    <h3 class=\"panel-title text-center\">Registro de actividad</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"panel-body\">\r\n");
      out.write("                    <ul class=\"nav nav-tabs\">\r\n");
      out.write("                        <li class=\"active\"><a href=\"#\">Defensa</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Ataque</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <table class=\"table table-condensed\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <h5>\r\n");
      out.write("                                Pepe travel </br>\r\n");
      out.write("                                Tropas perdidas: 157. </br>\r\n");
      out.write("                                Hierro robado: 5.000 </br>\r\n");
      out.write("                                </h5>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td class=\"text-right\"><h3 >Enhorabuena. Jefe hemos vencido.</h3></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr class=\"info\">\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <h5>\r\n");
      out.write("                                Pepe travel </br>\r\n");
      out.write("                                Tropas perdidas: 157. </br>\r\n");
      out.write("                                Hierro robado: 0 </br>\r\n");
      out.write("                                </h5>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td class=\"text-right\"><h3>oh No. Hemos sido vencidos.</h3></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <footer class=\"container\">\r\n");
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
      out.write("\r\n");
      out.write("        </footer>\r\n");
      out.write("        <!-- Librería jQuery requerida por los plugins de JavaScript -->\r\n");
      out.write("        <script src=\"http://code.jquery.com/jquery.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Todos los plugins JavaScript de Bootstrap (también puedes\r\n");
      out.write("             incluir archivos JavaScript individuales de los únicos\r\n");
      out.write("             plugins que utilices) -->\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("<!--<h4 class=\"text-center bg-primary\">Bienvenido: MR.X</h4>-->");
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
