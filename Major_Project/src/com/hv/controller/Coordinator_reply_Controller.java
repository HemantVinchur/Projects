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

import com.hv.jdbc.JDBC_DTO;
import com.hv.jdbc.JDBC_Demo;

/**
 * Servlet implementation class Coordinator_reply_Controller
 */
@WebServlet("/Coordinator_reply_Controller")
public class Coordinator_reply_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static String registration_id ;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Coordinator_reply_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		System.out.println("@1");
		JDBC_Demo studentDAO = new JDBC_Demo();
		try {
			System.out.println("@2");
			JDBC_DTO dto = new JDBC_DTO();
			HttpSession session = request.getSession();
			registration_id = request.getParameter("reg_id");
			dto.setUser_name(registration_id);
			System.out.println("*1");
			List<JDBC_DTO> students = studentDAO.getReply();
			request.setAttribute("student_list", students);
			System.out.println(dto.getReply());
			session.setAttribute("user_name",dto.getUser_name());
			request.setAttribute("user_name", dto.getUser_name());
			session.setAttribute("reply",dto.getReply());
			request.setAttribute("reply", dto.getReply());
			System.out.println("Hii");
			RequestDispatcher rd = request.getRequestDispatcher("/design/Coordinator_reply1.jsp");
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
		
	}
}
