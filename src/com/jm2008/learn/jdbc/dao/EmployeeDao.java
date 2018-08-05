package com.jm2008.learn.jdbc.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.jm2008.learn.jdbc.util.DbUtil;

public interface EmployeeDao {

	Employee getEmployee(long id);

	List<Employee> getEmployee();

	int saveEmployee(Employee employee);

	int updateEmployee(Employee employee);

	int deleteEmployee(long id);

	default void createEmployeeTable() {
		Connection con = null;
		try {
			con = DbUtil.getCon();
			Statement stmt = con.createStatement();
			boolean retVal = stmt.execute(
					"CREATE TABLE JM2008_EMPLOYEE(ID BIGINT, NAME VARCHAR, EMAIL VARCHAR, AGE NUMBER, SALARY DECIMAL)");
			if (!retVal) {
				System.out.println("Employee table created successfully!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
