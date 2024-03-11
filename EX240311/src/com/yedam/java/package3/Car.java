package com.yedam.java.package3;

public class Car {
	// 필드
	private int speed;
	private boolean stop;
	
	// 생성자
	
	// 메소드
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed < 0 ? 0 : speed;
	}
	
	public boolean isStop() {
		return this.stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
