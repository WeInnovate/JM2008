package com.jm2008.learn.jdbc.dml.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.jm2008.learn.jdbc.util.DbUtil;

public class InsertIntoUser {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getCon();
			Statement stmt = con.createStatement();
			int retVal = stmt.executeUpdate("INSERT INTO JM2008_USER VALUES(0, 'Atul Dwivedi')");
			if (retVal > 0) {
				System.out.println("Record has been inseted successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
