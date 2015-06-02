<%-- 
    Document   : preferencias
    Created on : 20-may-2015, 15:50:44
    Author     : Sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@ include file='head.jsp' %>
    </head>
    <body id="v_preferencias">
        <header>    
            <%@ include file='header.jsp' %>
        </header>
        <nav>
            <%@ include file='nav.jsp' %>
        </nav>

        <div class="row">
            <center><h2>Preferencias</h2></center>
        </div>
        <div class="panel panel-default col-md-4 col-md-offset-2">
            </br>
            <h5><center><b>Cambiar contraseña</b></center></h5></br>
            <div class="form-group">
                <label for="ejemplo_password_1">Contraseña actual</label>
                <input type="password" class="form-control" name="password" id="ejemplo_password_1" 
                       placeholder="Contraseña">
            </div>
            <div class="form-group">
                <label for="ejemplo_password_1">Nueva contraseña</label>
                <input type="password" class="form-control" name="password" id="ejemplo_password_1" 
                       placeholder="Contraseña">
            </div>
            <div class="form-group">
                <label for="ejemplo_password_1">Repita nueva contraseña</label>
                <input type="password" class="form-control" name="password" id="ejemplo_password_1" 
                       placeholder="Contraseña">
            </div>
            <button type="button" class="btn btn-primary col-md-10 col-md-offset-1">Eliminar cuenta</button>
            </br>
            </br>
            </br>
        </div>
        
        <div class="panel panel-default col-md-4 col-md-offset-0">
                        </br>
                        <h5><center><b>Cerrar cuenta</b></center></h5></br>
            <div class="row col-md-10 col-md-offset-1">
                <h5>Usted puede dar de baja su cuenta pulsando el siguiente boton.</h5>
                <button type="button" class="btn btn-primary col-md-12 ">Aceptar</button>
                            </br>
            </br>
            </br>
            </div>

        </div>
        
        <div class="container">
        </div>


        <footer class="container">
            <%@ include file='footer.jsp' %>
        </footer>
        <!-- Librería jQuery requerida por los plugins de JavaScript -->
        <script src="http://code.jquery.com/jquery.js"></script>

        <!-- Todos los plugins JavaScript de Bootstrap (también puedes
             incluir archivos JavaScript individuales de los únicos
             plugins que utilices) -->
        <script src="js/bootstrap.min.js"></script>
        <script src="js/navbarscript.js"></script>
    </body>
</html>
