package com.Surya.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet( "/Arithmetic")
public class Arithmetic extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		if( req.getParameter("number1")!=null && req.getParameter("number2")!=null) {
			int a= Integer.parseInt(req.getParameter("number1"));
			int b= Integer.parseInt(req.getParameter("number2"));
			PrintWriter pw=resp.getWriter();
			 pw.println("Addition of Two number Is: "+(a + b));
			 
			 System.out.println("Value OF a :"+a);
			 System.out.println("Value OF b :"+b);
			 System.out.println("Additon of A and B =:"+b);
		}	
		if( req.getParameter("number1")!=null && req.getParameter("number2")!=null) {
			int a= Integer.parseInt(req.getParameter("number1"));
			int b= Integer.parseInt(req.getParameter("number2"));
			PrintWriter pw=resp.getWriter();
			 pw.println("Addition of Two number Is: "+(a + b));
			 
			 System.out.println("Value OF a :"+a);
			 System.out.println("Value OF b :"+b);
			 System.out.println("Addition  of A and B =:"+ (a+b));
		}	
	}
}
