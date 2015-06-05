<%-- 
    Document   : minasb
    Created on : 14-may-2015, 19:11:44
    Author     : Sergio
--%>

<%@page import="operacionesminas_client.Mina"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Collection"%>
<%@page import="cliente_webservice.ClienteRecursosMinas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% %>
<html lang="es">
    <head>
        <%@ include file='head.jsp' %>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"></script>
        <script type="text/javascript">

            function DoAction(id, name)
            {
                $.ajax({
                    type: "POST",
                    url: "someurl.php",
                    data: "id=" + id + "&name=" + name,
                    success: function (msg) {
                        alert("Data Saved: " + msg);
                    }
                });
            }

            function setInfoMina(_idMina, _nivelM) {

                $.ajax({
                    type: "POST",
                    url: "infoMina.jsp",
                    data: "IdMina=" + _idMina + "&nivelM=" + _nivelM,
                    success: function (msg) {
                        $('#infoMina').empty();
                        $('#infoMina').html(msg);
                    }
                });
            }


        </script>
    </head>
    <body id="v_minas" onload="mostrarErrorRecursos('${mensaje}');">
        <header>    
            <%@ include file='header.jsp' %>
        </header>
        <nav>
            <%@ include file='nav.jsp' %>
        </nav>
        <div class="row">

            <div class="panel panel-default col-md-10 col-md-offset-1" id="infoMina">
                <center><h1>No hay mina seleccionada.</h1></center>
                <!--                <div class="col-md-1 col-md-offset-11 text-right">
                                    <h5 ><strong id="nivelMina">Nivel:</strong></h5>
                                                        <h5 ><strong id="dos">Global:</strong></h5>
                
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
                                            <h5 class="" id="gananciaMina">Ganancia: +100</h5>
                                        </div>
                                        <div class="row">
                                            <h5 class="" id="tiempoMejoraMina">Tiempo de mejora: 30 min</h5>
                                        </div>
                                        <div class="row">
                                            <h5 class="" id="costeMejoraMina">Coste de mejora:</h5>
                                        </div>
                                    </div>
                                    <div class="col-md-1 col-md-offset-0 text-right">
                                        <h5 class="">Nivel: 5</h5>
                
                                        <button type="button" class="btn btn-link">Mejorar</button>
                                    </div> 
                                </div> 
                
                                <div class="row col-md-2  col-md-offset-10 ">
                                    <a onclick="">
                                        <button type="button" class="btn btn-primary col-md-12 " id="save">Mejorar</button>
                                    </a> 
                                    </br>   
                                    </br>   
                                    </br>   
                
                                </div>
                                </br>   -->
            </div>
            <div class="panel panel-default col-md-10 col-md-offset-1">
                </br></br>
                <!--<div class="col-md-1 col-md-offset-0"></div>-->
                <div class="col-md-2 col-md-offset-0">
                    <form action="NuevaMina" method="POST">
                        <!--                    <a onclick="nuevaMina();">-->
<!--                        <img src="img/minas/nueva_mina.png" class="img-responsive" alt="Nueva mina">-->
                        <input type="image" src="img/minas/nueva_mina.png" class="img-responsive" alt="Nueva mina">
                        <h5 class="text-center">Añadir Mina</h5>
                        <!--                    </a>-->
                    </form>
                </div>
                <%
                    ClienteRecursosMinas minas = new ClienteRecursosMinas();
                    List coleccionMinas = minas.obtenerMinas(usuario.getEmail());
                    Iterator<Mina> i = coleccionMinas.iterator();
                    System.err.println("Size: " + coleccionMinas.size());

                    while (i.hasNext()) {
                        Mina mina = i.next();
                        int nivel = mina.getNivelMina();
                        //System.err.println("nivel While: " + nivel);
                        int iden = mina.getIdMina();
                %>
                <div class="col-md-2 col-md-offset-0">
                    <a href="#" onclick="setInfoMina(<%= iden%>, <%= nivel%>);">
                        <img src="img/minas/hierro1.png" class="img-responsive" alt="Responsive image">
                        <h5 class="text-center">Nivel: <%= nivel%> </h5>
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