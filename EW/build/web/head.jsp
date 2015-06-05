<%-- 
    Document   : head
    Created on : 12-may-2015, 19:33:14
    Author     : FranciscoJavier
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>EuloWar</title>

    <!-- CSS de Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
    <script type="text/JavaScript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
    <script type="text/JavaScript" src="js/websocket.js"></script>
    <script type="text/javascript">

        $('li a').click(function (e) {
            e.preventDefault();
            $('a').removeClass('active');
            $(this).addClass('active');
        });
    </script>
    <script src="./js/myJavaScript.js"></script>

    <!-- librerías opcionales que activan el soporte de HTML5 para IE8 -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</html>
