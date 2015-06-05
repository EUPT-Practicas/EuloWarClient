
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">
    <head>
        <%@ include file='head.jsp' %>
    </head>
    <body id="v_general">
        <header>    
            <%@ include file='header.jsp' %>
        </header>
        <nav>
            <%@ include file='nav.jsp' %>
        </nav>

        <div class="row col-md-10 col-md-offset-1">
            <div class="panel panel-primary">
                <div class="panel-heading text-center">Bienvendio: <b><%=nombreUsuario%></b></div>
                
                <div class="panel-body">
                    <p class="text-center">10/05/2015</p>
                    <p class="text-center">Ninguna actividad recientemente</p>
                </div>
            </div>

            <!--<div class="panel panel-default">-->
            <div class="panel panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title text-center">Registro de actividad</h3>
                </div>
                <div class="panel-body">
                    <ul class="nav nav-tabs">
                        <li class="active"><a href="#">Defensa</a></li>
                        <li><a href="#">Ataque</a></li>
                    </ul>
                    <table class="table table-condensed">
                        <tr>
                            <td>
                                <h5>
                                Pepe travel </br>
                                Tropas perdidas: 157. </br>
                                Hierro robado: 5.000 </br>
                                </h5>
                            </td>
                            <td class="text-right"><h3 >Enhorabuena. Jefe hemos vencido.</h3></td>
                        </tr>
                        <tr class="info">
                            <td>
                                <h5>
                                Pepe travel </br>
                                Tropas perdidas: 157. </br>
                                Hierro robado: 0 </br>
                                </h5>
                            </td>
                            <td class="text-right"><h3>oh No. Hemos sido vencidos.</h3></td>
                        </tr>
                    </table>
                </div>

            </div>
        </div>



        <footer class="container">
            <%@ include file='footer.jsp' %>
        </footer>
        <!-- Librería jQuery requerida por los plugins de JavaScript -->
        <script src="http://code.jquery.com/jquery.js"></script>

        <!-- Todos los plugins JavaScript de Bootstrap (también puedes
             incluir archivos JavaScript individuales de los únicos
             plugins que utilices) -->
        <script src="js/bootstrap.min.js"></script>
        <script src="js/navbarscript.js"></script>
    </body>
</html>
<!--<h4 class="text-center bg-primary">Bienvenido: MR.X</h4>-->