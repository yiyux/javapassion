<%-- 
    Document   : response2.jsp
    Created on : 28-12-2012, 12:43:08 AM
    Author     : yiyo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Time</title>
    </head>
    <body>
        <h1>The actual time is
            <jsp:expression>pageContext.getAttribute("currentdate", PageContext.REQUEST_SCOPE)</jsp:expression>
        </h1>
    </body>
</html>
