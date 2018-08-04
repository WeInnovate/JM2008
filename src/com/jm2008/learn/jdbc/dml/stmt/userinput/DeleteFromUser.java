package com.jm2008.learn.jdbc.dml.stmt.userinput;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.jm2008.learn.jdbc.util.DbUtil;

public class DeleteFromUser {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getCon();
			Statement stmt = con.createStatement();

			Scanner scan = new Scanner(System.in);
			String userChoice;
			do {
				System.out.print("Please enter ID: ");
				int id = Integer.parseInt(scan.nextLine());

				int retVal = stmt.executeUpdate("DELETE FROM JM2008_USER WHERE ID = " + id + "");
				if (retVal > 0) {
					System.out.println("Record has been deleted successfully.");
				}
				System.out.print("Do you wish to continue...(Y/N): ");
				userChoice = scan.nextLine();
			} while (userChoice.equalsIgnoreCase("Y"));

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
