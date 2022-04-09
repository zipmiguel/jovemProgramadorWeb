<%-- 
    Document   : rodizio
    Created on : 08/04/2022, 20:51:00
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
        <h1>Dia do rodizio</h1>
        <c:choose>
            <c:when test="${param.finalPlaca == 1 or param.finalPlaca == 2}">
                <c:out value="Rodízio: Segunda-Feira"></c:out>
            </c:when>
            <c:when test="${param.finalPlaca == 3 or param.finalPlaca == 4}">
                <c:out value="Rodízio: Terça-Feira"></c:out>
            </c:when>
            <c:when test="${param.finalPlaca == 5 or param.finalPlaca == 6}">
                <c:out value="Rodízio: Quarta-Feira"></c:out>
            </c:when>
            <c:when test="${param.finalPlaca == 7 or param.finalPlaca == 8}">
                <c:out value="Rodízio: Quinta-Feira"></c:out>
            </c:when>
            <c:when test="${param.finalPlaca == 9 or param.finalPlaca == 0}">
                <c:out value="Rodízio: Sexta-Feira"></c:out>
            </c:when>
            <c:otherwise>
                <c:out value="Rodízio: Valor inválido!"></c:out>
            </c:otherwise>
        </c:choose>
    </body>
</html>
