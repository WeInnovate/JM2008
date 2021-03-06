package com.jm2008.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProfileServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("msg", "Login Successfull!!!");
		request.setAttribute("temp", "Remove it");
		request.removeAttribute("temp");
		System.out.println("Profile doPost()");
		String username = request.getParameter("username");
		PrintWriter out = response.getWriter();
		out.println("Hello, " + username + "\n" + request.getAttribute("msg"));
	}

}
