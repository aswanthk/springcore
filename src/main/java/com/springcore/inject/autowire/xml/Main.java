package com.springcore.inject.autowire.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/inject/autowire/xml/config.xml");
		Facebook facebook=context.getBean("facebook", Facebook.class);
		System.out.println(facebook);
		context.close();
	}

}
