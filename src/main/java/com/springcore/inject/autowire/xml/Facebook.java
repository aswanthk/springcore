package com.springcore.inject.autowire.xml;

public class Facebook {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Facebook [user=" + user + "]";
	}

	public Facebook(User user) {
		super();
		this.user = user;
	}

	public Facebook() {
		super();
	}
	
}
