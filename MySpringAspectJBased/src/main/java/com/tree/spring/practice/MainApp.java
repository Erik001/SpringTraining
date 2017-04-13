package com.tree.spring.practice;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/tree/configuration/appContext.xml");
		// ApplicationContext context = new
		// FileSystemXmlApplicationContext("appContext.xml");
		Student student = context.getBean("student", Student.class);
		
		student.getName();
		student.getAge();
		student.printThrowException();
		
	}

}