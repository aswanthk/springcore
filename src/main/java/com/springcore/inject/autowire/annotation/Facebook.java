package com.springcore.inject.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Facebook {
	
	private User user;

	public User getUser() {
		return user;
	}

//	@Autowired
//	@Qualifier("user2")
	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Facebook [user=" + user + "]";
	}
	
	@Autowired
	public Facebook(User user) {
		super();
		this.user = user;
	}

	public Facebook() {
		super();
	}
	
}
