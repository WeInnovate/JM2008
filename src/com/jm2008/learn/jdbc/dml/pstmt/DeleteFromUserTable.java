package com.jm2008.learn.jdbc.dml.pstmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jm2008.learn.jdbc.util.DbUtil;

public class DeleteFromUserTable {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getCon();
			PreparedStatement pstmt = con.prepareStatement("DELETE FROM JM2008_USER WHERE ID = ?");
			pstmt.setInt(1, 1001);
			int i = pstmt.executeUpdate();
			if (i > 0) {
				System.out.println("Record is deleted successfully using prepared statement.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
