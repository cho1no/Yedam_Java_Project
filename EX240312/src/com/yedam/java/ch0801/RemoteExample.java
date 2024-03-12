package com.yedam.java.ch0801;

public class RemoteExample {
	public static void main(String[] args) {
		// tv를 구현
		Television tv = new Television();
		tv.turnOn();
		tv.turnOff();
		
		System.out.println();
		
		SmartTelevision stv = new SmartTelevision();
		stv.search("네이버");
		
		System.out.println();
		
		// 다형성 = 메소드 오버라이딩 + 타입변환
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();

		System.out.println();
		
		// 다중인터페이스로 구현했지만 타입에 따라 기능 제한이 생길 수 있음
		// 아래 기준 interface인 RemoteControl이 타입임
		// 다중 인터페이스를 구현한 SamrtTelevision이지만 선언된 타입인 RemoteControl의 기능만 사용가능
		rc = new SmartTelevision(); 
		rc.turnOn();
		rc.turnOff();
		
	}
}
