package com.tree.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class myApp {

	public static void main(String[] args) {
		// Fruit myFruit = new Fruit();
		// Vegetable myVegetable = new Vegetable();

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/tree/config/appContext.xml");

		Meal myNormalMeal = new Meal();
		System.out.println("Normal meal: " + myNormalMeal.whatsInThisMeal());
		
		Meal mySpringMeal = appContext.getBean("meal", Meal.class);
		System.out.println("Spring meal: " + mySpringMeal.whatsInThisMeal());
		
		Meal mySpringMealAuto = appContext.getBean("mealAutowired", Meal.class);
		System.out.println("Spring meal Autowired Default: " + mySpringMealAuto.whatsInThisMeal());


		((ClassPathXmlApplicationContext) appContext).close();

	}

}
 