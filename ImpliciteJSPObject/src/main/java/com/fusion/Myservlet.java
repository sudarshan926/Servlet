package com.fusion;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/acd")
public class Myservlet  extends HttpServlet{
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  PrintWriter out = resp.getWriter();
		  
		  String email=req.getParameter("t1");
		  String password=req.getParameter("t2");
		  
		  out.println("email1 :"+email);
		  out.println("pass1 :"+password);
		  
	}
}
