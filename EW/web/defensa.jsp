<%-- 
    Document   : defensa
    Created on : 28-abr-2015, 20:49:51
    Author     : Ricardo
--%>

<%@page import="cliente_webservice.ClienteTropas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <%@ include file='head.jsp' %>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"></script>
        <script type="text/javascript">

            function setInfoFabrica() {
                $.ajax({
                    type: "POST",
                    url: "infoFabricaDefensa.jsp",
                    success: function (msg) {
                        $('#infoDefensa').empty();
                        $('#infoDefensa').html(msg);
                    }
                });
            }

            function setInfoDefensa(_tipoDefensa, _nivelF) {

                if (_tipoDefensa === "campoMinas") {
                    $.ajax({
                        type: "POST",
                        url: "infoCampoMinas.jsp",
                        data: "nivelF=" + _nivelF,
                        success: function (msg) {
                            $('#infoDefensa').empty();
                            $('#infoDefensa').html(msg);
                        }
                    });
                }
                if (_tipoDefensa === "trincheraAmetralladoras") {
                    $.ajax({
                        type: "POST",
                        url: "infoTrincheraAmetralladoras.jsp",
                        data: "nivelF=" + _nivelF,
                        success: function (msg) {
                            $('#infoDefensa').empty();
                            $('#infoDefensa').html(msg);
                        }
                    });
                }
                if (_tipoDefensa === "canonAntiaereo") {
                    $.ajax({
                        type: "POST",
                        url: "infoCanonAntiaereo.jsp",
                        data: "nivelF=" + _nivelF,
                        success: function (msg) {
                            $('#infoDefensa').empty();
                            $('#infoDefensa').html(msg);
                        }
                    });
                }
                if (_tipoDefensa === "misilAntiaereo") {
                    $.ajax({
                        type: "POST",
                        url: "infoMisilAntiaereo.jsp",
                        data: "nivelF=" + _nivelF,
                        success: function (msg) {
                            $('#infoDefensa').empty();
                            $('#infoDefensa').html(msg);
                        }
                    });
                }
                if (_tipoDefensa === "rambo") {
                    $.ajax({
                        type: "POST",
                        url: "infoRamboTotal.jsp",
                        data: "nivelF=" + _nivelF,
                        success: function (msg) {
                            $('#infoDefensa').empty();
                            $('#infoDefensa').html(msg);
                        }
                    });
                }

//                $.ajax({
//                    type: "POST",
//                    url: "infoMina.jsp",
//                    success: function (msg) {
//                        $('#infoMina').empty();
//                        $('#infoMina').html(msg);
//                    }
//                });
            }


        </script>
    </head>
    <body id="v_defensa">
        <header>    
            <%@ include file='header.jsp' %>
        </header>
        <nav>
            <%@ include file='nav.jsp' %>
        </nav>


        <div class="row">
            <div class="panel panel-default col-md-10 col-md-offset-1" id="infoDefensa">
                <center><h1>No hay tropa seleccionada.</h1></center>

            </div>
            <%                ClienteTropas ct = new ClienteTropas();
                int nivel = ct.getNivelFabricaDefensa(email);
                int numCampoMinas = ct.getTropaDefensa(email, "CAMPO_MINAS").getUnidades();
                int numTrinchera = ct.getTropaDefensa(email, "TRINCHERA_AMETRALLADORAS").getUnidades();
                int numCanonAntiaereo = ct.getTropaDefensa(email, "CAÑON_ANTIAEREO").getUnidades();
                int numMisilAntiaereo = ct.getTropaDefensa(email, "MISIL_ANTIAEREO").getUnidades();
                int numRambo = ct.getTropaDefensa(email, "RAMBO").getUnidades();

            %>
            <div class="panel panel-default col-md-10 col-md-offset-1">
                </br></br>
                <div class="col-md-0 col-md-offset-0"></div>

                <div class="col-md-2 col-md-offset-0">
                    <!--<form action="MejorarDefensa" method="POST">
                        <input type="image" src="img/defensa/mejorar.png" class="img-responsive" alt="Mejorar Defensa">
                    <!--                    <img src="img/defensa/mejorar.png" class="img-responsive" alt="Responsive image">-->
                    <!--<h5 class="text-center">Mejorar Defensa</h5>
                    </form>-->
                    <a href="#" onclick="setInfoFabrica();">
                        <img src="img/defensa/mejorar.png" class="img-responsive" alt="Información Fábrica">
                        <h5 class="text-center">Mejorar Defensa</h5>
                    </a>
                </div>

                <div class="col-md-2 col-md-offset-0">
                    <a href="#" onclick="setInfoDefensa('campoMinas');">
                        <img src="img/defensa/tedax.png" class="img-responsive" alt="Campo de minas">
                        <h5 class="text-center">Campo Minas (<%= numCampoMinas%>)</h5>
                    </a>
                </div>
                <div class="col-md-2 col-md-offset-0">
                    <% if (nivel > 1) {%>
                    <a href="#" onclick="setInfoDefensa('trincheraAmetralladoras');">
                        <img src="img/defensa/bunker.png" class="img-responsive" alt="Trinchera Ametralladoras">
                        <h5 class="text-center">Trinchera Ametralladoras (<%= numTrinchera%>)</h5>
                    </a>
                    <%} else {%>
                    <img src="img/defensa/bunkerDisabled.png" class="img-responsive" alt="Trinchera Ametralladoras">
                    <h5 class="text-center">Trinchera Ametralladoras</h5>
                    <%}%>
                </div>
                <div class="col-md-2 col-md-offset-0">
                    <% if (nivel > 2) {%>
                    <a href="#" onclick="setInfoDefensa('canonAntiaereo');">
                        <img src="img/defensa/antiaerea.png" class="img-responsive" alt="Cañon Antiaéreo">
                        <h5 class="text-center">Cañon Antiaereo (<%= numCanonAntiaereo%>)</h5>
                    </a>
                    <%} else {%>
                    <img src="img/defensa/antiaereaDisabled.png" class="img-responsive" alt="Cañon Antiaéreo">
                    <h5 class="text-center">Cañon Antiaereo</h5>
                    <%}%>
                </div>

                <div class="col-md-2 col-md-offset-0">
                    <% if (nivel > 3) {%>
                    <a href="#" onclick="setInfoDefensa('misilAntiaereo');">
                        <img src="img/defensa/misilesantiaereos.png" class="img-responsive" alt="Responsive image">
                        <h5 class="text-center">Misil Antiaereo (<%= numMisilAntiaereo%>)</h5>
                    </a>
                    <%} else {%>
                    <img src="img/defensa/misilesantiaereosDisabled.png" class="img-responsive" alt="Responsive image">
                    <h5 class="text-center">Misil Antiaereo</h5>
                    <%}%>
                </div>
                <div class="col-md-2 col-md-offset-0">
                    <% if (nivel > 4) {%>
                    <a href="#" onclick="setInfoDefensa('rambo');">
                        <img src="img/defensa/rambo.png" class="img-responsive" alt="Responsive image">
                        <h5 class="text-center">Rambo (<%= numRambo%>)</h5>
                    </a>
                    <%} else {%>
                    <img src="img/defensa/ramboDisabled.png" class="img-responsive" alt="Responsive image">
                    <h5 class="text-center">Rambo</h5>
                    <%}%>
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