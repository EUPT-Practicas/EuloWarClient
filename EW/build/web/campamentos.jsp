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
        <script type="text/javascript">

            function setInfoCampamento(_idCampamento) {

                $.ajax({
                    type: "POST",
                    url: "infoCampamento.jsp",
                    data: "IdCampamento=" + _idCampamento,
                    success: function (msg) {
                        $('#infoCampamento').empty();
                        $('#infoCampamento').html(msg);
                    }
                });
            }


        </script>
    </head>
    <body id="v_campamentos" onload="mostrarErrorRecursos('${mensaje}');">
        <header>    
            <%@ include file='header.jsp' %>
        </header>
        <nav>
            <%@ include file='nav.jsp' %>
        </nav>


        <div class="row">
            <div class="panel panel-default col-md-10 col-md-offset-1" id="infoCampamento">
                <center><h1>No hay campamento seleccionado.</h1></center>
            </div>
            <div class="panel panel-default col-md-10 col-md-offset-1">
                </br></br>

                <div class="col-md-2 col-md-offset-0">
                    <form action="NuevoCampamento" method="POST">
                        <input type="image" src="img/campamento/mejorarCampamento.png" class="img-responsive" alt="Nuevo Campamento">
<!--                        <img src="img/campamento/mejorarCampamento.png" class="img-responsive" alt="Responsive image">-->
                        <h5 class="text-center">Añadir Campamento</h5>
                    </form>
                </div>

                <!--                Bucle getCampamentos-->
                <%
                    ClienteCampamento cc = new ClienteCampamento();
                    List coleccionCampamentos = cc.obtenerCampamentos(usuario.getEmail());
                    Iterator<Campamento> i = coleccionCampamentos.iterator();

                    while (i.hasNext()) {
                        Campamento campamento = i.next();
                        int idCampamento = campamento.getIdCampamento();

                %>
                <div class="col-md-2 col-md-offset-0">
                    <a href="#" onclick="setInfoCampamento(<%= idCampamento%>);">
                        <img src="img/campamento/ArmyCamp.png" class="img-responsive" alt="Campamento">
                        <h5 class="text-center"></h5>
                    </a>
                </div>
                <% }%>

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
