package com.tree.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myApp {

	public static void main(String[] args) {
		// Fruit myFruit = new Fruit();
		// Vegetable myVegetable = new Vegetable();

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/tree/config/appContext.xml");
		
		Fruit myFruit = appContext.getBean("fruit", Fruit.class);
		System.out.println(myFruit.talkAboutYourself());
		((ClassPathXmlApplicationContext) appContext).close();

	}

}
 