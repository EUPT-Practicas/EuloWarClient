
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <div class="row">
        <nav class="navbar navbar-inverse panel-default col-md-10 col-md-offset-1">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <!--<a class="navbar-brand" href="#">Project name</a>-->
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li><a href="general.jsp">Vista general</a></li>
                        <li><a href="minas.jsp">Minas</a></li>
                        <li><a href="defensa.jsp">Defensa</a></li>
                        <li><a href="ataque.jsp">Ataque</a></li>
                        <li><a href="campamentos.jsp">Campamentos</a></li>

                    </ul>

                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="../navbar-static-top/"><%=nombreUsuario%></a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> <span class="caret"></span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li>
                                    <a href="preferencias.jsp">
                                        <span class="glyphicon glyphicon-cog" aria-hidden="true"></span> Preferencias      
                                    </a>
                                </li>
                                <li>
                                    <a href="CerrarSesion">
                                        <span class="glyphicon glyphicon-log-out" aria-hidden="true"></span> Salir      
                                    </a>
                                </li>
                                <!--                  <li><a href="#">Defensa</a></li>
                                                  <li class="divider">Ataque</li>
                                                  <li class="dropdown-header">Campamento</li>
                                                  <li><a href="#">Separated link</a></li>
                                                  <li><a href="#">One more separated link</a></li>-->
                            </ul>
                        </li>
                    </ul>
                </div><!--/.nav-collapse -->
            </div><!--/.container-fluid -->
        </nav>
    </div>
</html>
