package com.hv.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hv.controller.Coordinator_login;
import com.hv.controller.Coordinator_reply_Controller;

public class JDBC_Demo {

	
	public static String addStudent(JDBC_DTO dto) throws Exception {
		System.out.println("#1");
		Connection con = null;
		String ret = "";
		try {
			System.out.println("#2");
			con = JDBC.getConnection();
			System.out.println("#3");
			String query = "insert into login values(?,?,?,?,?,?,?,?,?,?,?)";
			System.out.println("#4");
			PreparedStatement st = con.prepareStatement(query);
			System.out.println("#5");
			st.setInt(1, dto.getId());
			st.setString(2, dto.getFirst_name());
			st.setString(3, dto.getLast_name());
			st.setString(4, dto.getGender());
			st.setString(5, dto.getEnrollment_no());
			st.setString(6, dto.getContact_no());
			st.setString(7, dto.getEmail());
			st.setString(8, dto.getUser_name());
			st.setString(9, dto.getPassword());
			st.setString(10, dto.getRole());
			st.setString(11, dto.getInAction());
			System.out.println("#6");
			dto.setSubmit("success");
			dto.setMessage("Successfully saved!!");
			System.out.println("Get data");
			System.out.println("7");
			int i = st.executeUpdate();
			System.out.println("#7");
			if (i != 0) {
				System.out.println(i + " record successfully inserted");
				ret = "succcessfully saved";
			} else {
				System.out.println("record not inserted");
				ret = "not saved";
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
			ret = "exception";
		} finally {
			con.close();
		}
		return ret;
	}

	public static String addContact(JDBC_DTO dto) throws Exception {
		System.out.println("#1");
		Connection con = null;
		String ret = "";
		try {
			System.out.println("#2");
			con = JDBC.getConnection();
			System.out.println("#3");
			String query = "insert into register_event(feedback) values(?) where id="+dto.getId();
			System.out.println("#4");
			PreparedStatement st = con.prepareStatement(query);
			System.out.println("#5");
			st.setString(1, dto.getFeedback());
			System.out.println("#6");
			dto.setSubmit("success");
			dto.setMessage("Your feedback is successfully saved!!");
			System.out.println("Get data");
			System.out.println("7");
			int i = st.executeUpdate();
			System.out.println("#7");
			if (i != 0) {
				System.out.println(i + " record successfully inserted");
				ret = "succcessfully saved";
			} else {
				System.out.println("record not inserted");
				ret = "not saved";
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
			ret = "exception";
		} finally {
			con.close();
		}
		return ret;
	}

	
	public static String addReply(JDBC_DTO dto) throws Exception {
		System.out.println("#1");
		Connection con = null;
		Statement st=null;
		String ret = "";
		try {
			System.out.println("#2");
			con = JDBC.getConnection();
			st = con.createStatement();
			System.out.println("#3");
			String query = "update contactus set reply='"+dto.getReply()+"' where id="+Coordinator_login.coid;
			System.out.println("#4");
		     int i = st.executeUpdate(query);
		     if(i!=0){
		    	 System.out.println(i+" record successfully updated");
		     ret = "succcessfully updated";
		     }else{
		    	 System.out.println("record not updated");
		     ret = "not updated";
		     }
		     	
			}catch(Exception e){
				e.printStackTrace();
				ret="exception";
			}finally{
				st.close();
				con.close();
			}
			return ret;
		}
	
	public static String add_Student(JDBC_DTO dto) throws Exception {
		System.out.println("#1");
		Connection con = null;
		String ret = "";
		try {
			System.out.println("#2");
			con = JDBC.getConnection();
			System.out.println("#3");
			String query = "insert into event values(?,?,?,?,?,?,?)";
			System.out.println("#4");
			PreparedStatement st = con.prepareStatement(query);
			System.out.println("#5");
			st.setInt(1, dto.getId());
			st.setString(2, dto.getEvent_name());
			st.setString(3, dto.getDepartment());
			st.setString(4, dto.getDescription());
			st.setString(5, dto.getVenue());
			st.setString(6, dto.getDate());
			st.setString(7, dto.getTime());
			System.out.println("#6");
			dto.setSubmit("success");
			dto.setMessage("Successfully saved");
			System.out.println("Get data");
			System.out.println("7");
			int i = st.executeUpdate();
			System.out.println("#7");
			if (i != 0) {
				System.out.println(i + " record successfully inserted");
				ret = "Succcessfully saved";
			} else {
				System.out.println("record not inserted");
				ret = "not saved";
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
			ret = "exception";
		} finally {
			con.close();
		}
		return ret;
	}


	public static String add_Coordinator(JDBC_DTO dto) throws Exception {
		System.out.println("#1");
		Connection con = null;
		String ret = "";
		try {
			System.out.println("#2");
			con = JDBC.getConnection();
			System.out.println("#3");
			String query = "insert into coordinator values(?,?,?,?,?,?,?)";
			System.out.println("#4");
			PreparedStatement st = con.prepareStatement(query);
			System.out.println("#5");
         	st.setInt(1, dto.getId());
			st.setString(2, dto.getFirst_name());
			st.setString(3, dto.getLast_name());
			st.setString(4, dto.getContact_no());
			st.setString(5, dto.getEmail());
			st.setString(6, dto.getUser_name());
			st.setString(7, dto.getPassword());
			System.out.println("#6");
			dto.setSubmit("success");
			dto.setMessage("Successfully saved");
			System.out.println("Get data");
			System.out.println("7");
			int i = st.executeUpdate();
			System.out.println("#7");
			if (i != 0) {
				System.out.println(i + " record successfully inserted");
				ret = "Succcessfully saved";
			} else {
				System.out.println("record not inserted");
				ret = "not saved";
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
			ret = "exception";
		} finally {
			con.close();
		}
		return ret;
	}


	public static List<JDBC_DTO> getAllStudent() throws Exception {
		Connection con = null;
		Statement st = null;
		String ret = "";
		List<JDBC_DTO> list = new ArrayList<>();
		System.out.println("Run1");
		try {
			System.out.println("Run2");
			con = JDBC.getConnection();
			st = con.createStatement();
			System.out.println("Run3");
			String query = "select * from event";
			ResultSet rs = st.executeQuery(query);
			System.out.println("Run4");
			while (rs.next()) {
				System.out.println("Run5");
				JDBC_DTO dto = new JDBC_DTO();
				dto.setId(rs.getInt("Id"));
				dto.setEvent_name(rs.getString("Event_Name"));
				dto.setDepartment(rs.getString("Department"));
				dto.setDescription(rs.getString("Description"));
				dto.setVenue(rs.getString("Venue"));
				dto.setDate(rs.getString("Date"));
				dto.setTime(rs.getString("Time"));
			//	dto.setSubmit(rs.getString("success"));
				list.add(dto);
				System.out.println("Run");
			}

		} catch (Exception e) {
			e.printStackTrace();
			ret = "exception";
		} finally {
			st.close();
			con.close();
		}
		return list;
	}
	public static List<JDBC_DTO> getReply() throws Exception {
		Connection con = null;
		Statement st = null;
		String ret = "";
		List<JDBC_DTO> list = new ArrayList<>();
		System.out.println("Run1");
		try {
			JDBC_DTO dto1 = new JDBC_DTO();
			System.out.println("Run2");
			con = JDBC.getConnection();
			st = con.createStatement();
			System.out.println("Run3");
			System.out.println("Id="+Coordinator_reply_Controller.registration_id);
			String query = "select reply,feedback from register_event where user_name='"+Coordinator_reply_Controller.registration_id+"'";
			ResultSet rs = st.executeQuery(query);
			System.out.println("Run4");
			while (rs.next()) {
				System.out.println("Run5");
				JDBC_DTO dto = new JDBC_DTO();
				dto.setReply(rs.getString("reply"));
				dto.setFeedback(rs.getString("feedback"));
			//	dto.setSubmit(rs.getString("success"));
				list.add(dto);
				System.out.println("Run");
				System.out.println(dto.getFeedback());
				System.out.println(dto.getReply());
			}
			System.out.println("Run again");
		} catch (Exception e) {
			e.printStackTrace();
			ret = "exception";
		} finally {
			st.close();
			con.close();
		}
		return list;
	}

	public static JDBC_DTO getStudentById(JDBC_DTO dto) throws Exception {
		Connection con = null;
		Statement st = null;
		String ret = "";
		List<JDBC_DTO> list = new ArrayList<>();
		System.out.println("#");
		try {
			System.out.println("##");
			con = JDBC.getConnection();
			st = con.createStatement();
			System.out.println("###");
			String query = "select * from event where Id=" + dto.getId();
			ResultSet rs = st.executeQuery(query);
			System.out.println("####");
			while (rs.next()) {
				System.out.println("#####");
				dto.setId(rs.getInt("Id"));
				System.out.println("######");
				dto.setEvent_name(rs.getString("Event_Name"));
				dto.setDepartment(rs.getString("Department"));
				dto.setDescription(rs.getString("Description"));
				dto.setVenue(rs.getString("Venue"));
				dto.setDate(rs.getString("Date"));
				dto.setTime(rs.getString("Time"));

				dto.setMessage("Success");
			}
			System.out.println("#######");
		} catch (Exception e) {
			e.printStackTrace();
			ret = "exception";
		} finally {
			st.close();
			con.close();
		}
		return dto;
		
	}

	public static List<JDBC_DTO> getStudentByName(JDBC_DTO sdto) throws Exception {
		Connection con = null;
		Statement st = null;
		String ret = "";
		List<JDBC_DTO> list = new ArrayList<>();
		try {
			con = JDBC.getConnection();
			st = con.createStatement();
			String query = "select * from login where First_Name='" + sdto.getFirst_name().trim() + "'";
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				JDBC_DTO dto = new JDBC_DTO();
				dto.setId(rs.getInt("id"));
				dto.setFirst_name(rs.getString("first_name"));
				dto.setLast_name(rs.getString("last_name"));
				dto.setGender(rs.getString("gender"));
				dto.setEnrollment_no(rs.getString("enrollment_no"));
				dto.setContact_no(rs.getString("contact_no"));
				dto.setEmail(rs.getString("email"));
				dto.setUser_name(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
				dto.setRole(rs.getString("role"));
				dto.setInAction(rs.getString("inAction"));
				dto.setSubmit(rs.getString("success"));
				list.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
			ret = "exception";
		} finally {
			st.close();
			con.close();
		}
		return list;
	}

	public static List<JDBC_DTO> getStudentByEmail(JDBC_DTO sdto) throws Exception {
		Connection con = null;
		Statement st = null;
		String ret = "";
		List<JDBC_DTO> list = new ArrayList<>();
		try {
			con = JDBC.getConnection();
			st = con.createStatement();
			String query = "select * from login where Email like '%" + sdto.getEmail().trim() + "%'";
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				JDBC_DTO dto = new JDBC_DTO();
				dto.setId(rs.getInt("id"));
				dto.setFirst_name(rs.getString("first_name"));
				dto.setLast_name(rs.getString("last_name"));
				dto.setGender(rs.getString("gender"));
				dto.setEnrollment_no(rs.getString("enrollment_no"));
				dto.setContact_no(rs.getString("contact_no"));
				dto.setEmail(rs.getString("email"));
				dto.setUser_name(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
				dto.setRole(rs.getString("role"));
				dto.setInAction(rs.getString("inAction"));
				dto.setSubmit(rs.getString("success"));
				list.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
			ret = "exception";
		} finally {
			st.close();
			con.close();
		}
		return list;
	}

	public static String deleteStudentById(JDBC_DTO dto) throws Exception {
		Connection con = null;
		Statement st = null;
		String ret = "";
		try {
			con = JDBC.getConnection();
			st = con.createStatement();
			String query = "delete from event where id= " + dto.getId();
			String query1 = "delete from register_event where unique_id= " + dto.getId();
			int i = st.executeUpdate(query);
			int i1 = st.executeUpdate(query1);
			if (i != 0) {
				System.out.println(i + " record successfully deleted");
				ret = "Succcessfully deleted";
			} else {
				System.out.println("Event record not deleted");
				ret = "not deleted";
			}

			if (i1 != 0) {
				System.out.println(i1 + " record successfully deleted");
				ret = "Succcessfully deleted";
			} else {
				System.out.println("Student record not deleted");
				ret = "not deleted";
			}

		} catch (Exception e) {
			e.printStackTrace();
			ret = "exception";
		} finally {
			st.close();
			con.close();
		}
		return ret;
	}

	public static String updateStudentById(JDBC_DTO dto) throws Exception {
		Connection con = null;
		Statement st = null;
		String ret = "";
		try {
			con = JDBC.getConnection();
			st = con.createStatement();
			String query = "update login set First_Name = '" + dto.getFirst_name() + "',Last_Name='"
					+ dto.getLast_name() + "',Gender='" + dto.getGender() + "', Enrollment_no.='"
					+ dto.getEnrollment_no() + "',Contact_no.='" + dto.getContact_no() + "',Email='" + dto.getEmail()
					+ "',User_Name='" + dto.getUser_name() + "',Password='" + dto.getPassword() + "',Role='"
					+ dto.getRole() + "',inAction='" + dto.getInAction() + "',submit='" + dto.getSubmit()
					+ "' where Id = " + dto.getId();
			int i = st.executeUpdate(query);
			if (i != 0) {
				System.out.println(i + " record successfully updated");
				ret = "succcessfully updated";
			} else {
				System.out.println("record not updated");
				ret = "not updated";
			}

		} catch (Exception e) {
			e.printStackTrace();
			ret = "exception";
		} finally {
			st.close();
			con.close();
		}
		return ret;
	}
	public static String updateStudentFeedback(JDBC_DTO dto) throws Exception {
		Connection con = null;
		Statement st = null;
		String ret = "";
		try {
			con = JDBC.getConnection();
			st = con.createStatement();
			String query = "update register_event set feedback = '" + dto.getFeedback()+ "' where id = '" + dto.getUser_name()+"'";
			int i = st.executeUpdate(query);
			dto.setSubmit("success");
			dto.setMessage("Your feedback is successfully saved!!");
			if (i != 0) {
				System.out.println(i + " record successfully updated");
				ret = "succcessfully updated";
			} else {
				System.out.println("record not updated");
				ret = "not updated";
			}

		} catch (Exception e) {
			e.printStackTrace();
			ret = "exception";
		} finally {
			st.close();
			con.close();
		}
		return ret;
	}

	public static JDBC_DTO getStudentByIdandPassword(JDBC_DTO dto) throws Exception {
		System.out.println("1");
		Connection con = null;
		Statement st = null;
		String ret = "";
		List<JDBC_DTO> list = new ArrayList<>();
		try {
			System.out.println("2");
			con = JDBC.getConnection();
			System.out.println("3");
			st = con.createStatement();
			System.out.println("4");
			String query = "select * from login where user_name = '" + dto.getUser_name() + "' and password = '"
					+ dto.getPassword() + "'";
			ResultSet rs = st.executeQuery(query);
			System.out.println("5");
			while (rs.next()) {
				System.out.println("6");
				dto.setId(rs.getInt("id"));
				dto.setFirst_name(rs.getString("first_name"));
				dto.setLast_name(rs.getString("last_name"));
				dto.setContact_no(rs.getString("contact_no"));
				dto.setEmail(rs.getString("email"));
				dto.setUser_name(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
				dto.setRole(rs.getString("role"));
				dto.setInAction(rs.getString("inAction"));
				dto.setSubmit("success");
				dto.setMessage("Successfully saved!!");
				System.out.println("Get data");
				System.out.println("7");
			}
			System.out.println("8");
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
			dto.setMessage("exception");
		} finally {
			try {
				//if (st != null) {
					//st.close();
				//}
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dto;
	}

	public static JDBC_DTO getCoordinatorByIdandPassword(JDBC_DTO dto) throws Exception {
		System.out.println("1");
		Connection con = null;
		Statement st = null;
		String ret = "";
		List<JDBC_DTO> list = new ArrayList<>();
		try {
			System.out.println("2");
			con = JDBC.getConnection();
			System.out.println("3");
			st = con.createStatement();
			System.out.println("4");
			System.out.println(dto.getUser_name());
			System.out.println(dto.getPassword());
			String query = "select * from coordinator where user_name = '" + dto.getUser_name() + "' and password = '"
					+ dto.getPassword() + "'";
			ResultSet rs = st.executeQuery(query);
			System.out.println("5");
			while (rs.next()) {
				System.out.println("6");
				dto.setId(rs.getInt("id"));
				dto.setFirst_name(rs.getString("first_name"));
				dto.setLast_name(rs.getString("last_name"));
				dto.setContact_no(rs.getString("contact"));
				dto.setEmail(rs.getString("email"));
				dto.setUser_name(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
				dto.setSubmit("success");
				dto.setMessage("Successfully saved!!");
				System.out.println("Get data");
				System.out.println("7");
			}
			System.out.println("8");
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
			dto.setMessage("exception");
		} finally {
			try {
				//if (st != null) {
					//st.close();
				//}
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dto;
	}

	public static JDBC_DTO getStudentsByIdandPassword(JDBC_DTO dto) throws Exception {
		System.out.println("1");
		Connection con = null;
		Statement st = null;
		String ret = "";
		List<JDBC_DTO> list = new ArrayList<>();
		try {
			System.out.println("2");
			con = JDBC.getConnection();
			System.out.println("3");
			st = con.createStatement();
			System.out.println("4");
			System.out.println(dto.getUser_name());
			System.out.println(dto.getPassword());
			String query = "select * from register_event where user_name = '" + dto.getUser_name() + "' and password = '"
					+ dto.getPassword() + "'";
			ResultSet rs = st.executeQuery(query);
			System.out.println("5");
			while (rs.next()) {
				System.out.println("6");
				dto.setId(rs.getInt("id"));
				dto.setFirst_name(rs.getString("first_name"));
				dto.setLast_name(rs.getString("last_name"));
				dto.setEnrollment_no(rs.getString("enrollment_no"));
				dto.setContact_no(rs.getString("contact"));
				dto.setEmail(rs.getString("email"));
				dto.setUser_name(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
				dto.setSubmit("success");
				dto.setMessage("Successfully saved!!");
				System.out.println("Get data");
				System.out.println("7");
			}
			System.out.println("8");
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
			dto.setMessage("exception");
		} finally {
			try {
				//if (st != null) {
					//st.close();
				//}
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dto;
	}
	
	public static String getEmail(JDBC_DTO dto) throws Exception {
		Connection con = null;
		Statement st = null;
		String ret = "";
		System.out.println(dto.getId());
		try {
			con = JDBC.getConnection();
			st = con.createStatement();
			String query = "select * from register_event where id = '" + dto.getId() + "'";
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				dto.setFirst_name(rs.getString("first_name"));
				dto.setLast_name(rs.getString("last_name"));
			}
			dto.setMessage("Successfully saved!!");
		} catch (Exception e) {
			e.printStackTrace();
			ret = "exception";
		} finally {
			st.close();
			con.close();
		}
		return ret;
	}
	public static String addEvent(JDBC_DTO dto) throws Exception {
		System.out.println("#1");
		Connection con = null;
		String ret = "";
		try {
			System.out.println("#2");
			con = JDBC.getConnection();
			System.out.println("#3");
			String query = "insert into register_event(unique_id,first_name,last_name,enrollment_no,contact,email,user_name,password) values(?,?,?,?,?,?,?,?)";
			System.out.println("#4");
			PreparedStatement st = con.prepareStatement(query);
			System.out.println("#5");
			st.setInt(1, dto.getId());
			st.setString(2, dto.getFirst_name());
			st.setString(3, dto.getLast_name());
			st.setString(4, dto.getEnrollment_no());
			st.setString(5, dto.getContact_no());
			st.setString(6, dto.getEmail());
			st.setString(7, dto.getUser_name());
			st.setString(8, dto.getPassword());
			System.out.println("#6");
			dto.setSubmit("success");
			dto.setMessage("Successfully saved!!");
			System.out.println("Get data");
			System.out.println("7");
			int i = st.executeUpdate();
			System.out.println("#7");
			if (i != 0) {
				System.out.println(i + " record successfully inserted");
				ret = "succcessfully saved";
			} else {
				System.out.println("record not inserted");
				ret = "not saved";
			}
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Maybe user_name already exist.");
			ret = "exception";
		} finally {
			con.close();
		}
		return ret;
	}
	public static JDBC_DTO getEventById(JDBC_DTO dto) throws Exception {
		Connection con = null;
		Statement st = null;
		String ret = "";
		List<JDBC_DTO> list = new ArrayList<>();
		System.out.println("#");
		try {
			System.out.println("##");
			con = JDBC.getConnection();
			st = con.createStatement();
			System.out.println("###");
			String query = "select * from register_event where Id=" + dto.getId();
			ResultSet rs = st.executeQuery(query);
			System.out.println("####");
			while (rs.next()) {
				System.out.println("#####");
//				dto.setId(rs.getInt("Id"));
				System.out.println("######");
				dto.setEvent_name(rs.getString("event_name"));
				dto.setDepartment(rs.getString("department"));
				dto.setDescription(rs.getString("description"));
/*				dto.setVenue(rs.getString("Venue"));
				dto.setDate(rs.getString("Date"));
				dto.setTime(rs.getString("Time"));*/

				dto.setMessage("success");
			}
			System.out.println("#######");
		} catch (Exception e) {
			e.printStackTrace();
			ret = "exception";
		} finally {
			st.close();
			con.close();
		}
		return dto;
		
	}

	public static List<JDBC_DTO> getAllRegisteredCoordinators() throws Exception {
		Connection con = null;
		Statement st = null;
		String ret = "";
		List<JDBC_DTO> list = new ArrayList<>();
		try {
			con = JDBC.getConnection();
			st = con.createStatement();
			String query = "select * from coordinator join event on coordinator.id=event.id";
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				JDBC_DTO dto = new JDBC_DTO();
				dto.setId(rs.getInt("Id"));
				dto.setEvent_name(rs.getString("Event_Name"));
				dto.setDepartment(rs.getString("Department"));
				dto.setDescription(rs.getString("Description"));
				dto.setVenue(rs.getString("Venue"));
				dto.setDate(rs.getString("Date"));
				dto.setTime(rs.getString("Time"));
				dto.setFirst_name(rs.getString("first_name"));
				dto.setLast_name(rs.getString("last_name"));
				dto.setContact_no(rs.getString("contact"));
				dto.setEmail(rs.getString("email"));
				dto.setUser_name(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
			//	dto.setSubmit(rs.getString("success"));
				list.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
			ret = "exception";
		} finally {
			st.close();
			con.close();
		}
		return list;
	}
	
	public static List<JDBC_DTO> getAllRegisteredStudents() throws Exception {
		Connection con = null;
		Statement st = null;
		String ret = "";
		List<JDBC_DTO> list = new ArrayList<>();
		try {
			con = JDBC.getConnection();
			st = con.createStatement();
			String query = "select * from register_event join event on register_event.unique_id=event.id";
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				JDBC_DTO dto = new JDBC_DTO();
				dto.setId(rs.getInt("Id"));
				dto.setEvent_name(rs.getString("Event_Name"));
				dto.setDepartment(rs.getString("Department"));
				dto.setDescription(rs.getString("Description"));
				dto.setVenue(rs.getString("Venue"));
				dto.setDate(rs.getString("Date"));
				dto.setTime(rs.getString("Time"));
				dto.setFirst_name(rs.getString("first_name"));
				dto.setLast_name(rs.getString("last_name"));
				dto.setEnrollment_no(rs.getString("enrollment_no"));
				dto.setContact_no(rs.getString("contact"));
				dto.setEmail(rs.getString("email"));
			//	dto.setSubmit(rs.getString("success"));
				list.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
			ret = "exception";
		} finally {
			st.close();
			con.close();
		}
		return list;
	}
	JDBC_DTO dto;
	public static List<JDBC_DTO> getCoordinatorStudents() throws Exception {
		Connection con = null;
		Statement st = null;
		String ret = "";
		List<JDBC_DTO> list = new ArrayList<>();
		try {
			JDBC_DTO dto = new JDBC_DTO();
			System.out.println(Coordinator_login.coid);
	//	int stid = Coordinator_login.coid;
			con = JDBC.getConnection();
			st = con.createStatement();
			String query = "select * from register_event join event on register_event.id=event.id where register_event.id="+Coordinator_login.coid;
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				dto.setId(rs.getInt("Id"));
				dto.setEvent_name(rs.getString("Event_Name"));
				dto.setDepartment(rs.getString("Department"));
				dto.setDescription(rs.getString("Description"));
				dto.setVenue(rs.getString("Venue"));
				dto.setDate(rs.getString("Date"));
				dto.setTime(rs.getString("Time"));
				dto.setFirst_name(rs.getString("first_name"));
				dto.setLast_name(rs.getString("last_name"));
				dto.setEnrollment_no(rs.getString("enrollment_no"));
				dto.setContact_no(rs.getString("contact"));
				dto.setEmail(rs.getString("email"));
			//	dto.setSubmit(rs.getString("success"));
				list.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
			ret = "exception";
		} finally {
			st.close();
			con.close();
		}
		return list;
	}
	
public  List<JDBC_DTO> getAllStudentsFeedback() throws Exception {
	Connection con = null;
	Statement st = null;
	String ret = "";
	List<JDBC_DTO> list = new ArrayList<>();
	try {
		con = JDBC.getConnection();
		st = con.createStatement();
		String query = "select * from event join register_event on event.id=register_event.unique_id";
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			dto = new JDBC_DTO();
			dto.setId(rs.getInt("id"));
			dto.setFirst_name(rs.getString("first_name"));
			dto.setLast_name(rs.getString("last_name"));
			dto.setEnrollment_no(rs.getString("enrollment_no"));
			dto.setContact_no(rs.getString("contact"));
			dto.setEmail(rs.getString("email"));
			dto.setUser_name(rs.getString("user_name"));
			dto.setPassword(rs.getString("password"));
			dto.setFeedback(rs.getString("feedback"));
			dto.setReply(rs.getString("reply"));
			dto.setEvent_name(rs.getString("event_name"));
			dto.setDepartment(rs.getString("department"));
			dto.setDescription(rs.getString("description"));
			dto.setVenue(rs.getString("venue"));
			dto.setDate(rs.getString("date"));
			dto.setTime(rs.getString("time"));
		//	dto.setSubmit(rs.getString("success"));
			list.add(dto);
		}
		System.out.println(dto.getEvent_name());
		System.out.println(dto.getFeedback());

	} catch (Exception e) {
		e.printStackTrace();
		ret = "exception";
	} finally {
		st.close();
		con.close();
	}
	return list;
	
}


public  List<JDBC_DTO> getFeedback() throws Exception {
	Connection con = null;
	Statement st = null;
	String ret = "";
	List<JDBC_DTO> list = new ArrayList<>();
	try {
		System.out.println("try");
		System.out.println(Coordinator_login.coid);
		con = JDBC.getConnection();
		st = con.createStatement();
		String query = "select * from contactus where id="+Coordinator_login.coid;
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			dto = new JDBC_DTO();
			dto.setId(rs.getInt("id"));
			dto.setFirst_name(rs.getString("first_name"));
			dto.setLast_name(rs.getString("last_name"));
			dto.setEmail(rs.getString("email"));
			dto.setContact_no(rs.getString("contact"));
			dto.setFeedback(rs.getString("feedback"));
		//	dto.setSubmit(rs.getString("success"));
			list.add(dto);
		}
	} catch (Exception e) {
		e.printStackTrace();
		ret = "exception";
	} finally {
		st.close();
		con.close();
	}
	return list;
	
}

}
