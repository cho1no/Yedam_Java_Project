package com.yedam.java.ch0702;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		myCar.changeTire(1, new HankookTire("앞왼쪽", 10));
		//myCar.changeTire(3, new NexenTire("앞왼쪽", 10));
		
		myCar.run();
	}
}
