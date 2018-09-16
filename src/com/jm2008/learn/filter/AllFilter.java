package com.jm2008.learn.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class AllFilter implements Filter {

   
    public AllFilter() {
    }

	
	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// place your code here
		System.out.println("Preprocessing....");

		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		System.out.println("Postprocessing...");
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
