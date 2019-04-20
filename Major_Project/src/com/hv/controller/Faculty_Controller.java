package com.hv.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hv.jdbc.JDBC_DTO;
import com.hv.jdbc.JDBC_Demo;

/**
 * Servlet implementation class Faculty_Controller
 */
@WebServlet("/Faculty_Controller")
public class Faculty_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static int faid=0;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Faculty_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher rd = request.getRequestDispatcher("/faculty_login.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("login controller");
		// TODO Auto-generated method stub
		String st = "";
		// PrintWriter out=response.getWriter();
		String user_name = (String) request.getParameter("username");
		String password = (String) request.getParameter("password");
		System.out.println(user_name);
		System.out.println(password);

		JDBC_DTO dto = new JDBC_DTO();
		JDBC_Demo studentDAO = new JDBC_Demo();
		dto.setUser_name(user_name.trim());
		dto.setPassword(password.trim());
		try {
			dto = JDBC_Demo.getCoordinatorByIdandPassword(dto);
			System.out.println("$$$$$$$$$$$");
			System.out.println(dto.getMessage());
			System.out.println(dto.getId());
			System.out.println("$$$$$$$$$$$");
			if ("Successfully saved!!".equals(dto.getMessage())) {
				System.out.println("1");

				HttpSession session = request.getSession();

                  Cookie cookie = new Cookie("user", dto.getUser_name());
//                  cookie.setPath("/MyApplication");
                  cookie.setHttpOnly(false);
                  cookie.setMaxAge(3600);
                  response.addCookie(cookie);
				
                  RequestDispatcher rd = request.getRequestDispatcher("/design/coordinator_login1.jsp");
				// Cookie cookie = new Cookie("username",dto.getFirst_name());
	/*			session.setAttribute("user_name",dto.getUser_name());
				request.setAttribute("user_name", dto.getUser_name());*/
				session.setAttribute("user_name",dto.getUser_name());
				request.setAttribute("user_name", dto.getUser_name());
				session.setAttribute("id",dto.getId());
				request.setAttribute("id", dto.getId());
			    System.out.println("Id="+dto.getId());
			    faid = dto.getId();
				rd.forward(request, response);
			}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
				request.setAttribute("msg", "username or password is incorrect!");
				rd.forward(request, response);
			}
//		rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}


}
