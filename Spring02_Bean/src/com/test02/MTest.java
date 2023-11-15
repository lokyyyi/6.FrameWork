package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		
		Address joo = (Address)factory.getBean("joo");
		System.out.println(joo.toString());
		
		Address park = (Address)factory.getBean("park");
		System.out.println(park);
	}

}
