package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test04/applicationContext.xml");
		
		Developer joo = factory.getBean("joohl",Developer.class);
		Engineer kim = factory.getBean("kimhl",Engineer.class);
		
		System.out.println(joo);
		System.out.println(kim);
	}

}
