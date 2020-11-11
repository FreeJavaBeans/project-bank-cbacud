package com.freejavabank.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {

	private static DBConnection singleton = new DBConnection();
	private Connection conn;
	
	private DBConnection() {

	super();
	//retrieve them here and use them
			String password = "Admin";
			String username = "posgres";
			String url = "jdbc:postgresql://localhost/FJBBank";
			try {
				this.conn = DriverManager.getConnection(url, username, password);
			}catch(SQLException e) {
				System.out.println("Failed to Connect to DB");
				System.out.println("Password: " + password);
				System.out.println("Username: " + username);
				System.out.println("Url: " + url);
				e.printStackTrace();
			}
			
	}
	
	public static DBConnection getConnectionUtil() {
		return singleton;
	}
	
	
	
	public Connection getConnection() {
		return conn;
	}
	

}
