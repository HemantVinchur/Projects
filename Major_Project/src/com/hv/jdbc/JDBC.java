package com.hv.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {

	
	public static Connection getConnection(){
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management_system?useSSL=false&allowPublicKeyRetrieval=true","root","Gattoo@123");
			
		} catch (Exception e) {

		e.printStackTrace();
		}
		return con;
	}

}
