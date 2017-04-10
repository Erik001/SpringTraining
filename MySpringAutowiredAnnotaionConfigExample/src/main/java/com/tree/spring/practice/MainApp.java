package com.tree.spring.practice;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/tree/configuration/appContext.xml");
		//ApplicationContext context = new FileSystemXmlApplicationContext("appContext.xml");
		
		TextEditorAnnotatedSetter teSetter =context.getBean("textEditorSetter", TextEditorAnnotatedSetter.class);
		teSetter.spellCheck();
		
		TextEditorAnnotatedProperty teProperty =context.getBean("textEditorProperty", TextEditorAnnotatedProperty.class);
		teProperty.spellCheck();
		
		TextEditorAnnotatedConstructor teConstructor =context.getBean("textEditorConstructor", TextEditorAnnotatedConstructor.class);
		teConstructor.spellCheck();
		

	}

}
