package com.jm2008.learn.jdbc.dml.pstmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jm2008.learn.jdbc.util.DbUtil;

public class InsertIntoUserTable {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getCon();
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2008_USER VALUES(?, ?)");
			pstmt.setInt(1, 1001);
			pstmt.setString(2, "At");
			int i = pstmt.executeUpdate();
			if (i > 0) {
				System.out.println("Record is inserted successfully using prepared statement.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
