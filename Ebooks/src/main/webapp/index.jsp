<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Online eBook Maker</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <h1>Create Your eBook</h1>
    <form action="CreateEbookServlet" method="post">
        <input type="text" name="title" placeholder="Enter eBook Title" required>
        <textarea name="content" placeholder="Enter eBook Content" required></textarea>
        <button type="submit">Create eBook</button>
    </form>
    <a href="view_ebooks.jsp">View eBooks</a>
</body>
</html>
