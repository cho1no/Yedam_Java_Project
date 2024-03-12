package com.yedam.java.ch0802;

public class PhoneExample {
	public static void main(String[] args) {
		// 자동타입변환 : 구현클래스 -> 인터페이스 변수, 인터페이스에 정의된 상수와 메소드만 사용가능
		Phone phone = new SmartPhone("Choi");
		phone.turnOn();
		phone.callTo("Hong");
		phone.turnOff();
		// 타입이 interface인 Phone이기 때문에 SmartPhone클래스의 고유 메소드는 사용 불가능
		// phone.search("네이버"); // -> 사용불가
		
		System.out.println("------------------------");
		
		// 강제타입변환 : 인터페이스 변수가 가지는 객체를 구현 클래스로 바꿈
		// => 구현 클래스 고유의 메소드를 사용하기 위해
		// 강제타입변환 전에 객체의 상태를 파악 (강제이기 때문에 위험함(오류날 수 있음))
		if (phone instanceof SmartPhone) { // instanceof는 중요함
			SmartPhone sp = (SmartPhone)phone;
			sp.turnOn();
			sp.callTo("Hong");
			sp.turnOff();
			sp.search("asdf");
		}
	}
}
