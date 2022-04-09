<%-- 
    Document   : tabuadaTagLib
    Created on : 08/04/2022, 19:13:59
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
        <c:set var="tabuada" scope="session" value="${param.tab}"></c:set>
        
        <c:forEach var="i" begin="1" end="10">
            <c:out value="${tabuada}"></c:out>
            x
            <c:out value="${i}"></c:out>
            =
            <c:out value="${i*tabuada}"></c:out>
            <br />
        </c:forEach>
    </body>
</html>
