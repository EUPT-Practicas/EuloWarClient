<%-- 
    Document   : error
    Created on : 19-may-2015, 18:32:10
    Author     : Sergio
--%>

<%
    String error = (String) request.getParameter("mensaje");
    %>

<div class="alert alert-danger" role="alert">
    <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
    <span class="sr-only">Error:</span>
    <%= error %>
</div>
