<html>
    <head><title>Hello</title></head>
    <body bgcolor="white">       
        <h2> Examples of expression </h2>
        <h3>Current time: <%= new java.util.Date() %></h3>
        <h3>Random number: <%= Math.random() %></h3>
        
        <h3>Your hostname: <%= request.getRemoteHost() %></h3>
        <h3>Your parameter: <%= request. getParameter("username") %></h3>
        <h3>Server: <%= application.getServerInfo() %></h3>
        <h3>Session ID: <%= session.getId() %></h3>
        
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
        %>
        <%@include file="response.jsp" %>
        <%
                }
        %>
        
    </body>
</html>
