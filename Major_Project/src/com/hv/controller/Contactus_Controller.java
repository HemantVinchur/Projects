package com.hv.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hv.jdbc.JDBC_DTO;
import com.hv.jdbc.JDBC_Demo;

/**
 * Servlet implementation class Contactus_Controller
 */
@WebServlet("/Contactus_Controller")
public class Contactus_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String registration_id ;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contactus_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher rd =  request.getRequestDispatcher("/design/contactus.jsp");
		try {
			   registration_id = request.getParameter("reg_id");
			} catch (Exception e) {
				e.printStackTrace();
			}

		rd.forward(request, response);
		System.out.println("1");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*doGet(request, response);*/
		
		System.out.println("2");
		String st="";
		String message = (String)request.getParameter("message");
		String submit = (String)request.getParameter("submit");
		System.out.println("3");
		JDBC_DTO dto = new JDBC_DTO();
	JDBC_Demo dao = new JDBC_Demo();
	try {
		System.out.println("4");
		if("submit".equals(submit)){
			System.out.println("5");
			System.out.println(registration_id);
			dto.setUser_name(registration_id);
	        dto.setFeedback(message);
		st = JDBC_Demo.updateStudentFeedback(dto);
		System.out.println("6");
		}
		System.out.println("7");
		
		if("succcessfully updated".equals(st)){
			System.out.println("8");
			HttpSession session = request.getSession();
/*			session.setAttribute("first_name",dto.getFirst_name());
			request.setAttribute("first_name", dto.getFirst_name());*/
			session.setAttribute("message",dto.getMessage());
			request.setAttribute("message", dto.getMessage());
			session.setAttribute("name",dto.getUser_name());
			request.setAttribute("name", dto.getUser_name());
			RequestDispatcher rd =  request.getRequestDispatcher("/design/feedback_confirm.jsp");
			rd.forward(request, response);
		}else{
			request.setAttribute("message", dto.getMessage());
			RequestDispatcher rd =  request.getRequestDispatcher("/design/contactus.jsp");
			rd.forward(request, response);
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
