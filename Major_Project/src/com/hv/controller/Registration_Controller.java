
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
import com.hv.jdbc.Set_Email;

/**
 * Servlet implementation class Registration_Controller
 */
@WebServlet("/Registration_Controller")
public class Registration_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static String message = "You are registered.";
	String registration_id ;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
try {
	HttpSession session = request.getSession(false);
	if(session.getAttribute("user_name")!=null){
		session.setAttribute("first_name",Student_Login.uname);
		session.setAttribute("message",Registration_Controller.message);
		request.setAttribute("message",Registration_Controller.message);
		System.out.println("Hii");
		RequestDispatcher rd = request.getRequestDispatcher("/design/confirm.jsp");
		registration_id = request.getParameter("reg_id");
		rd.forward(request, response);	
	}else{
		RequestDispatcher rd = request.getRequestDispatcher("/colorlib-regform-5/register1.jsp");
		registration_id = request.getParameter("reg_id");
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
		System.out.println("2");
		HttpSession session = request.getSession(false);
		System.out.println("2");
		if(session.getAttribute("user_name")!=null){
			String st="";
			String first_name = (String)session.getAttribute("first_name");
			String last_name = (String)session.getAttribute("last_name");
			String enrollment_no = (String)session.getAttribute("enrollment_no");
			String contact = (String)session.getAttribute("contact");
			String email = (String)session.getAttribute("email");
			String user_name = (String)session.getAttribute("user_name");
			String password = (String)session.getAttribute("password");
			String submit = (String)request.getParameter("submit");
			JDBC_DTO dto = new JDBC_DTO();
			System.out.println(first_name);
			try {
			
				System.out.println("4");
				if("submit".equals(submit)){
					System.out.println("5");
					dto.setId(Integer.parseInt(registration_id));
					dto.setFirst_name(first_name);
					dto.setLast_name(last_name);
					dto.setEnrollment_no(enrollment_no);
					dto.setContact_no(contact);
					dto.setEmail(email);
					dto.setUser_name(user_name);
					dto.setPassword(password);
				st = JDBC_Demo.addEvent(dto);

				System.out.println("6");
				}
				if("Successfully saved!!".equals(dto.getMessage())){
					System.out.println("8");
					Set_Email mail = new Set_Email();
					//mail.mailMethod(dto);
						
					//HttpSession session = request.getSession();
					session.setAttribute("first_name",dto.getFirst_name());
					request.setAttribute("first_name", dto.getFirst_name());
					session.setAttribute("message",Registration_Controller.message);
					request.setAttribute("message",Registration_Controller.message);
					session.setAttribute("id",dto.getId());
					request.setAttribute("id", dto.getId());
					RequestDispatcher rd =  request.getRequestDispatcher("/design/reg_confirm.jsp");
					rd.forward(request, response);
				}else{
					request.setAttribute("message", dto.getMessage());
					RequestDispatcher rd =  request.getRequestDispatcher("/colorlib-regform-5/register1.jsp");
					rd.forward(request, response);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("User_name already exists\nPlease enter unique user_name.");
				e.printStackTrace();
			}

		}else{
		String st="";
		System.out.println(registration_id);
		String first_name = (String)request.getParameter("first_name");
		String last_name = (String)request.getParameter("last_name");
		/*String gender = (String)request.getParameter("gender");*/
		String enrollment_no = (String)request.getParameter("enrollment");
		String contact_no = (String)request.getParameter("phone");
		String email = (String)request.getParameter("email");
		String username = (String)request.getParameter("user");
		String password = (String)request.getParameter("password");
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
			/*dto.setGender(gender);*/
			dto.setEnrollment_no(enrollment_no);
			dto.setContact_no(contact_no);
			dto.setEmail(email);
			dto.setUser_name(username);
			dto.setPassword(password);
		st = JDBC_Demo.addEvent(dto);
		System.out.println("6");
		}
		System.out.println("7");
		
		if("Successfully saved!!".equals(dto.getMessage())){
			System.out.println("8");
			Set_Email mail = new Set_Email();
			//mail.mailMethod(dto);
				
			HttpSession session1 = request.getSession();
			session1.setAttribute("first_name",dto.getFirst_name());
			request.setAttribute("first_name", dto.getFirst_name());
			session1.setAttribute("message",dto.getMessage());
			request.setAttribute("message", dto.getMessage());
			session1.setAttribute("id",dto.getId());
			request.setAttribute("id", dto.getId());
			RequestDispatcher rd =  request.getRequestDispatcher("/student_login.jsp");
			rd.forward(request, response);
		}else{
			request.setAttribute("message", dto.getMessage());
			RequestDispatcher rd =  request.getRequestDispatcher("/colorlib-regform-5/register1.jsp");
			rd.forward(request, response);
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("User_name already exists\nPlease enter unique user_name.");
		e.printStackTrace();
	}
	}
	}
}
