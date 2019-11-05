package com.exercise28mvcbasic.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdditionTwoNumbersServlet
 */
@WebServlet("/AdditionTwoNumbersServlet")
public class AdditionTwoNumbersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdditionTwoNumbersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int number1 = Integer.parseInt(request.getParameter("txtNumber1"));
		int number2 = Integer.parseInt(request.getParameter("txtNumber2"));
		int result = number1 + number2;
		response.getWriter().append("The sum of the two is: "+result);
	}

}
