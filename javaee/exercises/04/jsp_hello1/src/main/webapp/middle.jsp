<%-- 
    Document   : middle
    Created on : 23-12-2012, 11:45:17 PM
    Author     : yiyo
--%>

<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<% DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm");
String formattedDate = df.format(new Date()); %>

<%= formattedDate%>
