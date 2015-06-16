<%-- 
    Document   : getInfoMina
    Created on : 14-may-2015, 19:16:09
    Author     : Sergio
--%>

<%@page import="operacionesminas_client.Mina"%>
<%@page import="operacionesminas_client.NivelMina"%>
<%@page import="cliente_webservice.ClienteRecursosMinas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
//    String nivelActualmina = request.getParameter("input");
//    String output = request.getParameter("output");
    int idMina = Integer.valueOf(request.getParameter("IdMina"));
    String nivelActualmina = request.getParameter("nivelM");

    System.err.println("nivel actual: " + nivelActualmina);

    String ganancia = "¡La mina no puede ser mejorada más!";
    String tiempo = "--";
    String coste = "--";

    ClienteRecursosMinas crm = new ClienteRecursosMinas();
    if (Integer.valueOf(nivelActualmina) <= 5) {
        NivelMina nm = crm.obtenerNivelMina(Integer.valueOf(nivelActualmina) + 1);

        ganancia = "" + nm.getGanancia();
        tiempo = "" + 30;
        coste = "" + nm.getPrecio();
    }
%>

<div class="col-md-1 col-md-offset-11 text-right" onload="mostrarErrorRecursos('${mensaje}');">
    <h5 ><strong id="nivelMina">Nivel: <%= nivelActualmina%></strong></h5>
    <!--                    <h5 ><strong id="dos">Global:</strong></h5>-->

</div> 
<div class="col-md-5 col-md-offset-0">
    <img src="img/minas/hierro1.png" class="img-responsive " alt="Responsive image">
</div>
<div class="row">

    <div class="col-md-5 col-md-offset-0">
        <div class="row">
            <h1 class="">Mina de hierro</h1>
        </div>
        <div class="row">
            <h5 class="" id="descripcionMina">Descripción: Aqui una breve descripción de cual es us función el juego</h5>
            </br>
        </div>
        <div class="row">
            <h5 class="" id="gananciaMina"><b>Ganancia:</b> <%= ganancia%></h5>
        </div>
        <div class="row">
            <h5 class="" id="tiempoMejoraMina"><b>Tiempo de mejora:</b> 30 min</h5>
        </div>
        <div class="row">
            <h5 class="" id="costeMejoraMina"><b>Coste de mejora:</b> <%= coste%></h5>
        </div>
    </div>
    <!--<div class="col-md-1 col-md-offset-0 text-right">
        <h5 class="">Nivel: 5</h5>

        <button type="button" class="btn btn-link">Mejorar</button>
    </div> -->
</div> 

<div class="row col-md-2  col-md-offset-10 ">
    <%if (Integer.valueOf(nivelActualmina) <= 5){%>
    <a onclick="mejorarMina(<%= idMina%>);">
        <button type="button" class="btn btn-primary col-md-12 " id="save">Mejorar</button>
    </a> 
<!--    <form action="MejorarMina" method="POST">
        <input type="hidden" name="idMina">
    </form>-->
    
    
    <%} //else {%>
<!--    <a onclick="">
        <button type="button" class="btn btn-danger col-md-12 " id="save" disabled="">Mejorar</button>
    </a>-->
    <%//}%>
    </br>   
    </br>   
    </br>   

</div>
</br>


