package com.jm2008.learn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteUser {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			int retVal = stmt.executeUpdate("DELETE FROM JM2008_USER WHERE ID = 0");
			if (retVal > 0) {
				System.out.println("Record has been deleted successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
