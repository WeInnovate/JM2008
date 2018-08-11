package com.jm2008.learn.jdbc.dao;

public class Employee {

	private long id;

	public Employee(long id, String name, String email, int age, Double salary) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.salary = salary;
	}

	private String name;

	private String email;

	private int age;

	private Double salary;

	public Employee() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
