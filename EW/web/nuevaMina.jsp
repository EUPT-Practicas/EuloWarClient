<%-- 
    Document   : nuevaMina
    Created on : 19-may-2015, 11:23:52
    Author     : Sergio
--%>

<%@page import="operacionesminas_client.NivelMina"%>
<%@page import="operacionesminas_client.Mina"%>
<%@page import="clientes_WS.Usuario"%>
<%@page import="cliente_webservice.ClienteRecursosMinas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession miSesion = request.getSession();

    Usuario usuario = (Usuario) miSesion.getAttribute("usuario");
    String email = usuario.getEmail();

    ClienteRecursosMinas crm = new ClienteRecursosMinas();
    Mina nuevaMina = crm.asignarMina(email);
    
    
    int idMina = nuevaMina.getIdMina();
    String nivelActualmina = "" + nuevaMina.getNivelMina();

    System.err.println("nivel NUEVA MINA: " + nivelActualmina);

    String ganancia = "¡La mina no puede ser mejorada más!";
    String tiempo = "--";
    String coste = "--";

    if (Integer.valueOf(nivelActualmina) <= 5) {
        NivelMina nm = crm.obtenerNivelMina(Integer.valueOf(nivelActualmina) + 1);

        ganancia = "" + nm.getGanancia();
        tiempo = "" + 30;
        coste = "" + nm.getPrecio();
    }
%>

<div class="col-md-1 col-md-offset-11 text-right">
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
    <%if (Integer.valueOf(nivelActualmina) <= 5) {%>
    <a onclick="">
        <button type="button" class="btn btn-primary col-md-12 " id="save">Mejorar</button>
    </a> <%} else {%>
    <a onclick="">
        <button type="button" class="btn btn-danger col-md-12 " id="save" disabled="">Mejorar</button>
    </a><%}%>
    </br>   
    </br>   
    </br>   

</div>
</br>



