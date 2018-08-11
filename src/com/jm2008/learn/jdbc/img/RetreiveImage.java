package com.jm2008.learn.jdbc.img;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jm2008.learn.jdbc.util.DbUtil;

public class RetreiveImage {

	public static void main(String[] args) {
		try {
			Connection con = DbUtil.getCon();

			PreparedStatement pstmt = con.prepareStatement("SELECT IMAGE FROM JM2008_PROFILE WHERE NAME = ?");
			pstmt.setString(1, "Subham");

			ResultSet rs = pstmt.executeQuery();
			rs.next();

			Blob blob = rs.getBlob(1);
			byte[] bArr = blob.getBytes(1, (int) blob.length());

			FileOutputStream fos = new FileOutputStream("img/out-put.jpg");
			fos.write(bArr);

			System.out.println("Image has been retreived.");
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}

}
