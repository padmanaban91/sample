package com.padhu.jsp.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class XmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("The is from xml servlet");
		response.setContentType("text/html");
		
		//System.out.println("Params: " + request.getParameterMap());
		for (String key : request.getParameterMap().keySet()) {
			System.out.println(key + " : " + request.getParameter(key));			
		}
		response.getWriter().println("<h1>Hello Kadavule!!!</h1>");
		response.getWriter().println("<h1>Hello Theivame!!!</h1>");
		response.getWriter().println("<h1>" + request.getParameter("name")+ "... my Dear!!!</h1>");
		
		response.getWriter().println("Request param: " + request.getParameter("name"));
		HttpSession httpSession = request.getSession();
		ServletContext servletContext = request.getServletContext();
		if (request.getParameter("name") != null && request.getParameter("name") != "") {
			servletContext.setAttribute("name", request.getParameter("name"));
			httpSession.setAttribute("name", request.getParameter("name"));
		}
		response.getWriter().println("Http Session Value : " + httpSession.getAttribute("name"));
		response.getWriter().println("Servlet Context Value : " + servletContext.getAttribute("name"));
		
		response.getWriter().println("<br><br><a href=\"Rest.html\">Back</a>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {System.out.println("The is from xml servlet");
		response.setContentType("text/html");
		
		//System.out.println("Params: " + request.getParameterMap());
		for (String key : request.getParameterMap().keySet()) {
			System.out.println(key + " : " + request.getParameter(key));			
		}
		response.getWriter().println("<h1>Hello Kadavule!!!</h1>");
		response.getWriter().println("<h1>Hello Theivame!!!</h1>");
		response.getWriter().println("<h1>" + request.getParameter("name")+ "... my Dear!!!</h1>");
		
		response.getWriter().println("Request param: " + request.getParameter("name"));
		HttpSession httpSession = request.getSession();
		ServletContext servletContext = request.getServletContext();
		if (request.getParameter("name") != null && request.getParameter("name") != "") {
			servletContext.setAttribute("name", request.getParameter("name"));
			httpSession.setAttribute("name", request.getParameter("name"));
		}
		response.getWriter().println("Http Session Value : " + httpSession.getAttribute("name"));
		response.getWriter().println("Servlet Context Value : " + servletContext.getAttribute("name"));
		
		response.getWriter().println("<br><br><a href=\"Rest.html\">Back</a>");
	}

}
