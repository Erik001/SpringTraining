package com.tree.spring.practice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.tree.configuration.HelloWolrdConfig;
import com.tree.configuration.TextEditorConfig;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWolrdConfig.class,TextEditorConfig.class);
		// ApplicationContext context = new
		// FileSystemXmlApplicationContext("appContext.xml");
		HelloWorld hello = context.getBean(HelloWorld.class);
		hello.setMessage("Hello Taco!!!");
		hello.getMessage();
		
		TextEditor te = context.getBean(TextEditor.class);
		te.spellCheck();
		
		context.registerShutdownHook();

	}

}
