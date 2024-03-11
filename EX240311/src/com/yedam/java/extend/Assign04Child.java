package com.yedam.java.extend;

public class Assign04Child extends Assign04Parent{
	private int studentNo;
	
	public Assign04Child(String name, int studentNo) {
		super(name);
		this.name = name;
		this.studentNo = studentNo;
	}
}
