package com.tree.spring.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		//ApplicationContext context = new FileSystemXmlApplicationContext("appContext.xml");
		HelloWorld objA = context.getBean("helloWorld", HelloWorld.class);
		
		objA.setMessage("I'm object A!!!");
		objA.getMessage();
		
		HelloWorld objB = context.getBean("helloWorld", HelloWorld.class);
		objB.getMessage();

	}

}
