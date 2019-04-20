package com.hv.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Event_JDBC {

	
	public static String addStudent(JDBC_DTO dto) throws Exception{
		Connection con = null; 
		PreparedStatement st = null;
	    String ret="";
		try{
		 con = JDBC.getConnection();
		 con.setAutoCommit(false);
		 String query = "insert into event values(?,?,?,?,?,?,?)";
		 st = con.prepareStatement(query);
		 st.setInt(1, dto.getId());
		 st.setString(2, dto.getEvent_name());
		 st.setString(3, dto.getDepartment());
		 st.setString(4, dto.getDescription());
		 st.setString(5, dto.getVenue());
		 st.setString(6,dto.getDate());
		 st.setString(7, dto.getTime());
		 
	     int i = st.executeUpdate();
	     if(i!=0){
	    	 System.out.println(i+" record successfully inserted");
	     ret ="Record successfully updated";
	     }else{
	    	 System.out.println("record not inserted");
	     ret = "not saved";
	     }
	     	con.commit();
		}catch(Exception e){
			con.rollback();
			e.printStackTrace();
			ret="exception";
		}finally{
			st.close();
			con.close();
		}
		return ret;
	}
	
	public static List<JDBC_DTO> getAllStudent() throws Exception{
		Connection con = null; 
		Statement st=null;
		String ret="";
		List<JDBC_DTO> list = new ArrayList<>();
		try{
		 con = JDBC.getConnection();
	     st = con.createStatement();
	     String query = "select * from event";
	     ResultSet rs = st.executeQuery(query);
	     ResultSetMetaData resultSetMetaData = rs.getMetaData();
	     System.out.println("Total columns: "+resultSetMetaData.getColumnCount());  
	     System.out.println("Column Name of 1st column: "+resultSetMetaData.getColumnName(1));  
	     System.out.println("Column Type Name of 1st column: "+resultSetMetaData.getColumnTypeName(1));  
	     while (rs.next()) {
	    	 JDBC_DTO dto = new JDBC_DTO();
			dto.setId(rs.getInt("id"));
			dto.setEvent_name(rs.getString("event_name"));
			dto.setDepartment(rs.getString("department"));
			dto.setVenue(rs.getString("venue"));
			dto.setDate(rs.getString("date"));
			dto.setTime(rs.getString("time"));
	     list.add(dto);
	     }
	     
	     	
		}catch(Exception e){
			e.printStackTrace();
			ret="exception";
		}finally{
			st.close();
			con.close();
		}
		return list;
	}
	
	public static JDBC_DTO getStudentById(JDBC_DTO dto) throws Exception{
		Connection con = null; 
		Statement st=null;
		String ret="";
		List<JDBC_DTO> list = new ArrayList<>();
		try{
		 con = JDBC.getConnection();
	     st = con.createStatement();
	     String query = "select * from event where Id="+dto.getId();
	     ResultSet rs = st.executeQuery(query);
	     while (rs.next()) {
	    	 dto.setId(rs.getInt("id"));
				dto.setEvent_name(rs.getString("event_name"));
				dto.setDepartment(rs.getString("department"));
				dto.setVenue(rs.getString("venue"));
				dto.setDate(rs.getString("date"));
				dto.setTime(rs.getString("time"));
	     }
	     	
		}catch(Exception e){
			e.printStackTrace();
			ret="exception";
		}finally{
			st.close();
			con.close();
		}
		return dto;
	}
	
	public static List<JDBC_DTO> getStudentByName(JDBC_DTO sdto) throws Exception{
		Connection con = null; 
		Statement st=null;
		String ret="";
		List<JDBC_DTO> list = new ArrayList<>();
		try{
		 con = JDBC.getConnection();
	     st = con.createStatement();
	     String query = "select * from event where First_Name='"+sdto.getFirst_name().trim()+"'";
	     ResultSet rs = st.executeQuery(query);
	     while (rs.next()) {
	    	 JDBC_DTO dto = new JDBC_DTO();
	    	 dto.setId(rs.getInt("id"));
				dto.setEvent_name(rs.getString("event_name"));
				dto.setDepartment(rs.getString("department"));
				dto.setVenue(rs.getString("venue"));
				dto.setDate(rs.getString("date"));
				dto.setTime(rs.getString("time"));
	     list.add(dto);
	     }
	     
	     	
		}catch(Exception e){
			e.printStackTrace();
			ret="exception";
		}finally{
			st.close();
			con.close();
		}
		return list;
	}
	

	public static List<JDBC_DTO> getStudentByEmail(JDBC_DTO dto2) throws Exception{
		Connection con = null; 
		Statement st=null;
		String ret="";
		List<JDBC_DTO> list = new ArrayList<>();
		try{
		 con = JDBC.getConnection();
	     st = con.createStatement();
	     String query = "select * from event where Email like '%"+dto2.getEmail().trim()+"%'";
	     ResultSet rs = st.executeQuery(query);
	     while (rs.next()) {
	    	 JDBC_DTO dto = new JDBC_DTO();
	    	 dto.setId(rs.getInt("id"));
				dto.setEvent_name(rs.getString("event_name"));
				dto.setDepartment(rs.getString("department"));
				dto.setVenue(rs.getString("venue"));
				dto.setDate(rs.getString("date"));
				dto.setTime(rs.getString("time"));
	     list.add(dto);
	     }
	     
	     	
		}catch(Exception e){
			e.printStackTrace();
			ret="exception";
		}finally{
			st.close();
			con.close();
		}
		return list;
	}

	public static String deleteStudentById(JDBC_DTO dto) throws Exception{
		Connection con = null; 
		Statement st=null;
		String ret="";
		try{
		 con = JDBC.getConnection();
	     st = con.createStatement();
	     String query = "delete from event where Id = "+dto.getId() ;
	     int i = st.executeUpdate(query);
	     if(i!=0){
	    	 System.out.println(i+" record successfully deleted");
	     ret = "succcessfully deleted";
	     }else{
	    	 System.out.println("record not deleted");
	     ret = "not deleted";
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
	
	public static String updateStudentById(JDBC_DTO dto) throws Exception{
		Connection con = null; 
		Statement st=null;
		String ret="";
		System.out.println(".1 "+dto);
		try{
			System.out.println(".2");
		 con = JDBC.getConnection();
	     st = con.createStatement();
	     System.out.println(".3");
	     String query = "update event set Event_Name='"+dto.getEvent_name()+"',Department='"+dto.getDepartment()+"',Description='"+dto.getDescription()+"',Venue='"+dto.getVenue()+"',Date='"+dto.getDate()+"',Time='"+dto.getTime()+"' where Id = "+dto.getId() ;
	     System.out.println(".4");
	     int i = st.executeUpdate(query);
	     System.out.println(".5");
	     if(i!=0){
	    	 System.out.println(".6");
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
		System.out.println(".7");
		return ret;
		
	}
	
	public static JDBC_DTO getStudentByIdandPassword(JDBC_DTO dto) throws Exception{
		Connection con = null; 
		Statement st=null;
		String ret="";
		List<JDBC_DTO> list = new ArrayList<>();
		try{
		 con = JDBC.getConnection();
	     st = con.createStatement();
	     String query = "select * from login where First_Name = '"+dto.getFirst_name()+"' and Password = '"+dto.getPassword()+"'";
	     ResultSet rs = st.executeQuery(query);
	      if(rs.next()) {
	    	  dto.setId(rs.getInt("id"));
		    	 dto.setFirst_name(rs.getString("first_name"));
				dto.setLast_name(rs.getString("last_name"));
				dto.setGender(rs.getString("gender"));
				dto.setEnrollment_no(rs.getString("enrollment_no"));
				dto.setContact_no(rs.getString("contact_no"));
				dto.setEmail(rs.getString("email"));
				dto.setUser_name(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
				dto.setRole(rs.getString("Role"));
				dto.setInAction(rs.getString("inAction"));
				dto.setSubmit(rs.getString("success"));
	     }else{
	    	 dto.setMessage("fail");
	     }
	    }catch(Exception e){
			e.printStackTrace();
			dto.setMessage("exception");
		}finally{
			st.close();
			con.close();
		}
		return dto;
	}

}
