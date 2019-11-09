package com.spring.huy.db;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class mySQL
 */
@WebServlet("/mySQL")
public class mySQL extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public mySQL() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// setup connection variables
		String user = "root";
		String pass = "";
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/springjava?useSSL=false&serverTimezone=UTC";
		String driver = "com.mysql.jdbc.Driver";
		
		// get connection to database
		try {
			PrintWriter out = response.getWriter();
			
			out.println("Connecting to database: " + jdbcUrl);
			
			Class.forName(driver);
			
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			
			out.println("SUCCESS!!!");
			
			myConn.close();
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
			throw new ServletException(exc);
		}
	}

}
