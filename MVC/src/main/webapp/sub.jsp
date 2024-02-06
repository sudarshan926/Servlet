<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%	
 int show = (Integer)request.getAttribute("sub");
 out.println("<b> The Substraction Is :"+show +"<b>");
%>
</body>
</html>