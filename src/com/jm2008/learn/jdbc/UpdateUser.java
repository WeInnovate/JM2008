package com.jm2008.learn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateUser {

	public static void main(String[] args) {
		try {
			Connection con =  DbUtil.getCon();
			Statement stmt = con.createStatement();
			int retVal = stmt.executeUpdate("UPDATE JM2008_USER SET NAME = 'Atul' WHERE ID = 0");
			if (retVal > 0) {
				System.out.println("Record has been updated successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
