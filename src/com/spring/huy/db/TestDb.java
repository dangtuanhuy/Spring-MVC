package com.spring.huy.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestDb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcUrl = "jdbc:mysql://localhost:3306/springjava?useSSL=false&serverTimezone=UTC";
		String user = "root";
		String pass = "";
		
		try {
			System.out.println("Connecting to database: " + jdbcUrl);
			
			Connection myConn =
					DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Connection successful!!!");
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}

}
