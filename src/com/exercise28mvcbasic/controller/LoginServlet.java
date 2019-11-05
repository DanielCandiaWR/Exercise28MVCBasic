package com.exercise28mvcbasic.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//MIME type of the response object
		response.setContentType("text/html");
		//Assign the response object to output object
		//with the objective to reduce lines of code
		PrintWriter output = response.getWriter();
		
		//Get parameters
		String username = request.getParameter("txtUser");
		String password = request.getParameter("txtPass");
		
		output.append("<html>");
		output.append("<head>");
		output.append("<title>");
		output.append("Data input user");
		output.append("</title>");
		output.append("</head>");
		output.append("<body>");
		output.append("<h2>");
		output.append("Credentials fot the user!!");
		output.append("</h2>");
		output.append("<p>");
		output.append("User: "+username);
		output.append("</p>");
		output.append("<p>");
		output.append("Password: "+password);
		output.append("</p>");
		output.append("</body>");
		output.append("</html>");
		output.close();
		
		
		//response.getWriter().append("The user name is "+username);
		//response.getWriter().append("With Password "+password);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		
		PrintWriter output = response.getWriter();
		
		String username = request.getParameter("txtUser");
		String password = request.getParameter("txtPass");
		
		output.append("{");
		output.append("\"Username\":\""+username+"\",");
		output.append("\"Password\":\""+password+"\"");
		output.append("}");
		
		output.close();
	}

}
