package com.yedam.java.extend;

public class ChildClass extends ParentClass {
	String name = "Hong";
	int age = 20; // protected랑 default랑 관계가 없을경우 같음
	String job = "개발자";
	String company = "Yedam";

	ChildClass() {
		System.out.println("자식 클래스 생성");
		System.out.printf("부모 > %d, %s\n", super.age, super.job);
		System.out.printf("자식 > %s, %d, %s, %s\n", this.name, this.age, this.job, this.company);
	}

	public int getAge() {
		return this.age;
	}

	public String getJob() {
		return this.job;
	}
}
