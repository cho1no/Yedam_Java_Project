package com.yedam.java.extend;

public class Calculator {
	static final double PI = 3.141592;
	
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return PI * r * r;
	}
	void print() {
		System.out.println("부모메소드입니다.");
	}
}
