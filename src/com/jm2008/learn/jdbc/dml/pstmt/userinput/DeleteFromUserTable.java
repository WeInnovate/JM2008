package com.jm2008.learn.jdbc.dml.pstmt.userinput;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.jm2008.learn.jdbc.util.DbUtil;

public class DeleteFromUserTable {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getCon();
			PreparedStatement pstmt = con.prepareStatement("DELETE FROM JM2008_USER WHERE ID = ?");

			Scanner scan = new Scanner(System.in);
			String userChoice = null;
			do {

				System.out.print("Please enter ID: ");
				int id = Integer.parseInt(scan.nextLine());

				pstmt.setInt(1, id);

				int i = pstmt.executeUpdate();
				if (i > 0) {
					System.out.println("Record is deleted successfully using prepared statement.");
				}

				System.out.print("Do you wish to continue...(Y/N): ");
				userChoice = scan.nextLine();
			} while (userChoice.equalsIgnoreCase("Y"));

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
