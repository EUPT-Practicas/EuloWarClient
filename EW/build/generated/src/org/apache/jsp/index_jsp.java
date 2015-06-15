package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/form_login.jsp");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <title>EuloWar - Tu juego de estrategia online.</title>\r\n");
      out.write("        <link href=\"css/newcss.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("        <!-- CSS de Bootstrap -->\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\r\n");
      out.write("        <!-- librerías opcionales que activan el soporte de HTML5 para IE8 -->\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("        <![endif]-->\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"bodyimg\" onload=\"mostrarErrorLogin('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensaje}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("');\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("            <section class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                <div  class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                    <!--<img src=\"img/war1.png\" class=\"img-responsive img-thumbnail col-md-4 col-md-offset-4\" alt=\"Responsive image\">--></br>\r\n");
      out.write("                    <div  class=\"panel panel-default col-md-4 col-md-offset-4\">\r\n");
      out.write("\r\n");
      out.write("                        <!--<h4 class=\"text-center\">Registrado</h4>-->\r\n");
      out.write("                        <a href=\"index.jsp\"><img src=\"./img/logotipo.png\" class=\"img-responsive \" alt=\"Logotipo EuloWar\"></a>\r\n");
      out.write("                        <div id=\"seccionErrores\" class=\"row col-md-10 col-md-offset-1\">\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- Formulario de inicio sesion / Registro -->\r\n");
      out.write("                        <div id=\"formularios\">\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Formulario de inicio sesion -->\r\n");
      out.write("<form action=\"Login\" method=\"POST\">\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label>Usuario</label>\r\n");
      out.write("        <input type=\"text\" class=\"form-control\" name=\"nombre\" placeholder=\"Nombre de usuario\">\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label>Contraseña</label>\r\n");
      out.write("        <input type=\"password\" class=\"form-control\" name=\"password\" id=\"ejemplo_password_1\" \r\n");
      out.write("               placeholder=\"Contraseña\">\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <button type=\"submit\" class=\"btn btn-primary col-md-8 col-md-offset-2\">Acceder</button>\r\n");
      out.write("    </br>\r\n");
      out.write("    </br>\r\n");
      out.write("    <h5 class=\"text-center\">\r\n");
      out.write("        <!--FALTA EL FORM / JS PARA RECUPERAR PASSS-->\r\n");
      out.write("        <a href=\"#\" onClick=\"mostrarRecuperar();\">¿Has olvidado tu contraseña?</a>\r\n");
      out.write("    </h5>\r\n");
      out.write("    <h5 class=\"text-center\">\r\n");
      out.write("        ¿No tienes cuenta?\r\n");
      out.write("        <a href=\"#\" onClick=\"mostrarRegistro();\" > Regístrate</a>\r\n");
      out.write("    </h5>\r\n");
      out.write("    </br>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
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
      out.write("        <script src=\"./js/myJavaScript.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Todos los plugins JavaScript de Bootstrap (también puedes\r\n");
      out.write("             incluir archivos JavaScript individuales de los únicos\r\n");
      out.write("             plugins que utilices) -->\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
