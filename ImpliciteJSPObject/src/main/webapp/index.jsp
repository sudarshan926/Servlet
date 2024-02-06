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
  String name="Sudarshan surnar";
  out.print(name);
%>
<%
     session.setAttribute("session_name", "fusion_institute");
%>

<form action="output.jsp" method="get">
<input type="text" name="t1" placeholder="name"> 
<input type="Submit" value="Click me">
</form>
</body>
</html>