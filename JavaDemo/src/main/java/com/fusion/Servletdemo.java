package com.fusion;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.DispatcherType;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

  @WebServlet("/Servletdemo")


public class Servletdemo extends HttpServlet
{
	 protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
	 String name1=req.getParameter("Name1");
	 String email1=req.getParameter("Email1");
	 String password=req.getParameter("Pass1");
	 
	 PrintWriter out= res.getWriter();
	out.println("Name:"+name1);
	out.println("Email:"+email1);
	out.println("Password:"+password);
		 
	}
}


