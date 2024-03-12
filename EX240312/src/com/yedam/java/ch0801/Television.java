package com.yedam.java.ch0801;

public class Television implements RemoteControl{
	
	// 인터페이스 구현(메소드 정의)
	@Override
	public void turnOn() {
		System.out.println("TV 전원을 킵니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV 전원을 끕니다.");
	}
	
}
