package com.jm2008.learn.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/login")
public class LoginFilter implements Filter {

	public LoginFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String userName = request.getParameter("username");
		System.out.println("LoginFilter preprocessing: " + userName);
		if (userName != null && userName.equals("subham@abc")) {
			System.out.println("You are bloacked.");
		} else {
			// pass the request along the filter chain
			chain.doFilter(request, response);
		}

		System.out.println("LoginFilter posprocessing: " + request.getAttribute("msg"));
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
