<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="com.yourpackage.model.Ebook" %>

<%@ page import="com.yourpackage.dao.EbookDAO"%>

<!DOCTYPE html>
<html>
<head>
    <title>View eBooks</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <h1>My eBooks</h1>
    <ul>
        <%-- Use Java to retrieve eBooks from the database and display them --%>
        <%
            List<Ebook> ebooks = EbookDAO.getAllEbooks(); // Implement this DAO method
            for (Ebook ebook : ebooks) {
        %>
            <li><%= ebook.getTitle() %></li>
        <%
            }
        %>
    </ul>
    <a href="index.jsp">Create New eBook</a>
</body>
</html>
