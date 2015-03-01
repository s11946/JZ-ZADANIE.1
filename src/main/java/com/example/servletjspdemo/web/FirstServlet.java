package com.example.servletjspdemo.web;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String company = request.getParameter("company");
		String info = request.getParameter("info");
		String job = request.getParameter("job");
		
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
			session.setAttribute("email", email);
			if (session.getAttribute(email).equals(email));

			

		response.getWriter().println("Hello "+ firstName +" " + lastName +"!");
		response.getWriter().println("Twoje dane");
		response.getWriter().println("email: "+ email +" Company: "+ company);
		response.getWriter().println("info: "+ info +" Job "+ job);
	//	response.getWriter().println("Hello from session "+ session.getAttribute("firstName")+"!");
	//	response.getWriter().println("Hello from context "+ context.getAttribute("firstName")+"!");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
