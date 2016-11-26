package com.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		HttpSession session = req.getSession(); // create session
		
		PrintWriter writer = resp.getWriter();
		writer.println("<HTML><HEAD><TITLE>Session Count</TITLE></HEAD>");
		writer.println("<BODY><H1>Session Count</H1>");
		
		writer.println("Is New Session :: " + session.isNew());
		writer.println("Session timeout :: " + session.getMaxInactiveInterval());
		writer.println("Creation Time " + session.getCreationTime());
		
		writer.println("Click <A HREF=\"" + resp.encodeURL(req.getContextPath() + "/hello") + "\">here</A>");
		
		writer.println("</BODY></HTML>");
		
	}
}
