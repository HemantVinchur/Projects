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
 * Servlet implementation class Event_Controller
 */
@WebServlet("/Event_Controller")
public class Event_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Event_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher rd =  request.getRequestDispatcher("/design/event1.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out=response.getWriter();
		String st="";
		String event_name = (String)request.getParameter("ename");
		String department = (String)request.getParameter("dname");
		String description = (String)request.getParameter("email");
		String venue = (String)request.getParameter("phone");
		String date = (String)request.getParameter("dphone");
		String time = (String)request.getParameter("tphone");
		String submit = (String)request.getParameter("submit");
		JDBC_DTO dto = new JDBC_DTO();
		JDBC_Demo dao = new JDBC_Demo();
		try {
			if("submit".equals(submit)){
				dto.setEvent_name(event_name);
				dto.setDepartment(department);
				dto.setDescription(description);
				dto.setVenue(venue);
				dto.setDate(date);
				dto.setTime(time);
			st = JDBC_Demo.add_Student(dto);
			}
			if("Succcessfully saved".equals(st)){
				request.setAttribute("message",st);
				RequestDispatcher rd =  request.getRequestDispatcher("/design/event2.jsp");
				rd.forward(request, response);
				out.println("Event is successfully added.");
				System.out.println("Successfully inserted");
			}else{
				request.setAttribute("message", st);
				System.out.println("Not inserted");
				RequestDispatcher rd =  request.getRequestDispatcher("/design/event1.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
