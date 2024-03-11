package com.yedam.java.extend;

public class ParentClass {
	private String name = "Kang";
	protected int age = 45; // protected랑 default랑 관계가 없을경우 같음
	String job = "교사";
	protected ParentClass(){
		System.out.println("부모 클래스 생성");
		System.out.printf("%s, %d, %s\n", name, age, job);
	}
}
