package com.jm2008.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JavaServlet
 */
@WebServlet(urlPatterns = { "/php" }, initParams = { @WebInitParam(name = "trainerName", value = "Siaram"),
		@WebInitParam(name = "trainerMobile", value = "1234567") })
public class PhpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PhpServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("java-form.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String[] courses = request.getParameterValues("courses");

		String coursesAsString = "";
		for (int i = 0; i < courses.length; i++) {
			String comma = "";
			if(i < courses.length-1) {
				comma = ",";
			}
			coursesAsString = coursesAsString + courses[i] + comma;
		}

		ServletConfig cfg = getServletConfig();
		String trainerName = cfg.getInitParameter("trainerName");
		String trainerMobile = cfg.getInitParameter("trainerMobile");
		
		ServletContext ctx = cfg.getServletContext();
		String institute = ctx.getInitParameter("institute");

		String responseToUser = "Hello, " + name + " for " + coursesAsString + " " + trainerName
				+ " is trainer and his mobile number is " + trainerMobile +" in "+institute;

		PrintWriter out = response.getWriter();
		out.print(responseToUser);
	}

}
