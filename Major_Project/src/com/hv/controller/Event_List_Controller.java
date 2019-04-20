package com.hv.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hv.jdbc.JDBC_DTO;
import com.hv.jdbc.JDBC_Demo;

/**
 * Servlet implementation class Event_List_Controller
 */
@WebServlet("/Event_List_Controller")
public class Event_List_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Event_List_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		JDBC_Demo studentDAO = new JDBC_Demo();
		try {
			System.out.println("*1");
			List<JDBC_DTO> students = studentDAO.getAllStudent();
			request.setAttribute("student_list", students);
			RequestDispatcher rd = request.getRequestDispatcher("/design/coordinator_event1.jsp");
			rd.forward(request, response);
			System.out.println("*2");
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}