package com.jm2008.learn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateTable {

	public static void main(String[] args) {


		try {
//			1. Establish the connection with database
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			
			if(con != null) {
				System.out.println("Connection created....");
			}
			else {
				System.out.println("Connection not created...");
			}
//			2. Create statement/command
//			3. execute the command
//			4. Process the result
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
