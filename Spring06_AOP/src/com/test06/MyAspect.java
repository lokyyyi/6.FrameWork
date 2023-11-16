package com.test06;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	
	@Pointcut("execution(public * *(..))")
	public void test() {
	}
	
	@Before("test()")
	public void before(JoinPoint join) {
		System.out.println("qr코드를 찍는다");
	}
	@After("test()")
	public void after(JoinPoint join) {
		System.out.println("침대에 눕는다");
	}
}
