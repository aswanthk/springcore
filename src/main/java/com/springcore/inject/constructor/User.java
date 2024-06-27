package com.springcore.inject.constructor;

public class User {
	private String username;
	private int age;
	private String country;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "User [username=" + username + ", age=" + age + ", country=" + country + "]";
	}
	public User(String username, int age, String country) {
		super();
		this.username = username;
		this.age = age;
		this.country = country;
	}
	
}
