package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
		LgTV tv = (LgTV)factory.getBean("LG");
		//@Component로 생성된 bean의 이름은 클래스명과 동일. 단 첫글자가 소문자
		tv.powerOn();
		tv.powerOff();
	}

}
