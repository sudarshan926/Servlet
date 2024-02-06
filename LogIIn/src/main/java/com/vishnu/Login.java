package com.vishnu;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/abb")
public class Login extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		String myname =req.getParameter("name");
		String myemail=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		PrintWriter out=res.getWriter();
		if("sudrshans25@gmail.com".equals(myemail) && "Surya@1234".equals(pass)) {
			
			req.setAttribute("key","Sudarshan");
			HttpSession session=req.getSession();
			session.setAttribute("key","Sudarshan");
			RequestDispatcher  rd=req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, res);
		}
		else{
			res.setContentType("text/html");
			out.print("<h3 style='color:red'>Email and password didn't match...!<h3>");
			RequestDispatcher rd=req.getRequestDispatcher("/index.html");
			
			rd.include(req, res);
			}
		}
	}


