package com.test04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	@Before("execution(public * *(..))")
	public void before(JoinPoint join) {
		System.out.println("qr코드를 찍는다.");
	}
	@After("execution(public * *(..))")
	public void after(JoinPoint join)	{
		System.out.println("침대에 눕는다.");
	}
	@AfterReturning(pointcut="execution(public * *(..))", returning="returnVal")
	public void returning(JoinPoint join, Object returnVal) {
		System.out.println(returnVal +" 공부하는 날이었다.");
	}
	@AfterThrowing("excution(public * *(..))")
	public void thorowing(JoinPoint join) {
		System.out.println("주말이었다.");
	}
}
