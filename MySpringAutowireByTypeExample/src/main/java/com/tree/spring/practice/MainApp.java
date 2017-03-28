package com.tree.spring.practice;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/tree/spring/configuration/appContext.xml");
		//ApplicationContext context = new FileSystemXmlApplicationContext("appContext.xml");
		TextEditor te = context.getBean("textEditor", TextEditor.class);
		te.spellCheck();
				
		

	}

}
