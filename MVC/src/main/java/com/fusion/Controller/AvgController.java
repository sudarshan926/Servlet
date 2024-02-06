package com.fusion.Controller;

import java.io.IOException;

import com.fusion.mvcModel.AvgCalculator;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/AvgController")
public class AvgController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num1 = Integer.parseInt(req.getParameter("number1"));
		int num2 = Integer.parseInt(req.getParameter("number2"));
		
		AvgCalculator model = new AvgCalculator();
		int calc = model.calc(num1, num2);
		int sub = model.sub(num1, num2);
		req.setAttribute("result", calc);
		req.setAttribute("sub", sub);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/result.jsp");
		dispatcher.forward(req, resp);
		RequestDispatcher dispatcher1 = req.getRequestDispatcher("/sub.jsp");
		dispatcher1.forward(req, resp);

	}
}
