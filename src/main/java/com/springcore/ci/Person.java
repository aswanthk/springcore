package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int id;
	private Certi certi;
	private List<String> courses;
	
	public Person(String name, int id, Certi certi, List<String> courses) {
		this.name=name;
		this.id=id;
		this.certi=certi;
		this.courses=courses;
	}

	@Override
	public String toString() {
		return this.name + " : " + this.id + " : " + this.certi + " : " + this.courses;
	}
}
