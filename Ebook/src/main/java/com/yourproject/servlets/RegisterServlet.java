package com.yourproject.servlets;

import java.io.IOException;

import com.yourproject.User;
import com.yourproject.dao.UserDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = new User(username, password);
        user.setUsername(username);
        user.setPassword(password);

        // Perform user registration
        UserDAO userDAO = new UserDAO(null);
        boolean registrationSuccess = userDAO.register(user);

        if (registrationSuccess) {
            response.sendRedirect("success.jsp");
        } else {
            // Handle registration failure (e.g., redirect back to registration form with an error message)
            response.sendRedirect("register.jsp?error=true");
            System.out.println("Not rechables");
        }
    }
}
