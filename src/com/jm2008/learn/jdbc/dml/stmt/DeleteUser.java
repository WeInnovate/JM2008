package com.jm2008.learn.jdbc.dml.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.jm2008.learn.jdbc.util.DbUtil;

public class DeleteUser {

	public static void main(String[] args) {
		try {
			Connection con =  DbUtil.getCon();
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
