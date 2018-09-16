package com.jm2008.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("RegisterServlet: doGet");
		response.sendRedirect("registration.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("RegisterServlet: doPost");
		response.setContentType("text/HTML");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		String[] courses = request.getParameterValues("courses");
		String city = request.getParameter("city");
		String comment = request.getParameter("comment");

		PrintWriter out = response.getWriter();
		out.println(name);
		out.println(email);
		out.println(mobile);
		out.println(age);
		out.println(gender);

		for (int i = 0; i < courses.length; i++) {
			out.println(courses[i]);
		}

		out.println(city);
		out.println(comment);
		out.println("<br />");
		out.println("<hr />");
		out.print("<table class='table'>\r\n" + 
				"  <thead>\r\n" + 
				"    <tr>\r\n" + 
				"      <th scope='col'>Attribute</th>\r\n" + 
				"      <th scope='col'>Value</th>\r\n" + 
				"    </tr>\r\n" + 
				"  </thead>\r\n" + 
				"  <tbody>\r\n" + 
				"    <tr>\r\n" + 
				"      <th scope='row'>Name</th>\r\n" + 
				"      <td>"+name+"</td>\r\n" + 
				"    </tr>\r\n" + 
				"    <tr>\r\n" + 
				"      <th scope='row'>Email</th>\r\n" + 
				"      <td>"+email+"</td>\r\n" + 
				"    </tr>\r\n" + 
				"    <tr>\r\n" + 
				"      <th scope='row'>Mobile</th>\r\n" + 
				"      <td>"+mobile+"</td>\r\n" + 
				"    </tr>\r\n" + 
				"  </tbody>\r\n" + 
				"</table>");
	}

}
