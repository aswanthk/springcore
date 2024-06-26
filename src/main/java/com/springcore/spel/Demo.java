package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	// Inject literals and evaluate expressions using SpEL
	@Value("#{22+11}")
	private int x;
	@Value("#{31/3}")
	private int y;
	
	// Evaluate ternary expression using SpEL
	@Value("#{ 82>50 ? 82 : 50 }")
	private int a;
	
	// Inject values by calling static methods & static variables using SpEL
	@Value("#{ T(java.lang.Math).sqrt(144) }")
	private double z;
	
	@Value("#{ T(java.lang.Math).PI }")
	private double pi;
	
	// Inject objects using SpEL
	@Value("#{ new String('Evan Toe') }")
	private String name;
	
	// Inject boolen value using SpEL
	@Value("#{ 70-20>30 }")
	private boolean isActive;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", a=" + a + ", z=" + z + ", pi=" + pi + ", name=" + name + ", isActive="
				+ isActive + "]";
	}
	
}
