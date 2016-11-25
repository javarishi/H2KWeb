package com.learn.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoggingFilter implements Filter{
	
	String configParam = null;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		configParam = filterConfig.getInitParameter("FilterParam");
		System.out.println("This is init method of Filter. Read FilterParam :: " + configParam);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		// Part 1 - intercepting request
		System.out.println("Logging incoming request :: " + request.getRemoteAddr());
		// TODO Auto-generated method stub
		// Pass the control to next filter or Servlet
		chain.doFilter(request, response);
		
		// Part 3 - manipulating response
		System.out.println("Resonse ::  " + response.getContentType());
		
	}

	
	@Override
	public void destroy() {
		System.out.println("Filter is Destroyed");
	}
}
