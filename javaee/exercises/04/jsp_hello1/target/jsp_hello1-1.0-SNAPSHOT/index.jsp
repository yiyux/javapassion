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
            Name
            <input type="text" name="username" size="25"><br>
            Birthplace
            <input type="text" name="birthplace" size="15"><br>
            Nationality
            <input type="text" name="nationality" size="15"><br>
            <p></p>
            <input type="submit" value="Submit">
            <input type="reset" value="Reset">
        </form>

        <%
            String username = request.getParameter("username");
            String birthplace = request.getParameter("birthplace");
            String nationality = request.getParameter("nationality");
            
            if ( username != null && username.length() > 0 ) {
        %>
        <%@include file="response.jsp" %>
        <%
                }
        %>
        <br>
        <h2>Current datetime is
            <%@include file="middle.jsp" %>
        </h2>
        
       
        <%------------ commented out for now ------------
        <c:if test="${fn:length(param.username) > 0}" >
            <%@include file="response.jsp" %>
        </c:if>
        -------------------------------------------------%>
    </body>
</html>
