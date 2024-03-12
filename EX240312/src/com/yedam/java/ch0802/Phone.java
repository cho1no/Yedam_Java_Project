package com.yedam.java.ch0802;

public interface Phone {
	// 추상 메소드
	public void turnOn();
	public void turnOff();
	public void callTo(String name);
	public void callFrom(String name);
}
