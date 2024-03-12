package com.yedam.java.assignment240312;

public class Employee {
	// 필드
	private String name;
	private int salary;
	
	// 생성자
	Employee(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	
	// 메소드
	// getter
	String getName() {
		return this.name;
	}
	int getSalary() {
		return this.salary;
	}
	
	public void getInformation() {
		System.out.printf("이름:%s 연봉:%d\n", this.name, this.salary);
	}
	public void print() {
		System.out.println("수퍼클래스");
	}
}
