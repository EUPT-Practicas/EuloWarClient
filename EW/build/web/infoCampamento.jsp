<%-- 
    Document   : infoCampamento
    Created on : 05-jun-2015, 10:52:24
    Author     : Sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
//    String nivelActualmina = request.getParameter("input");
//    String output = request.getParameter("output");
    int idCampamento = Integer.valueOf(request.getParameter("IdCampamento"));
    //String nivelActualmina = request.getParameter("nivelM");

    System.err.println("Id Campamento: " + idCampamento);

    String ganancia = "¡La mina no puede ser mejorada más!";
    String tiempo = "--";
    String coste = "--";

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
    <h5><strong>Nivel: C</strong></h5>
</div> 
<div class="col-md-5 col-md-offset-0">
    <img src="img/campamento/ArmyCamp.png" class="img-responsive " alt="Responsive image">
</div>
<div class="row">

    <div class="col-md-5 col-md-offset-0">
        <div class="row">
            <h1 class="">Campamento</h1>
        </div>
        <div class="row">
            <h5 class="">Descripción: Aqui una breve descripción de cual es us función el juego</h5>
            </br>
        </div>
        <div class="row">
<!--            <h5 class="">Mejora de defensa: --</h5>-->
            <h5 class="">Aporta: 200 tropas</h5>
        </div>
<!--        <div class="row">
            <h5 class="">Tiempo de mejora: --</h5>
        </div>
        <div class="row">
            <h5 class="">Coste de mejora: --o</h5>
        </div>-->
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
