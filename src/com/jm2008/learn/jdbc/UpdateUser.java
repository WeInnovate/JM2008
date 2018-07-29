package com.jm2008.learn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateUser {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			int retVal = stmt.executeUpdate("UPDATE JM2008_USER SET NAME = 'P Sai Prasad' WHERE ID = 1002");
			if (retVal > 0) {
				System.out.println("Record has been updated successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
