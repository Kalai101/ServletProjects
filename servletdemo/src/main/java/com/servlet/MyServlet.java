package com.servlet;
//import java.io.*;  
import javax.servlet.*;  
//import javax.servlet.http.*;  
import java.io.IOException;
import java.io.PrintWriter;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MyServlet() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	
	
		
		response.setContentType("text/html");
		
		
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username"); 
		String Password = request.getParameter("password");
			
		
		if(Password.equals("Nitheesh@123")) {
			RequestDispatcher r = request.getRequestDispatcher("MyfirstServlet");
			r.forward(request, response);
		
		}
		else {
			out.println("Sorry  password is invalid");
			RequestDispatcher r = request.getRequestDispatcher("index.html");
			r.include(request, response);
		}
		
	}

	
	}


