package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
	private double prize;

	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}

	public Pepsi() {
		super();
	}

	@Override
	public String toString() {
		return "Pepsi [prize=" + prize + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing Pepsi: init");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroying Pepsi: destroy");
	}
	
}
