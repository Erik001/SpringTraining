package com.tree.spring.practice;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		//ApplicationContext context = new FileSystemXmlApplicationContext("appContext.xml");
		HelloWorld obj = context.getBean("helloWorld", HelloWorld.class);
		
		obj.getMessage();
		context.registerShutdownHook();
		

	}

}
