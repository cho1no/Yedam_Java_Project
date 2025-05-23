package com.yedam.java.ch0703;

public abstract class Phone { // 추상 클래스
	// 필드
	protected String owner;
	
	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// 메소드
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	// 추상 메소드
	public abstract void execute();
}
