package com.yedam.java.ch0605;

public class Car {
	// 필드
	String model;
	int speed;

	// 생성자
	Car(String model) {
		this.model = model;
	}
	
	// 메소드
	void setSpeed(int speed) {
		this.speed= speed;
	}
	
	void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.printf("%s가 달립니다. (시속 : %dkm/h)\n", this.model, this.speed);
		}
	}

}
