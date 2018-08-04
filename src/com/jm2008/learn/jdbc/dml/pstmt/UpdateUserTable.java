package com.jm2008.learn.jdbc.dml.pstmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jm2008.learn.jdbc.util.DbUtil;

public class UpdateUserTable {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getCon();
			PreparedStatement pstmt = con.prepareStatement("UPDATE JM2008_USER SET NAME = ? WHERE ID = ?");
			pstmt.setString(1, "Atul");
			pstmt.setInt(2, 1001);
			int i = pstmt.executeUpdate();
			if (i > 0) {
				System.out.println("Record is updated successfully using prepared statement.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
