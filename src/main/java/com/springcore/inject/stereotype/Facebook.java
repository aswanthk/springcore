package com.springcore.inject.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Facebook {
	
	@Value("#{ new T(com.springcore.inject.stereotype).User() }")
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
