package com.tree.spring.practice;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/tree/spring/configuration/appContext.xml");
		//ApplicationContext context = new FileSystemXmlApplicationContext("appContext.xml");
		JavaCollection jc = context.getBean("javaCollection", JavaCollection.class);
		jc.getAddressList();
		jc.getAddressSet();
		jc.getAddressMap();
		jc.getAddressProperties();
				
		

	}

}
