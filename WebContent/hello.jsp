<%@ page 
	language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello JSP Page</title>
</head>
<body>
<br> 
<h2>Hello H2K Students</h2>
<%! int i = 0;
	String name = "MyName" ;%>
<%
	out.println("Your IP Address is " + request.getRemoteAddr());
	out.println("Hello  " + name);
	request.setAttribute("Name", "Value");
	
	pageContext.setAttribute("Name","Value", PageContext.SESSION_SCOPE);  
	
	String value =  (String )pageContext.getAttribute("Name", PageContext.APPLICATION_SCOPE);
	out.println("value  " + value + "\n\n");
	out.print("Origin" + request.getAttribute("Origin"));
	
%>
<p>
<%-- This is JSP Comment
	You can go multi-line with this
 --%>
Today's date: <%= (new java.util.Date()).toLocaleString()%>
</p>
<%@ include file="footer.jsp" %>
</body>
</html>