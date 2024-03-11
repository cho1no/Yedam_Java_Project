package com.yedam.java.extend;

public class Assign05Parent {
	public String nation;
	
	public Assign05Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public Assign05Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
