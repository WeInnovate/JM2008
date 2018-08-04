package com.jm2008.learn.jdbc.ddl;

import java.sql.Statement;

import com.jm2008.learn.jdbc.util.DbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateTable {

	public static void main(String[] args) {
		try {
//			1. Establish the connection with database
			Connection con =  DbUtil.getCon();
//			2. Create statement/command
			Statement stmt = con.createStatement();
//			3. execute the command
			boolean retVal = stmt.execute("CREATE TABLE JM2008_USER (ID NUMBER, NAME VARCHAR)");
//			4. Process the result
			if (!retVal) {
				System.out.println("Table created successfully!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
