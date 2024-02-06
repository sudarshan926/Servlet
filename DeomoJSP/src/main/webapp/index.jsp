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
   int a=10;
  int b=20;
  out.println("b :"+b);
  out.println("a :"+a);
  if(a>b){
	  out.println("a is greter than b");
  }
  else if(a==b){
	  out.println("a is equals b");
  }
  else if(a<=b){
	  out.println(" b is gretest a");
  }
  
  for(int i=0;i<=5;i++){
	 out.println(i);
  }
%>

<%=a %>
<%=b %>
<%=Math.random()%>
</body>
</html>