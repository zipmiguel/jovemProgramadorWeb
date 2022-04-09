<%-- 
    Document   : formPessoa
    Created on : 06/04/2022, 21:19:00
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
        <form action="resultadoPessoa.jsp">
            <label>Nome</label><br />
            <input type="text" name="nome" /><br />
            
            <label>Idade</label><br />
            <input type="text" name="idade" /><br />
            
            <input type="submit" value="Avançar" /><br />
        </form>
    </body>
</html>
