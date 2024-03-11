package com.yedam.java.extend;

public class Assign05Child extends Assign05Parent{
	private String name;
	
	public Assign05Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Assign05Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
