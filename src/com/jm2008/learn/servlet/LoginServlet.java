package com.jm2008.learn.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/LoginServlet", "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("LoginServlet doGet()");
		response.sendRedirect("login.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("LoginServlet doPost()");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username);
		if (username.equalsIgnoreCase(password)) {
//			PrintWriter out = response.getWriter();
//			out.println("Hello, " + username);
			request.setAttribute("msg", "Login Successfull!!");
			RequestDispatcher rd = request.getRequestDispatcher("profile");
			rd.forward(request, response);
		} else {
			response.sendRedirect("https://www.google.com?q=audi");
//			response.sendRedirect("index.html");
		}
	}

}
