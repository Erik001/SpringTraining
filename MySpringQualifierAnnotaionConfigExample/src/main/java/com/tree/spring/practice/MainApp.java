package com.tree.spring.practice;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/tree/configuration/appContext.xml");
		// ApplicationContext context = new
		// FileSystemXmlApplicationContext("appContext.xml");

		HelloWorld hello = context.getBean("helloWorld", HelloWorld.class);
		hello.getMessage();
		context.registerShutdownHook();

	}

}
