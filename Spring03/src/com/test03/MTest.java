package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
		Developer joohl = (Developer)factory.getBean("joohl");
		Engineer kimhl = (Engineer)factory.getBean("kimhl");
		
		System.out.println(joohl);
		System.out.println(kimhl);
	}

}
