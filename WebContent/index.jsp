<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page of No Use</title>
</head>
<body>
<%
	// response.sendRedirect("http://www.h2kinfosys.com");
	request.setAttribute("Origin" , "FromIndexJSP");
	RequestDispatcher rd = request.getRequestDispatcher("hello.jsp");
	
	rd.forward(request, response);
%>
</body>
</html>