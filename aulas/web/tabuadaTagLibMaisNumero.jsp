<%-- 
    Document   : tabuadaTagLibMaisNumero
    Created on : 08/04/2022, 19:39:15
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
        <c:forTokens items="${param.tab}" delims="," var="tabuada">
            <c:if test="${tabuada >= 1 and tabuada <= 10}">
                <c:forEach var="i" begin="1" end="10">
                    <c:out value="${tabuada} x ${i} = ${tabuada*i}"></c:out>
                    <br />
                </c:forEach>
                    <hr>
            </c:if>
        </c:forTokens>
    </body>
</html>
