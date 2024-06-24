package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
//		Pizza pizza=(Pizza) context.getBean("pizza");
//		System.out.println(pizza);
		context.registerShutdownHook();
		
//		System.out.println("----------------------------------");
//		
//		Pepsi pepsi=(Pepsi) context.getBean("pepsi");
//		System.out.println(pepsi);
//		
//		System.out.println("----------------------------------");
		
		MineralWater water=(MineralWater) context.getBean("water");
		System.out.println(water);
		
	}

}
