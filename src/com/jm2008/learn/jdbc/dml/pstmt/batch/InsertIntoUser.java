package com.jm2008.learn.jdbc.dml.pstmt.batch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.jm2008.learn.jdbc.util.DbUtil;

public class InsertIntoUser {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getCon();
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2008_USER VALUES(?, ?)");

			Scanner scan = new Scanner(System.in);
			String userChoice = null;

			do {
				System.out.print("Please enter ID: ");
				int id = Integer.parseInt(scan.nextLine());

				System.out.print("Please enter Name: ");
				String name = scan.nextLine();

				pstmt.setInt(1, id);
				pstmt.setString(2, name);

				pstmt.addBatch();

				System.out.print("Do you wish to continue...(Y/N): ");
				userChoice = scan.nextLine();
			} while (userChoice.equalsIgnoreCase("Y"));

			int[] retVal = pstmt.executeBatch();
			for (int i = 0; i < retVal.length; i++) {
				System.out.print(retVal[i] + " ");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
