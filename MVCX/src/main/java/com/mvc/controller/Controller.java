package com.mvc.controller;

import java.io.IOException;

import com.mvc.servlet.calculator.Calculator;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Controller")
public class Controller extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int num1=Integer.parseInt(request.getParameter("Number1"));
		int num2=Integer.parseInt(request.getParameter("Number2"));
		
		Calculator model= new Calculator();
		int calc=model.cal(num1,num2);
		
		request.setAttribute("result",calc);
		RequestDispatcher Rd=request.getRequestDispatcher("/result.jsp");
		Rd.forward(request, response);
		
	}

}
