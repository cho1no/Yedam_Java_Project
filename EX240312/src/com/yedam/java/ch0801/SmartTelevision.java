package com.yedam.java.ch0801;

public class SmartTelevision implements RemoteControl, Searchable {
	// Interface Searchable
	@Override
	public void search(String url) {
		System.out.println(url + "을(를) 검색합니다.");
	}

	// Interface RemoteControl
	@Override
	public void turnOn() {
		System.out.println("TV 전원을 킵니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 전원을 끕니다.");
	}

}
