package com.fusion;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/mmm")
public class Redirect  extends HttpServlet{

	protected  void service(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
	{
		String mySearch = req.getParameter("search1");
		
		//res.sendRedirect("http://localhost:8080/LogIIn/abb"+mySearch);
		res.sendRedirect("https://www.google.com/search?q="+mySearch);
		System.out.println("hello");
		
	}

}
