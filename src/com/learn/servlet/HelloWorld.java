package com.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloWorld extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("This Servlet is taking Birth");
	}
	
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// getting details from request
		 String simpleParm =  req.getParameter("name");
		 PrintWriter writer = resp.getWriter();
		 Enumeration<String> params = req.getParameterNames();
		 String param;
		 if(params != null){
			 while(params.hasMoreElements()){
				 param = params.nextElement();
				 writer.println("ParameterName :: " + param + " ParameterValue :: " + req.getParameter(param)) ;
			 }
		 }
		 
		 Enumeration<String> headers = req.getHeaderNames();
		 String header;
		 while(headers.hasMoreElements()){
			 header = headers.nextElement();
			 writer.println("HeaderName : " + header + " HeaderValue:: " + req.getHeader(header));
		 }
		 
		 req.setAttribute("AttrName1", "AttrValue1");
		 req.setAttribute("AttrName2", "AttrValue2");
		 req.setAttribute("AttrName3", "AttrValue3");
		 req.setAttribute("AttrName4", "AttrValue4");
		 
		 Enumeration<String> attributes = req.getAttributeNames();
		 String attrs;
		 while(attributes.hasMoreElements()){
			 attrs = attributes.nextElement();
			 writer.println("AttributeName : " + attrs + " AttributeValue:: " + req.getAttribute(attrs));
		 }
		 
		 System.out.println("I read my First Parameter :: " + simpleParm);
		
		 writer.println("Hello World :: " + simpleParm );
		 System.out.println(" I am not sending the response");
		 resp.flushBuffer();
		
	}
	
	@Override
	public void destroy() {
		System.out.println("This Servlet is destroyed");
	}
}
