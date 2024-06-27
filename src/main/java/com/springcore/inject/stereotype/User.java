package com.springcore.inject.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
	@Value("Peter")
	private String username;
	@Value("18")
	private int age;
	@Value("Russia")
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
	
	public User() {
		super();
	}
	
	public User(String username, int age, String country) {
		super();
		this.username = username;
		this.age = age;
		this.country = country;
	}
	
}
