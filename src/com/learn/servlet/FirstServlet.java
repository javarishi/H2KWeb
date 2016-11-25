package com.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		String contentType = req.getContentType();
		System.out.println("Content Type :: " + contentType);
		
		String contextPath = req.getContextPath();
		System.out.println("Context Path :: " + contextPath);
		
		// get cookies
		Cookie[] cookies = req.getCookies();
		if(cookies != null){
			for(Cookie coo : cookies){
				System.out.println(coo.getName() + "  " + coo.getValue() );
			}
		}
		PrintWriter out = resp.getWriter();
		resp.addHeader("StringName", "Value");
		//resp.addHeader("Refresh", "1");
	
		//out.println(" Show me time :: " + Calendar.getInstance().getTime());
		
		HttpSession session = req.getSession(false);
		if(session == null){
			out.println("Session is Null so creating a new session \n\n");
		}
		session = req.getSession();
		if(session != null){
			out.println("Session is now created " + session.toString());
		}
		
		session.setAttribute("AttrName1", "AttrValue1");
		session.setAttribute("AttrName2", "AttrValue2");
		session.setAttribute("AttrName3", "AttrValue3");
		session.setAttribute("AttrName4", "AttrValue4");
		// resp.sendRedirect("hello");
	}

}
