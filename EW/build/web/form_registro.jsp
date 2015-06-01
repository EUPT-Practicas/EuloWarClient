<%-- 
    Document   : form_registro
    Created on : 19-may-2015, 10:34:49
    Author     : Sergio
--%>

                        <!-- Formulario de registro  -->
                        <form action="Alta" method="POST">
                            <h4 class="text-center">Nuevo usuario</h4>
                            <div class="form-group">
                                <label for="ejemplo_email_1">Email</label>
                                <input type="email" class="form-control" name="email" id="ejemplo_email_1"
                                       placeholder="Introduce tu email">
                            </div>
                            <div class="form-group">
                                <label for="ejemplo_password_1">Usuario</label>
                                <input type="text" class="form-control" name="nombreUsuario" placeholder="Nombre de usuario">
                            </div>

                            <div class="form-group">
                                <label for="ejemplo_password_1">Contraseña</label>
                                <input type="password" class="form-control" name="password" id="ejemplo_password_1" 
                                       placeholder="Contraseña">
                            </div>
                            <div class="form-group">
                                <label for="ejemplo_password_1">Repite Contraseña</label>
                                <input type="password" class="form-control" name="passwordRepit" id="ejemplo_password_1" 
                                       placeholder="Contraseña">
                            </div>
                            <div class="row">
                                <button type="button" class="btn btn-primary col-md-3 col-md-offset-2" onclick="mostrarLogin();">Cancelar</button>
                                <button type="submit" class="btn btn-primary col-md-3 col-md-offset-2">Registrar</button>
                            </div>
                            </br></br>
                        </form>
