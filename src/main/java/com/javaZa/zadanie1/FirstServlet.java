package com.javaZa.zadanie1;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet({ "/FirstServlet", "/Serv" })
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static Integer registeredUsers;
	private static Storage storage;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        storage = new Storage();
        registeredUsers = storage.getUsers().size();
    }
    

	private boolean isFull(ServletContext context) {
		if ( context.getAttribute("registeredUser") == null){
			context.setAttribute("registeredUser", 0);
			return false;
		} else
		return (Integer)context.getAttribute("registeredUser") >= 5;
	}

	private boolean isRegistered(HttpSession session) {
		return session.getAttribute("name") != null;
	}

    
    private void noAccess(HttpServletRequest request, HttpServletResponse response){
    	HttpSession session = request.getSession();
    	if (isRegistered(session)) {
    		try {
    			response.sendRedirect("./already.jsp");
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    		return;
    	}
    }
    
    private void full(HttpServletRequest request, HttpServletResponse response){
    	ServletContext context = request.getServletContext();
    	if (isFull(context)) {
    		try {
    			response.sendRedirect("./full.jsp");
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	} return;
    }

    private void register(HttpServletRequest request, HttpServletResponse response) {
    	String firstName = request.getParameter("firstName");
    	String lastName = request.getParameter("lastName");
    	String email = request.getParameter("email");
    	String repeatEmail = request.getParameter("repeatEmail");
    	String company = request.getParameter("company");
    	String job = request.getParameter("job");
    	String info = request.getParameter("info");
    	
    	User user = new User(firstName, lastName, email, repeatEmail, company, job, info);
    	storage.getUsers().put(firstName, user);
    	try {
    		response.getWriter().println(user);
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    	
    	registeredUsers = storage.getUsers().size();
    	HttpSession session = request.getSession();
    	ServletContext context = request.getServletContext();
    	session.setAttribute(firstName, firstName);
    	context.setAttribute("registeredUser", registeredUsers);
    	
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		noAccess(request, response);
		full(request, response);
		register(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
