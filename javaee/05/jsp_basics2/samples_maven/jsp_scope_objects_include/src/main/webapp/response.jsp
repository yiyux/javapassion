<h2><font color="black">Hello, <%= username%>!</font></h2>

<%-- Show the values --%>
<%= pageContext.getAttribute("com.mycompany.name1", PageContext.PAGE_SCOPE)%>
<%= pageContext.getAttribute("com.mycompany.name2", PageContext.REQUEST_SCOPE)%>
<%= pageContext.getAttribute("com.mycompany.name3", PageContext.SESSION_SCOPE)%>
<%= pageContext.getAttribute("com.mycompany.name4", PageContext.APPLICATION_SCOPE)%>

<br/>
<br/>












