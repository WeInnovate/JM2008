package com.jm2008.learn;

import java.util.Arrays;

public class User {

	private String name;

	private String email;

	private String mobile;

	private int age;

	private String gender;

	private String[] courses;

	private String city;

	private String comment;

	private String type;

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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public User(String name, String email, String mobile, int age, String gender, String[] courses, String city,
			String comment, String type) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.age = age;
		this.gender = gender;
		this.courses = courses;
		this.city = city;
		this.comment = comment;
		this.type = type;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", mobile=" + mobile + ", age=" + age + ", gender=" + gender
				+ ", courses=" + Arrays.toString(courses) + ", city=" + city + ", comment=" + comment + ", type=" + type
				+ "]";
	}
}
