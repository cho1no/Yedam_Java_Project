package com.yedam.java.ch0702;

/**
 * 타이어와 집합관계
 */
public class Car {
	// 필드의 다형성
	// 필드 : 자동타입변환으로 값 초기화
	Tire frontLeftTire = new Tire("좌측앞", 6);
	Tire frontRightTire = new KumhoTire("우측앞", 2);
	Tire backLeftTire = new Tire("좌측뒤", 3);
	Tire backRightTire = new HankookTire("우측뒤", 4);
	//NexenTire backRightTire = new NexenTire("우측뒤", 5);
	
	// 생성자
	
	// 메소드
//	int run() {
//		System.out.println("[자동차가 달립니다.]");
//		if(!frontLeftTire.roll()) { stop(); return 1; }
//		if(!frontRightTire.roll()) { stop(); return 2; }
//		if(!backLeftTire.roll()) { stop(); return 3; }
//		if(!backRightTire.roll()) { stop(); return 4; }
//		return 0;
//	}
	boolean run() {
		System.out.println("[자동차가 달립니다.]");
		boolean isRun = true;
		isRun = frontLeftTire.roll();
		isRun = frontRightTire.roll();
		isRun = backLeftTire.roll();
		isRun = backRightTire.roll();
		return isRun;
	}

	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
	// 타이어 교체 : 매개변수의 다형성
	void changeTire(int location, Tire newTire) {
		String text  = "";
		switch(location) {
		case 1:
			text = "좌측 앞";
			frontLeftTire = newTire;
			break;
		case 2:
			text = "우측 앞";
			frontRightTire = newTire;
			break;
		case 3:
			text = "좌측 뒤";
			backLeftTire = newTire;
			break;
		case 4:
			text = "우측 뒤";
			backRightTire = newTire;
			break;
		}
		System.out.printf("[%s 타이어를교체합니다.]\n", text);
	}
	
}
