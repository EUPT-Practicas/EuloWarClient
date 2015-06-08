<%-- 
    Document   : ataque
    Created on : 09-may-2015, 21:04:19
    Author     : Ricardo
--%>

<%@page import="cliente_webservice.ClienteTropas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@ include file='head.jsp' %>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"></script>
        <script type="text/javascript">

            function setInfoAtaque(_tipoAtaque, _nivelF) {

                if (_tipoAtaque === "peloton") {
                    $.ajax({
                        type: "POST",
                        url: "infoPeloton.jsp",
                        data: "nivelF=" + _nivelF,
                        success: function (msg) {
                            $('#infoAtaque').empty();
                            $('#infoAtaque').html(msg);
                        }
                    });
                }
                if (_tipoAtaque === "vehiculoBlindado") {
                    $.ajax({
                        type: "POST",
                        url: "infoVehiculoBlindado.jsp",
                        data: "nivelF=" + _nivelF,
                        success: function (msg) {
                            $('#infoAtaque').empty();
                            $('#infoAtaque').html(msg);
                        }
                    });
                }
                if (_tipoAtaque === "helicoptero") {
                    $.ajax({
                        type: "POST",
                        url: "infoHelicoptero.jsp",
                        data: "nivelF=" + _nivelF,
                        success: function (msg) {
                            $('#infoAtaque').empty();
                            $('#infoAtaque').html(msg);
                        }
                    });
                }
                if (_tipoAtaque === "avionCombate") {
                    $.ajax({
                        type: "POST",
                        url: "infoAvionCombate.jsp",
                        data: "nivelF=" + _nivelF,
                        success: function (msg) {
                            $('#infoAtaque').empty();
                            $('#infoAtaque').html(msg);
                        }
                    });
                }
                if (_tipoAtaque === "chuckNorris") {
                    $.ajax({
                        type: "POST",
                        url: "infoChuckNorris.jsp",
                        data: "nivelF=" + _nivelF,
                        success: function (msg) {
                            $('#infoAtaque').empty();
                            $('#infoAtaque').html(msg);
                        }
                    });
                }
            }

        </script>
    </head>
    <body id="v_ataque">
        <header>    
            <%@ include file='header.jsp' %>
        </header>
        <nav>
            <%@ include file='nav.jsp' %>
        </nav>

        <div class="row">
            <div class="panel panel-default col-md-10 col-md-offset-1" id="infoAtaque">
                <!--                <div class="col-md-1 col-md-offset-11 text-right">
                                    <h5><strong>Nivel: 5</strong></h5>
                                </div> 
                                <div class="col-md-5 col-md-offset-0">
                                    </br>
                                    <img src="img/ataque/chuck2.png" class="img-responsive " alt="Responsive image">
                                </div>
                                <div class="row">
                
                                    <div class="col-md-5 col-md-offset-0">
                                        <div class="row">
                                            <h1 class="">Cuidadito conmigo</h1>
                                        </div>
                                        <div class="row">
                                            <h5 class="">Descripción: Aqui una breve descripción de cual es us función el juego</h5>
                                            </br>
                                        </div>
                                        <div class="row">
                                            <h5 class="">Mejora de defensa: +100</h5>
                                        </div>
                                        <div class="row">
                                            <h5 class="">Tiempo de mejora: 30 min</h5>
                                        </div>
                                        <div class="row">
                                            <h5 class="">Coste de mejora: 5.000 Hierro</h5>
                                        </div>
                                        <div class="row text-center">
                                            <h5 class=""><b>Nº Tropas adquiridas:</b> 55</h5>
                                        </div>
                                        <div class="panel  col-md-9 col-md-offset-1">
                                            <div class="col-md-6 col-md-offset-0">
                                                <div class="input-group number-spinner">
                                                    <span class="input-group-btn data-dwn">
                                                        <button class="btn btn-primary" data-dir="dwn"><span class="glyphicon glyphicon-minus"></span></button>
                                                    </span>
                                                    <input type="text" class="form-control text-center" value="1" min="1" max="40" readonly>
                                                    <span class="input-group-btn data-up">
                                                        <button class="btn btn-primary " data-dir="up"><span class="glyphicon glyphicon-plus"></span></button>
                                                    </span>
                                                </div>
                                            </div>
                                            <div class="col-md-6 col-md-offset-0">
                                                <button type="button" class="btn btn-primary col-md-12 ">Comprar</button>
                                            </div>
                                        </div>
                                    </div>
                                </div> 
                
                                <div class="row col-md-2  col-md-offset-10 ">
                                    <a href="">
                                        <button type="button" class="btn btn-primary col-md-12 ">Mejorar</button>
                                    </a> 
                                    </br>   
                                    </br>   
                                    </br>   
                
                                </div>
                                </br>   -->
            </div>
            <%                ClienteTropas ct = new ClienteTropas();
                int nivel = ct.getNivelFabricaAtaque(email);
                int numPeloton = ct.getTropaAtaque(email, "PELOTON").getUnidades();
                int numVehiculoBlindado = ct.getTropaAtaque(email, "VEHICULO_BLINDADO").getUnidades();
                int numHelicoptero = ct.getTropaAtaque(email, "HELICOPTERO").getUnidades();
                int numAvionCombate = ct.getTropaAtaque(email, "AVION_COMBATE").getUnidades();
                int numChuckNorris = ct.getTropaAtaque(email, "CHUCK_NORRIS").getUnidades();

            %>
            <div class="panel panel-default col-md-10 col-md-offset-1">
                </br></br>
                <div class="col-md-0 col-md-offset-0"></div>

                <div class="col-md-2 col-md-offset-0">
                    <img src="img/defensa/mejorar.png" class="img-responsive" alt="Responsive image">
                    <h5 class="text-center">Mejorar Ataque</h5>
                </div>

                <div class="col-md-2 col-md-offset-0">
                    <a href="#" onclick="setInfoAtaque('peloton', <%= nivel%>);">
                        <img src="img/ataque/peloton.png" class="img-responsive" alt="Responsive image">
                        <h5 class="text-center">Peloton (<%= numPeloton%>) </h5>
                    </a>
                </div>

                <div class="col-md-2 col-md-offset-0">
                    <% if (nivel > 1) {%>
                    <a href="#" onclick="setInfoAtaque('vehiculoBlindado', <%= nivel%>);">
                        <img src="img/ataque/vehiculoblindado.png" class="img-responsive" alt="Responsive image">
                        <h5 class="text-center">Vehículo Blindado (<%= numVehiculoBlindado%>) </h5>
                    </a>
                    <%} else {%>
                    <img src="img/ataque/vehiculoblindadoDisabled.png" class="img-responsive" alt="Responsive image">
                    <h5 class="text-center">Vehículo Blindado</h5>
                    <%}%>
                </div>
                <div class="col-md-2 col-md-offset-0">
                    <% if (nivel > 2) {%>
                    <a href="#" onclick="setInfoAtaque('helicoptero', <%= nivel%>);">
                        <img src="img/ataque/apache.png" class="img-responsive" alt="Responsive image">
                        <h5 class="text-center">Helicóptero (<%= numHelicoptero%>) </h5>
                    </a>
                    <%} else {%>
                    <img src="img/ataque/apacheDisabled.png" class="img-responsive" alt="Responsive image">
                    <h5 class="text-center">Helicóptero</h5>
                    <%}%>
                </div>
                <div class="col-md-2 col-md-offset-0">
                    <% if (nivel > 3) {%>
                    <a href="#" onclick="setInfoAtaque('avionCombate', <%= nivel%>);">
                        <img src="img/ataque/caza.png" class="img-responsive" alt="Responsive image">
                        <h5 class="text-center">Avión Combate (<%= numAvionCombate%>) </h5>
                    </a>
                    <%} else {%>
                    <img src="img/ataque/cazaDisabled.png" class="img-responsive" alt="Responsive image">
                    <h5 class="text-center">Avión Combate</h5>
                    <%}%>
                </div>
                <div class="col-md-2 col-md-offset-0">
                    <% if (nivel > 4) {%>
                    <a href="#" onclick="setInfoAtaque('chuckNorris', <%= nivel%>);">
                        <img src="img/ataque/chuck2.png" class="img-responsive" alt="Responsive image">
                        <h5 class="text-center">Chuck Norris (<%= numChuckNorris%>) </h5>
                    </a>
                    <%} else {%>
                    <img src="img/ataque/chuck2Disabled.png" class="img-responsive" alt="Responsive image">
                    <h5 class="text-center">Chuck Norris</h5>
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
