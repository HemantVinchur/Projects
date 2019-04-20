package com.hv.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Set_Admin {

	
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management_system?useSSL=false&allowPublicKeyRetrieval=true","root","Gattoo@123");
			st = con.createStatement();
			String query = "insert into login values('2','Hemant','Vinchur','Male','0827IT151043','7999149570','hemantit15@acropolis.in','Hemant_Vinchur','Gattoo','Admin','1') ";
		
			int i = st.executeUpdate(query);
			if (i!=0) {
				System.out.println(1+" row is successfully inserted");
			}
		} catch (Exception e) {

		e.printStackTrace();
		}finally {
			con.close();
			st.close();
		}

}

}