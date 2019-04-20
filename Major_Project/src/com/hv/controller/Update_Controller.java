package com.hv.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hv.jdbc.Event_JDBC;
import com.hv.jdbc.JDBC_DTO;
import com.hv.jdbc.JDBC_Demo;

/**
 * Servlet implementation class Update_Controller
 */
@WebServlet("/Update_Controller")
public class Update_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("*");
		JDBC_Demo studentDAO = new JDBC_Demo();
		try {
			System.out.println("**");
			String registration_id = request.getParameter("reg_id");
			JDBC_DTO dto = new JDBC_DTO();
			dto.setId(Integer.parseInt(registration_id));
			dto = studentDAO.getStudentById(dto);
			if("Success".equals(dto.getMessage())){
				System.out.println("***");
				request.setAttribute("student", dto);
				RequestDispatcher rd = request.getRequestDispatcher("/design/update_list.jsp");
				rd.forward(request, response);	
				System.out.println("****");
			}else{
				request.setAttribute("delete_message", "Record Not Found");
				RequestDispatcher rd = request.getRequestDispatcher("/design/getall.jsp");
				rd.forward(request, response);	
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		//JDBC_Demo studentDAO = new JDBC_Demo();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String st="";
		String event_name = (String)request.getParameter("eventName");
		String department_name = (String)request.getParameter("departmentName");
		String event_description = (String)request.getParameter("eventDescription");
		String venue = (String)request.getParameter("venue");
		String date = (String)request.getParameter("date");
		String time = (String)request.getParameter("time");
		String id = request.getParameter("id");
		String submit = (String)request.getParameter("submit");
		System.out.println("3");
		JDBC_DTO dto = new JDBC_DTO();
	//JDBC_Demo dao = new JDBC_Demo();
	try {
		System.out.println("4");
		if("submit".equals(submit)){
			System.out.println("5");
			dto.setId(Integer.valueOf(id));
			dto.setEvent_name(event_name);
			dto.setDepartment(department_name);
			dto.setDescription(event_description);
			dto.setVenue(venue);
			dto.setDate(date);
			dto.setTime(time);
			st = Event_JDBC.updateStudentById(dto);
			HttpSession session = request.getSession();

			session.setAttribute("st",st);
			request.setAttribute("st",st);
		System.out.println("6");
		}
		System.out.println("7");
		
		if("succcessfully updated".equals(st)){
			System.out.println("8");
			request.setAttribute("message","Event Successfully Updated");
			request.setAttribute("student", dto);
			RequestDispatcher rd =  request.getRequestDispatcher("design/update_list.jsp");
			rd.forward(request, response);
		}else{
			request.setAttribute("message", "Event Not Updated!");
			RequestDispatcher rd =  request.getRequestDispatcher("design/update_list.jsp");
			rd.forward(request, response);
		}
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
