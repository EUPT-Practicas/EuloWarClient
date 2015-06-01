<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>EuloWar</title>

        <!-- CSS de Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">

        <!-- librerías opcionales que activan el soporte de HTML5 para IE8 -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <div class="container">
            <header class="row">
                <img src="./img/logotipo.png" class="img-responsive  col-md-3 col-md-offset-0" alt="Logo EuloWar">
                
            </header>
           
        <div class="row">
            <div class="panel panel-default col-md-3 col-md-offset-2">
                <h4 class="text-center">Nuevo usuario</h4>
                <form role="form_alta" action="Alta" method="POST">
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
                        <label for="ejemplo_password_1">R. Contraseña</label>
                        <input type="password" class="form-control" name="passwordRepit" id="ejemplo_password_1" 
                               placeholder="Contraseña">
                    </div>
                    
                    <button type="submit" class="btn btn-primary col-md-8 col-md-offset-2">Enviar</button>
                    </br></br>
                </form>
            </div>
            
            <div class="panel panel-default col-md-3 col-md-offset-2">
                <h4 class="text-center">Usuario registrado</h4>
                <form role="form_registro"  action="Login" name="nombre" method="POST">
                    <div class="form-group">
                        <label for="ejemplo_password_1">Usuario</label>
                        <input type="text" class="form-control" placeholder="Nombre de usuario">
                    </div>
                    
                    <div class="form-group">
                        <label for="ejemplo_password_1">Contraseña</label>
                        <input type="password" class="form-control" name="password" id="ejemplo_password_1" 
                               placeholder="Contraseña">
                    </div>
                                        
                    <button type="submit" class="btn btn-primary col-md-8 col-md-offset-2">Enviar</button>
                    </br></br>
                </form>
            </div>

        </div>
        </div>


        <!-- Librería jQuery requerida por los plugins de JavaScript -->
        <script src="http://code.jquery.com/jquery.js"></script>

        <!-- Todos los plugins JavaScript de Bootstrap (también puedes
             incluir archivos JavaScript individuales de los únicos
             plugins que utilices) -->
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
