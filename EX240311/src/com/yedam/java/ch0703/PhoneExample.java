package com.yedam.java.ch0703;

public class PhoneExample {
	public static void main(String[] args) {
		Phone phone = new SmartPhone("Choi"); // 자동타입변환
		phone.turnOn();
		phone.turnOff();
		phone.execute();
		//sp.internetSearch(); // 자식의 메소드라 실행 불가능
		
		System.out.println("---------------------------------");
		
		SmartPhone sp = (SmartPhone) phone; // 강제타입변환
		sp.turnOn();
		sp.turnOff();
		phone.execute();
		sp.internetSearch();
	}
}
