package com.yedam.java.ch0802;

public class SmartPhone implements Phone {
	// 필드
	public String owner;
	
	// 생성자
	public SmartPhone(String owner){
		this.owner = owner;
	}
	
	// 메소드
	public void exeutedApp(String appName) {
		System.out.println(appName + "를 실행합니다.");
	}
	
	public void search(String keyword) {
		System.out.println(keyword + "를 검색합니다.");
	}
	
	// 인터페이스 구현
	@Override
	public void turnOn() {
		System.out.println("스마트폰을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("스마트폰을 끕니다.");
	}

	@Override
	public void callTo(String name) {
		System.out.println(name + "에게 전화를 겁니다.");
	}

	@Override
	public void callFrom(String name) {
		System.out.println(name + "에게서 전화가 왔습니다.");
	}
}
