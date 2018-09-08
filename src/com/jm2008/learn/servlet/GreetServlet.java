package com.jm2008.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("nm");
		System.out.println("doGet is running " + name);

		PrintWriter out = resp.getWriter();
		out.println("Good Morning, " + name);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("nm");
		System.out.println("doPost is running " + name);
		
		PrintWriter out = resp.getWriter();
		out.println("Good Morning, " + name);
	}

}
