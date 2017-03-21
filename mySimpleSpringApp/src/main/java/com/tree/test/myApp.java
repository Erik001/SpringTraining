package com.tree.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class myApp {

	public static void main(String[] args) {
		// Fruit myFruit = new Fruit();
		// Vegetable myVegetable = new Vegetable();

		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");

		Fruit myFruit = appContext.getBean("fruit", Fruit.class);
		Fruit myOtherFruit = appContext.getBean("fruitWithName", Fruit.class);
		Vegetable myVegetable = (Vegetable) appContext.getBean("vegetable");

		System.out.println(myFruit.talkAboutYourself());
		System.out.println(myOtherFruit.talkAboutYourself());
		System.out.println(myVegetable.talkAboutYourself());
	}

}
