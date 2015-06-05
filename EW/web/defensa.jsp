<%-- 
    Document   : defensa
    Created on : 28-abr-2015, 20:49:51
    Author     : Ricardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <%@ include file='head.jsp' %>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"></script>
        <script type="text/javascript">

            function setInfoDefensa(_tipoDefensa) {

                if (_tipoDefensa === "campoMinas") {
                    $.ajax({
                        type: "POST",
                        url: "infoCampoMinas.jsp",
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
                <!--                <div class="col-md-1 col-md-offset-11 text-right">
                                    <h5><strong>Nivel: 5</strong></h5>
                                </div> 
                                <div class="col-md-5 col-md-offset-0">
                                    </br>
                                    <img src="img/defensa/rambo.png" class="img-responsive " alt="Responsive image">
                                </div>
                                <div class="row">
                
                                    <div class="col-md-5 col-md-offset-0">
                                        <div class="row">
                                            <h1 class="">Rambo total</h1>
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
                
                                        <div class="panel col-md-9 col-md-offset-1">
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
                                    <div class="col-md-1 col-md-offset-0 text-right">
                                        <h5 class="">Nivel: 5</h5>
                
                                        <button type="button" class="btn btn-link">Mejorar</button>
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
            <div class="panel panel-default col-md-10 col-md-offset-1">
                </br></br>
                <div class="col-md-0 col-md-offset-0"></div>

                <div class="col-md-2 col-md-offset-0">
                    <img src="img/defensa/mejorar.png" class="img-responsive" alt="Responsive image">
                    <h5 class="text-center">Mejorar Defensas</h5>
                </div>

                <div class="col-md-2 col-md-offset-0">
                    <a href="#" onclick="setInfoDefensa('campoMinas');">

                        <img src="img/defensa/tedax.png" class="img-responsive" alt="Responsive image">
                        <h5 class="text-center">Campo Minas | ()</h5>
                    </a>
                </div>
                <div class="col-md-2 col-md-offset-0">
                    <a href="#" onclick="setInfoDefensa('trincheraAmetralladoras');">
                        <img src="img/defensa/bunker.png" class="img-responsive" alt="Responsive image">
                        <h5 class="text-center">Trinchera Ametralladoras | ()</h5>
                    </a>
                </div>
                <div class="col-md-2 col-md-offset-0">
                    <a href="#" onclick="setInfoDefensa('canonAntiaereo');">
                        <img src="img/defensa/antiaerea.png" class="img-responsive" alt="Responsive image">
                        <h5 class="text-center">Cañon Antiaereo | ()</h5>
                    </a>
                </div>

                <div class="col-md-2 col-md-offset-0">
                    <a href="#" onclick="setInfoDefensa('misilAntiaereo');">
                        <img src="img/defensa/misilesantiaereos.png" class="img-responsive" alt="Responsive image">
                        <h5 class="text-center">Misil Antiaereo | ()</h5>
                    </a>
                </div>
                <div class="col-md-2 col-md-offset-0">
                    <a href="#" onclick="setInfoDefensa('rambo');">
                        <img src="img/defensa/rambo.png" class="img-responsive" alt="Responsive image">
                        <h5 class="text-center">Rambo | ()</h5>
                    </a>
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