package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("stud")
@Scope("prototype")
public class Student {
	@Value("Harihar")
	private String studentName;
	@Value("Hariyana")
	private String city;
	
	@Value("#{mycourses}")
	private List<String> courses;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", courses=" + courses + "]";
	}

}
