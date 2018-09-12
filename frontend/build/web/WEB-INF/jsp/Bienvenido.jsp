<%-- 
    Document   : Bienvenido
    Created on : 31/01/2017, 10:29:13 PM
    Author     : Usuario
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       
    </head>
    <body>
        <h1>Bienvenido!</h1>
        <c:forEach items="${requestScope.listauser}" var="users">
            <c:out value="${users.nickUsuario}"></c:out>
            
            
        </c:forEach>
            
            
        
    </body>
</html>
