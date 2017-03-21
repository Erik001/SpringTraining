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
		Fruit myFruitWithListAndMap = appContext.getBean("fruitWithListAndMap", Fruit.class);

		Vegetable myVegetable = (Vegetable) appContext.getBean("vegetable");
		Vegetable myOtherVegetable = (Vegetable) appContext.getBean("vegWithName");

		System.out.println(myFruit.talkAboutYourself());
		System.out.println(myOtherFruit.talkAboutYourself());
		System.out.println(myVegetable.talkAboutYourself());
		System.out.println(myOtherVegetable.talkAboutYourself());
		for (String fruitName : myFruitWithListAndMap.getFruitNameList()) {
			System.out.println(
					"The " + fruitName + " is of color " + myFruitWithListAndMap.getFruitNameMap().get(fruitName));
		}
	}

}
