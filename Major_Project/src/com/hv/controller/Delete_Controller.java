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
 * Servlet implementation class Delete_Controller
 */
@WebServlet("/Delete_Controller")
public class Delete_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete_Controller() {
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
			String registration_id = request.getParameter("reg_id");
			JDBC_DTO dto = new JDBC_DTO();
			dto.setId(Integer.parseInt(registration_id));
			String result = studentDAO.deleteStudentById(dto);
			if("Succcessfully deleted".equals(result)){
				List<JDBC_DTO> students = studentDAO.getAllStudent();
				request.setAttribute("student_list", students);
				RequestDispatcher rd = request.getRequestDispatcher("registered_students1.jsp");
				rd.forward(request, response);	
			}else{
				request.setAttribute("delete_message", "Record Not Deleted");
				RequestDispatcher rd = request.getRequestDispatcher("/design/event.jsp");
				rd.forward(request, response);	
			}
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
