<%-- 
    Document   : home
    Created on : 20/10/2022, 22:34:46
    Author     : ramir
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <% 
        response.setHeader("Cache-Control", "nocache, no-store, must-revalidate");
        if(session.getAttribute("user")==null){
            response.sendRedirect("index.jsp");
        }
    %>
    <body>
        <h1>MENU</h1>
        
        <a href="Logout">Cerrar Sesion - ${UsuarioLogueado}</a>
    </body>
</html>
