package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		MyFood myFood = factory.getBean("myFood", MyFood.class);
		System.out.println(myFood);
	}
}
