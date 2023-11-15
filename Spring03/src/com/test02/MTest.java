package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		
		Emp joo = (Emp)factory.getBean("joo");
		Emp kim = (Emp)factory.getBean("kim");
		
		System.out.println(joo);
		System.out.println(kim);
		
		Emp park = (Emp)factory.getBean("park");
		Emp cho = (Emp)factory.getBean("cho");
		
		System.out.println(park);
		System.out.println(cho);
	}

}
