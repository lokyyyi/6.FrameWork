package com.test06;

import org.springframework.stereotype.Component;

@Component
public class Man implements Person{

	@Override
	public String classWork() {
		System.out.println("컴퓨터를 켜서 MLP에 로그인한다.");
		return "스프링";
	}

}
