package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/ref-config.xml");
		A obj=(A) context.getBean("aref");
		System.out.println(obj.getX());
		System.out.println(obj.getObj().getY());
		System.out.println(obj);
	}

}
