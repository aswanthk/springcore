package com.springcore.inject.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/inject/constructor/config.xml");
		Facebook facebook=context.getBean("facebook", Facebook.class);
		System.out.println(facebook);
		context.close();
	}

}
