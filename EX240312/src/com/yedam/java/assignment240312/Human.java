package com.yedam.java.assignment240312;

public class Human {
	// 필드
	String name;
	double height;
	double weight;
	
	// 생성자
	Human(String name, double height, double weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	// 메소드
	public void getInformation() {
		System.out.printf("%s님의 신장 %.0f, 몸무게 %.0f", this.name, this.height, this.weight);
	}
}
