<html>
    <head><title>Response</title></head>
    <body bgcolor="white"> 
        <h2><font color="black">Hello, <%= pageContext.getAttribute("username", PageContext.REQUEST_SCOPE)%>!</font></h2>
    </body>
    <jsp:scriptlet>
        String currentDate = new java.util.Date().toString();
        pageContext.setAttribute("currentdate", currentDate, PageContext.REQUEST_SCOPE);
    </jsp:scriptlet>
    <jsp:forward page="response2.jsp"/>
</html>












