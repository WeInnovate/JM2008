package com.jm2008.learn.jdbc.dml.pstmt.userinput;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.jm2008.learn.jdbc.util.DbUtil;

public class InsertIntoUserTable {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getCon();
			PreparedStatement pstmt = con.prepareStatement("UPDATE JM2008_USER SET NAME = ? WHERE ID = ?");

			Scanner scan = new Scanner(System.in);
			String userChoice = null;
			do {

				System.out.print("Please enter ID: ");
				int id = Integer.parseInt(scan.nextLine());

				System.out.print("Please enter Name: ");
				String name = scan.nextLine();

				pstmt.setInt(2, id);
				pstmt.setString(1, name);

				int i = pstmt.executeUpdate();
				if (i > 0) {
					System.out.println("Record is updated successfully using prepared statement.");
				}

				System.out.print("Do you wish to continue...(Y/N): ");
				userChoice = scan.nextLine();
			} while (userChoice.equalsIgnoreCase("Y"));

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
