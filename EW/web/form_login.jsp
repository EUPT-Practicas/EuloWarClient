<%-- 
    Document   : form_login
    Created on : 19-may-2015, 10:34:39
    Author     : Sergio
--%>

<!-- Formulario de inicio sesion -->
<form action="Login" method="POST">
    <div class="form-group">
        <label for="ejemplo_password_1">Usuario</label>
        <input type="text" class="form-control" name="nombre" placeholder="Nombre de usuario">
    </div>

    <div class="form-group">
        <label for="ejemplo_password_1">Contraseña</label>
        <input type="password" class="form-control" name="password" id="ejemplo_password_1" 
               placeholder="Contraseña">
    </div>

    <button type="submit" class="btn btn-primary col-md-8 col-md-offset-2">Acceder</button>
    </br>
    </br>
    <h5 class="text-center">
        <!--FALTA EL FORM / JS PARA RECUPERAR PASSS-->
        <a href="#" onClick="mostrarRecuperar();">¿Has olvidado tu contraseña?</a>
    </h5>
    <h5 class="text-center">
        ¿No tienes cuenta?
        <a href="#" onClick="mostrarRegistro();" > Registrate</a>
    </h5>
    </br>
</form>
