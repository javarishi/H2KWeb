package com.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecondServlet extends HttpServlet{

	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {

		HttpSession session = req.getSession();
		PrintWriter out = resp.getWriter();
		if(session != null){
			out.println(" Session is not null");
			String value = (String) session.getAttribute("AttrName1");
			out.println(" Value of Attr1 :: " + value);
		}
		
		Enumeration<String> attrEnum = session.getAttributeNames();
		String attrName =  null;
		while(attrEnum.hasMoreElements()){
			attrName = attrEnum.nextElement();
			out.println(" Name :: " + attrName + " Value :: " + session.getAttribute(attrName));
			out.println("\n");	
		}
		
		
		ServletContext context = getServletContext(); // getting it from Parent
		context.setAttribute("contextAttr1", "contextAttr1"); // Global Atribute - everyone can see it
		
		
		ServletConfig config = getServletConfig();
		Enumeration<String> paramNames = config.getInitParameterNames();
		String name = null;
		while(paramNames.hasMoreElements()){
			name = paramNames.nextElement();
			out.println(" ParamName ::  " + name + " Parameter Value :: " + config.getInitParameter(name));
		}
		
	}
}
