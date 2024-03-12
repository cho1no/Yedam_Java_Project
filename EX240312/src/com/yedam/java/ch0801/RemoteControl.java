package com.yedam.java.ch0801;

public interface RemoteControl {
	// 상수 (필드가 상수임(변경불가능)) 
	// static final을 붙이는 상수가 맞는데 쓰진 않음(생략되었기 때문)
	// interface는 정적이기 때문
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 추상메소드 -> 모든 메소드가 추상메소드임
	// interface는 abstract가 기본(생략됨) instance는 default가 기본
	public void turnOn();
	public abstract void turnOff(); // abstract 쓰나 안쓰나 똑같음
	
}
