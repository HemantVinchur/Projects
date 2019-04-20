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
 * Servlet implementation class Reply_Controller
 */
@WebServlet("/Reply_Controller")
public class Reply_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String registration_id ;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reply_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	/*	System.out.println("Do get");
		RequestDispatcher rd =  request.getRequestDispatcher("/design/reply.jsp");
		System.out.println("Do get");*/
		String st="";
		try {
			System.out.println("Do get");
			   registration_id = request.getParameter("reg_id");
			} catch (Exception e) {
				e.printStackTrace();
			}
		String message = (String)request.getParameter("message");
		String submit = (String)request.getParameter("submit");
		System.out.println("3");
		JDBC_DTO dto = new JDBC_DTO();
	JDBC_Demo dao = new JDBC_Demo();
	try {
		System.out.println("4");
		if("submit".equals(submit)){
			System.out.println("5");
			dto.setId(Integer.parseInt(registration_id));
		/*	dto.setFirst_name(first_name);
			dto.setLast_name(last_name);
			dto.setEmail(email);
			dto.setContact_no(contact_no);*/
	        dto.setReply(message);
		st = JDBC_Demo.addReply(dto);
		HttpSession session = request.getSession();

		session.setAttribute("st",st);
		request.setAttribute("st",st);

		System.out.println("6");
		}
		System.out.println("7");
		
		if("succcessfully updated".equals(st)){
			System.out.println("8");
			HttpSession session = request.getSession();
	/*		session.setAttribute("first_name",dto.getFirst_name());
			request.setAttribute("first_name", dto.getFirst_name());*/
/*			session.setAttribute("message",dto.getMessage());
			request.setAttribute("message", dto.getMessage());*/
			RequestDispatcher rd =  request.getRequestDispatcher("/design/reply_confirm.jsp");
			rd.forward(request, response);
		}else{
			/*request.setAttribute("message", dto.getMessage());*/
			RequestDispatcher rd =  request.getRequestDispatcher("/design/reply.jsp");
			rd.forward(request, response);
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	/*	// TODO Auto-generated method stub
		System.out.println("2");
		String st="";
		String first_name = (String)request.getParameter("fname");
		String last_name = (String)request.getParameter("lname");
		String email = (String)request.getParameter("email");
		String contact_no = (String)request.getParameter("phone");
		String message = (String)request.getParameter("message");
		String submit = (String)request.getParameter("submit");
		System.out.println("3");
		JDBC_DTO dto = new JDBC_DTO();
	JDBC_Demo dao = new JDBC_Demo();
	try {
		System.out.println("4");
		if("submit".equals(submit)){
			System.out.println("5");
			dto.setId(Integer.parseInt(registration_id));
			dto.setFirst_name(first_name);
			dto.setLast_name(last_name);
			dto.setEmail(email);
			dto.setContact_no(contact_no);
	        dto.setReply(message);
		st = JDBC_Demo.addReply(dto);
		System.out.println("6");
		}
		System.out.println("7");
		
		if("Your reply is successfully saved!!".equals(dto.getMessage())){
			System.out.println("8");
			HttpSession session = request.getSession();
			session.setAttribute("first_name",dto.getFirst_name());
			request.setAttribute("first_name", dto.getFirst_name());
			session.setAttribute("message",dto.getMessage());
			request.setAttribute("message", dto.getMessage());
			RequestDispatcher rd =  request.getRequestDispatcher("/design/reply_confirm.jsp");
			rd.forward(request, response);
		}else{
			request.setAttribute("message", dto.getMessage());
			RequestDispatcher rd =  request.getRequestDispatcher("/design/reply.jsp");
			rd.forward(request, response);
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
*/
		doGet(request, response);
}
}