<%-- 
    Document   : campamentos
    Created on : 09-may-2015, 21:04:41
    Author     : Ricardo
--%>

<%@page import="java.util.Iterator"%>
<%@page import="operacionesCampamento_WS.Campamento"%>
<%@page import="java.util.List"%>
<%@page import="cliente_webservice.ClienteCampamento"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@ include file='head.jsp' %>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"></script>
        
    </head>
    <body id="v_atacar" onload="mostrarErrorRecursos('${mensaje}');">
        <header>    
            <%@ include file='header.jsp' %>
        </header>
        <nav>
            <%@ include file='nav.jsp' %>
        </nav>


        <div class="row">
            <div class="panel panel-default col-md-10 col-md-offset-1" id="infoCampamento">
                <div class="row">
                    </br>
                    </br>
                    <input type="image" src="img/soldados.png" class="img-responsive col-md-6 col-md-offset-3" alt="Nuevo Campamento">
                </div> 
                <div class="row">
                    </br>
                    </br>
                    <center><h5>Tus soldados están impacientes por atacar. Tan sólo tienes que darles la orden para invadir al enemigo. </h5></center>
                    </br>
                    <!--<a href="#" onclick="lanzarAtaque();">-->
                    <form action="Combate" method="POST">
                        <!--                    <a onclick="nuevaMina();">-->
<!--                        <img src="img/minas/nueva_mina.png" class="img-responsive" alt="Nueva mina">-->
                        <button type="submit" class="btn btn-primary col-md-2 col-md-offset-5">¡ A t a c a r !</button>
                        <!--                    </a>-->
                    </form>
                    
                    </a>
                    </br>
                    </br>
                </div> 
            </div>
        </div>
        <footer class="container">
            <%@ include file='footer.jsp' %>
        </footer>
        <!-- Librería jQuery requerida por los plugins de JavaScript -->
        <script src="http://code.jquery.com/jquery.js"></script>
        <script src="./js/myJavaScript.js"></script>

        <!-- Todos los plugins JavaScript de Bootstrap (también puedes
             incluir archivos JavaScript individuales de los únicos
             plugins que utilices) -->
        <script src="js/bootstrap.min.js"></script>
        <script src="js/navbarscript.js"></script>
    </body>
</html>
