package com.springcore.lifecycle;

public class Pizza {
	private double prize;

	public Pizza() {
		super();
	}

	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}

	@Override
	public String toString() {
		System.out.println("Setting prize");
		return "Pizza [prize=" + prize + "]";
	}
	
	/*
	 * public void init() { System.out.println("init method called"); }
	 * 
	 * public void destroy() { System.out.println("destroy method called"); }
	 */
	
	public void hey() {
		System.out.println("init method called");
	}
	
	public void bye() {
		System.out.println("destroy method called");
	}
	
}
