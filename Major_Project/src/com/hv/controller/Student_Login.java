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
 * Servlet implementation class Student_Login
 */
@WebServlet("/Student_Login")
public class Student_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static int stid=0;
	public static String uname,submit=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Student_Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher rd = request.getRequestDispatcher("/student_login.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user_name = (String) request.getParameter("username");
		String password = (String) request.getParameter("password");
		System.out.println(user_name);
		System.out.println(password);

		JDBC_DTO dto = new JDBC_DTO();
		JDBC_Demo studentDAO = new JDBC_Demo();
		dto.setUser_name(user_name.trim());
		dto.setPassword(password.trim());
		try {
			dto = JDBC_Demo.getStudentsByIdandPassword(dto);
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
				submit="submit";
                  RequestDispatcher rd = request.getRequestDispatcher("/design/Student_login1.jsp");
				// Cookie cookie = new Cookie("username",dto.getFirst_name());
	/*			session.setAttribute("user_name",dto.getUser_name());
				request.setAttribute("user_name", dto.getUser_name());*/
				session.setAttribute("user_name",dto.getUser_name());
				session.setAttribute("password",dto.getPassword());
				session.setAttribute("first_name",dto.getFirst_name());
				session.setAttribute("last_name",dto.getLast_name());
				session.setAttribute("enrollment_no",dto.getEnrollment_no());
				session.setAttribute("contact",dto.getContact_no());
				session.setAttribute("email",dto.getEmail());
				session.setAttribute("submit",submit);
				request.setAttribute("user_name", dto.getUser_name());
				session.setAttribute("id",dto.getId());
				request.setAttribute("id", dto.getId());
			    System.out.println("Id="+dto.getId());
			    stid = dto.getId();
			    uname = dto.getUser_name();
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
