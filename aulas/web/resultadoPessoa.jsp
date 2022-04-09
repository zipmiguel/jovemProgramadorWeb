<%-- 
    Document   : resultadoPessoa
    Created on : 06/04/2022, 21:23:53
    Author     : miguel.philippi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultado</h1>
        olá, ${param.nome} <br /><br />
        Você é ${param.idade >=18 ? 'maior de idade' : 'menor de idade'}<br /><br />
        <c:out value="Olá com taglib"></c:out>
    </body>
</html>
