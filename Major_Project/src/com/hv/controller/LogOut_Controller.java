package com.hv.controller;

import java.io.IOException;
/*import java.io.PrintWriter;

import javax.servlet.FilterChain;
*/import javax.servlet.RequestDispatcher;
//import javax.servlet.Servlet;
import javax.servlet.ServletException;
/*import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;*/
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogOut_Controller
 */
@WebServlet("/LogOut_Controller")
public class LogOut_Controller extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogOut_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }
    


/*    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        HttpSession session = request.getSession(false);         
        if  (session == null || session.getAttribute("username") == null) {
            response.sendRedirect("index.jsp"); // No logged-in user found, so redirect to login page.
        } else {
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
            response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
            response.setDateHeader("Expires", 0);
            chain.doFilter(req, res);  
        }


    }*/
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		try{
			System.out.println("1");
			HttpSession session = request.getSession(false);
		     Cookie cookie = new Cookie("user", null); // Not necessary, but saves bandwidth.
            // cookie.setPath("/MyApplication");
             cookie.setHttpOnly(false);
             cookie.setMaxAge(0); // Don't set to -1 or it will become a session cookie!
             response.addCookie(cookie);
			if(session!=null){
				session.setAttribute("user_name", "");
				session.invalidate();
				RequestDispatcher rd = request.getRequestDispatcher("Login_Controller");
				rd.include(request, response);	
				System.out.println("2");
				System.out.println("3");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}	
		System.out.println("logout controller");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);

                       Cookie cookie = new Cookie("user", null); // Not necessary, but saves bandwidth.
                       cookie.setPath("/MyApplication");
                       cookie.setHttpOnly(true);
                       cookie.setMaxAge(0); // Don't set to -1 or it will become a session cookie!
                       response.addCookie(cookie);
		System.out.println("logout controller");
	}

}
