package com.test05;

public class SamsungTV implements TV{

	public SamsungTV() {
		System.out.println("samsungTV 생성!!");
	}
	@Override
	public void powerOn() {
		System.out.println("samsung tv on");
	}

	@Override
	public void powerOff() {
		System.out.println("samsung tv off");
		
	}

}
