package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereotype/stereo-config.xml");
		Student student1=context.getBean("stud", Student.class);
		System.out.println(student1);
		System.out.println(student1.hashCode());
		System.out.println(student1.getCourses());
		System.out.println(student1.getCourses().getClass().getName());
		Student student2=context.getBean("stud", Student.class);
		System.out.println(student2);
		System.out.println(student2.hashCode());

		System.out.println("-----------------------------");
		
		Teacher teacher1=context.getBean("teacher", Teacher.class);
		System.out.println(teacher1.hashCode());
		Teacher teacher2=context.getBean("teacher", Teacher.class);
		System.out.println(teacher2.hashCode());
	}
}
