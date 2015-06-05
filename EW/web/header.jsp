<%-- 
    Document   : header
    Created on : 10-may-2015, 15:43:33
    Author     : Ricardo
--%>
<%@page import="clientes_WS.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession miSesion = request.getSession(false);

if(((String) miSesion.getAttribute("auth")) != "OK"){
    System.err.println("AUTH != OK : " + (String) miSesion.getAttribute("auth"));
//    String mensaje = "La session ha expirado.";
//                request.setAttribute("mensaje", mensaje);
//                request.setAttribute("tipo", "reg");
                request.getRequestDispatcher("index.jsp").forward(request, response);

}

    Usuario usuario = (Usuario) miSesion.getAttribute("usuario");

    String nombreUsuario = usuario.getNombreUsuario();
    String email = usuario.getEmail();
%>

<!DOCTYPE html>
<html>
    <script type="text/javascript">
        console.log("grijandemerenmomenes");
        console.log("usuario + <%=email%>");
        sendText("<%=email%>");
    </script>
    <div class="row">
        <div class="col-md-3 col-md-offset-1">
            <a href="general.jsp">
                <img src="./img/logotipo.png" class="img-responsive " alt="Logo EuloWar">
            </a>
        </div>
        <div class="col-md-2 col-md-offset-5">            
            </br></br></br>
            </br>
            <div class="row text-right">
                <h5 class="text-primary"><img src="img/icon/iron.png" class=" " alt="Responsive image">
                    <strong>Hierro:</strong> <strong id="cantidadRecursos">0</strong></h5><!--cambiar por el contenido dinamico!!!!!!!!!!-->
            </div>
            <div class="row text-right">
                <h5 class="text-primary"><img src="img/icon/tropa.png" class="  " alt="Responsive image"><strong>Tropas: 170/200</strong></h5>
            </div>
            <div class="col-md-3 col-md-offset-5">
            </div>   
        </div>
    </div>
</html>
