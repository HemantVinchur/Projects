package com.hv.jdbc;

public class JDBC_Test {

	
	public static void main(String[] args) throws Exception {
		JDBC_DTO dto = new JDBC_DTO();
		dto.setId(7);
		dto.setFirst_name("abc");
		dto.setLast_name("xyz");
		dto.setGender("Male");
		dto.setEnrollment_no("123456789");
		dto.setContact_no("12345");
		dto.setEmail("abc@gmail.com");
		dto.setUser_name("abc");
		dto.setPassword("123");
		dto.setRole("Admin");
		dto.setInAction("1");
		String result = JDBC_Demo.addStudent(dto); 
		System.out.println(result);
	}

}
