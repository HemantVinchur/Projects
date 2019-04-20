package com.hv.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hv.jdbc.JDBC_DTO;
import com.hv.jdbc.JDBC_Demo;

/**
 * Servlet implementation class Event_Coordinator
 */
@WebServlet("/Event_Coordinator")
public class Event_Coordinator extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String registration_id ;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Event_Coordinator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher rd =  request.getRequestDispatcher("/design/Coordinator.jsp");
		try {
			   registration_id = request.getParameter("reg_id");
			} catch (Exception e) {
				e.printStackTrace();
			}
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String st="";
//		String id = (String)request.getParameter("first_name");
		String first_name = (String)request.getParameter("first_name");
		String last_name = (String)request.getParameter("last_name");
		String contact = (String)request.getParameter("phone");
		String email = (String)request.getParameter("email");
		String user = (String)request.getParameter("user");
		String password = (String)request.getParameter("password");
		String submit = (String)request.getParameter("submit");
		JDBC_DTO dto = new JDBC_DTO();
		JDBC_Demo dao = new JDBC_Demo();
		System.out.println("Yes1");
		try {
			System.out.println("Yes2");
			if("submit".equals(submit)){
				System.out.println("Yes3");
				dto.setId(Integer.parseInt(registration_id));
				dto.setFirst_name(first_name);
				dto.setLast_name(last_name);
				dto.setContact_no(contact);
				dto.setEmail(email);
				dto.setUser_name(user);
				dto.setPassword(password);
			st = JDBC_Demo.add_Coordinator(dto);
			System.out.println("Yes4");
			}
			if("Succcessfully saved".equals(st)){
				System.out.println("Yes5");
				request.setAttribute("message",st);
				RequestDispatcher rd =  request.getRequestDispatcher("/design/event_coordinator.jsp");
				rd.forward(request, response);
				out.println("Event is successfully added.");
				System.out.println("Successfully inserted");
			}else{
				request.setAttribute("message", st);
				System.out.println("Not inserted");
				RequestDispatcher rd =  request.getRequestDispatcher("/design/Coordinator.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
