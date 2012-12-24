<html>
    <head><title>Hello</title></head>
    <body bgcolor="white">       
        <h2> Save attributes in page scope </h2>
        <%
            // Check if attribute has been set
            Object o = pageContext.getAttribute("com.mycompany.name1", PageContext.PAGE_SCOPE);
            if (o == null) {
                // The attribute com.mycompany.name1 may not have a value or may have the value null
            }

            // Save data
            // pageContext.setAttribute("com.mycompany.name1", "value0");  // PAGE_SCOPE is the default
            pageContext.setAttribute("com.mycompany.name1", "PageScopeAttribute", PageContext.PAGE_SCOPE);
            pageContext.setAttribute("com.mycompany.name2", "RequestScopeAttribute", PageContext.REQUEST_SCOPE);
            pageContext.setAttribute("com.mycompany.name3", "SessionScopeAttribute", PageContext.SESSION_SCOPE);
            pageContext.setAttribute("com.mycompany.name4", "ApplicationScopeAttribute", PageContext.APPLICATION_SCOPE);
        %>

        <%-- Show the values --%>
        <%= pageContext.getAttribute("com.mycompany.name1", PageContext.PAGE_SCOPE)%>
        <%= pageContext.getAttribute("com.mycompany.name2", PageContext.REQUEST_SCOPE)%>
        <%= pageContext.getAttribute("com.mycompany.name3", PageContext.SESSION_SCOPE)%>
        <%= pageContext.getAttribute("com.mycompany.name4", PageContext.APPLICATION_SCOPE)%>

        <h3>Hello, my name is Duke. What's yours?</h3>
        <form method="get">
            <input type="text" name="username" size="25">
            <p></p>
            <input type="submit" value="Submit">
            <input type="reset" value="Reset">
        </form>

        <%
            String username = request.getParameter("username");
            if (username != null && username.length() > 0) {
        %>
        <%@include file="response.jsp" %>
        <%            
            }
        %>
        
        <a href="anotherpage.jsp"> Display another page </a>

    </body>
</html>
