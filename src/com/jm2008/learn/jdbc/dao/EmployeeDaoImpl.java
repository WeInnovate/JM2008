package com.jm2008.learn.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.jm2008.learn.jdbc.util.DbUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Employee getEmployee(long id) {
		return null;
	}

	@Override
	public List<Employee> getEmployee() {
		return null;
	}

	@Override
	public int saveEmployee(Employee employee) {
		try (Connection con = DbUtil.getCon()) {

			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2008_EMPLOYEE VALUES(?, ?, ?, ?, ?)");

			pstmt.setLong(1, employee.getId());
			pstmt.setString(2, employee.getName());
			pstmt.setString(3, employee.getEmail());
			pstmt.setInt(4, employee.getAge());
			pstmt.setDouble(5, employee.getSalary());

			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteEmployee(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
