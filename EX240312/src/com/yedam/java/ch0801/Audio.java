package com.yedam.java.ch0801;

public class Audio implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("Audio 전원을 킵니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio 전원을 끕니다.");
	}
}
