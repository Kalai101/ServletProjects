package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;

public class MyfirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MyfirstServlet() {
        super();
        
    }

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
		String name = request.getParameter("username");
	    PrintWriter out = response.getWriter();  
	    out.println("<h2>Welcome,"+name+"</h2>");      
	}

}