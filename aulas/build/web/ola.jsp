<%-- 
    Document   : ola
    Created on : 06/04/2022, 21:00:47
    Author     : miguel.philippi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tabuada</h1>
        <%
            int tab = 5;
            for(int i=1; i<=10; i++){
                out.println(tab + " x " + i + " = " + tab*i + "<br />");
            }
        %>
    </body>
</html>
