<%-- 
    Document   : infoMisilAntiaereo
    Created on : 05-jun-2015, 11:42:56
    Author     : Sergio
--%>

<%@page import="cliente_webservice.ClienteTropas"%>
<%@page import="clientes_WS.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
        HttpSession miSesion = request.getSession(false);

    if (((String) miSesion.getAttribute("auth")) != "OK") {
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

    Usuario usuario = (Usuario) miSesion.getAttribute("usuario");

    String nombreUsuario = usuario.getNombreUsuario();
    String email = usuario.getEmail();
    String nivelF = request.getParameter("nivelF");
    ClienteTropas ct = new ClienteTropas();
    int nivel = ct.getNivelFabricaAtaque(email);
    System.err.println("nivel F: " + nivel);
//    String nivelActualmina = request.getParameter("input");
//    String output = request.getParameter("output");
//    int idMina = Integer.valueOf(request.getParameter("IdRambo"));
//
//    String ganancia = "¡La mina no puede ser mejorada más!";
//    String tiempo = "--";
//    String coste = "--";

//    ClienteRecursosMinas crm = new ClienteRecursosMinas();
//    if (Integer.valueOf(nivelActualmina) <= 5) {
//        NivelMina nm = crm.obtenerNivelMina(Integer.valueOf(nivelActualmina) + 1);
//
//        ganancia = "" + nm.getGanancia();
//        tiempo = "" + 30;
//        coste = "" + nm.getPrecio();
//    }
%>
<script src="./js/myJavaScript.js"></script>
<div class="col-md-1 col-md-offset-11 text-right">
    <h5><strong>Nivel: <%= nivel%></strong></h5>
</div> 
<div class="col-md-5 col-md-offset-0">
    </br>
    <img src="img/defensa/misilesantiaereos.png" class="img-responsive " alt="Responsive image">
</div>
<div class="row">

    <div class="col-md-5 col-md-offset-0">
        <div class="row">
            <h1 class="">Misil Antiaéreo</h1>
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
                    <input id="numTropasSpinner" type="text" class="form-control text-center" value="1" min="1" max="40" readonly>
                    <span class="input-group-btn data-up">
                        <button class="btn btn-primary " data-dir="up"><span class="glyphicon glyphicon-plus"></span></button>
                    </span>
                </div>
            </div>
            <div class="col-md-6 col-md-offset-0">
                <a onclick="comprarTropasDefensivas('MISIL_ANTIAEREO');">
                <button type="button" class="btn btn-primary col-md-12 ">Comprar</button>
            </div>
        </div>
    </div>
    <!--<div class="col-md-1 col-md-offset-0 text-right">
        <h5 class="">Nivel: 5</h5>

        <button type="button" class="btn btn-link">Mejorar</button>
    </div> -->
</div> 

<!--<div class="row col-md-2  col-md-offset-10 ">
    <a href="">
        <button type="button" class="btn btn-primary col-md-12 ">Mejorar</button>
    </a> 
    </br>   
    </br>   
    </br>   

</div>-->
</br> 
