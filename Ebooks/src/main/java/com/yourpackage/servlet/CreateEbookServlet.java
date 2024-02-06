
package com.yourpackage.servlet;


import java.io.IOException;
import java.sql.SQLException;

import com.yourpackage.dao.EbookDAO;
import com.yourpackage.model.Ebook;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CreateEbookServlet")
public class CreateEbookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        
        // Create a new eBook
        Ebook ebook = new Ebook(title, content);
        
        try {
			EbookDAO.saveEbook(ebook);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        response.sendRedirect("index.jsp"); // Redirect to the main page after creating an eBook
    }
}

