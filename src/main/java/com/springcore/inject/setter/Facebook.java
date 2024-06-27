package com.springcore.inject.setter;

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
	
}
