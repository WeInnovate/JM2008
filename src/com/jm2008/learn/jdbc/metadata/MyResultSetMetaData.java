package com.jm2008.learn.jdbc.metadata;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.jm2008.learn.jdbc.util.DbUtil;

public class MyResultSetMetaData {

	public static void main(String[] args) {
		try (Connection con = DbUtil.getCon()) {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2008_USER");
			ResultSetMetaData rsmd = rs.getMetaData();
			
			System.out.println("Column Count: "+rsmd.getColumnCount());
			
			System.out.print(rsmd.getColumnName(1)+"("+rsmd.getColumnTypeName(1)+")");
			System.out.print("     ");
			System.out.print(rsmd.getColumnName(2)+"("+rsmd.getColumnTypeName(2)+")");

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				System.out.println(id + "             " + name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
