package com.jm2008.learn.jdbc.dao;

public class EmployeeApp {

	public static void main(String[] args) {
		EmployeeDao employeeDao = new EmployeeDaoImpl();

//		employeeDao.createEmployeeTable();

		Employee employee = new Employee(100, "Sai", "abc@abc.com", 22, 500000.1);
		int i = employeeDao.saveEmployee(employee);
		if(i > 0) {
			System.out.println("Employee inserted successfully.");
		}
	}

}
