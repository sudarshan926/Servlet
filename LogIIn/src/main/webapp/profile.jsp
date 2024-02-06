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
  String myname= (String)session.getAttribute("key");
%>
   <h1> Wellcome :<%=myname %></h1>
  <a href="home.jsp">Home</a> &nbsp;,&nbsp;
  <a href="about.jsp">About_Us</a> 
</body>
</html>