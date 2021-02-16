package com.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OldServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter out=res.getWriter();
		//ServletContext -Used when Several Servlets needs a particular value
		ServletContext ctxt=getServletContext();
		String name = ctxt.getInitParameter("Name");
		String desc = ctxt.getInitParameter("Desc");
		
		out.println(name+" with "+desc+"<br>");
		
		//ServletConfig - Used when a particular Servlet needs separate value
		ServletConfig cg=getServletConfig();
		String name1 = cg.getInitParameter("Name");
		String desc1 = cg.getInitParameter("Desc");
		
		out.println(name1 +" with "+desc1);
		
	}
}
