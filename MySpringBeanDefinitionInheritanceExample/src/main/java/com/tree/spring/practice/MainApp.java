package com.tree.spring.practice;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/tree/spring/configuration/appContext.xml");
		//ApplicationContext context = new FileSystemXmlApplicationContext("appContext.xml");
		HelloWorld objA = context.getBean("helloWorld", HelloWorld.class);
		objA.getMessage1();
		objA.getMessage2();
		System.out.printf("***************************************%n");
		HelloWorldMexico objB = context.getBean("helloWorldMexico", HelloWorldMexico.class);
		objB.getMessage1();
		objB.getMessage2();
		objB.getMessage3();
		
		

	}

}
