package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
//	@Autowired
//	@Qualifier("temp2")
	private Address address;

	public Address getAddress() {
		return address;
	}

	@Autowired
	@Qualifier("temp2")
	public void setAddress(Address address) {
		System.out.println("Initialized by Setter method");
		this.address = address;
	}

	public Emp() {
		super();
	}

//	@Autowired
	public Emp(Address address) {
		super();
		System.out.println("Initialized by Constructor");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
}
