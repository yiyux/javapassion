<html>
    <head><title>Hello</title></head>
    <body bgcolor="white">       
     
        <h3>Hello, my name is Duke. What's yours?</h3>
        <form method="get">
            <input type="text" name="username" size="25">
            <p></p>
            <input type="submit" value="Submit">
            <input type="reset" value="Reset">
        </form>

        <%
            String username = request.getParameter("username");
            if ( username != null && username.length() > 0 ) {
               pageContext.setAttribute("username", username, PageContext.REQUEST_SCOPE);
        %>
        <jsp:forward page="response.jsp"/>
        <%
            }
        %>
        
    </body>
</html>
