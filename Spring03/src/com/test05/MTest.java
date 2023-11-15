package com.test05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test05/applicationContext.xml");
		System.out.println("Spring Bean Containor 생성 완료");
		
		//ApplicationContext: 컨텍스트 초기화 시점에 모든 빈을 생성.(미리 빈을 생성해 놓아 빈이 필요할 때 즉시 사용)

//		기존방식		
//		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("com/test05/applicatioinContext.xml"));
//		bf.getBean(null);
//		처음으로 getBean()이 호출된 시점에야 해당 빈 생성
		
		TV tv = factory.getBean("samsung",SamsungTV.class);
	}

}
