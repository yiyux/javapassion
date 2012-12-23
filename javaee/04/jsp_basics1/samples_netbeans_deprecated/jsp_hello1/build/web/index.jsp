<%------------------ commented out for now ---------------------------
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
---------------------------------------------------------------------%>
<html>
    <head><title>Hello</title></head>
    <body bgcolor="white">
        <img src="duke.waving.gif"> 
        <h2>Hello, my name is Duke. What's yours?</h2>
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
        
        <%------------ commented out for now ------------
        <c:if test="${fn:length(param.username) > 0}" >
            <%@include file="response.jsp" %>
        </c:if>
        -------------------------------------------------%>
    </body>
</html>
