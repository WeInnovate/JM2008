package com.jm2008.learn.jdbc.img;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jm2008.learn.jdbc.util.DbUtil;

public class SaveImage {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getCon();
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2008_PROFILE VALUES(?, ?)");

			pstmt.setString(1, "Subham");

			// read binary file from the specified location and bring it the memory
			FileInputStream fis = new FileInputStream("img/tech-word-cloud.jpg");

			// set the fetched binary/bytes to the second question mark of the
			// PreparedStatement
			pstmt.setBinaryStream(2, fis, fis.available());

			int retVal = pstmt.executeUpdate();
			if (retVal > 0) {
				System.out.println("Image inserted successfully!!!");
			}

		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}

}
