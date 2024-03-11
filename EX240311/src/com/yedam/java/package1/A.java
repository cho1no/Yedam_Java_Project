package com.yedam.java.package1;

public class A { // default 접근 제한자
	// 필드
	public int field1;
	int field2; // default
	private int field3;
	
	// 생성자
	public A() {
		this.field1 = 100;
		this.field2 = 200;
		this.field3 = 300;
		
		this.method1();
		this.method2();
		this.method3();
		
		A a1 = new A(true);
		A a2 = new A(100);
		A a3 = new A("문자열");
	}
	public A(boolean t) {}
	A(int b) {}
	private A(String s) {}
	
	// 메소드
	public void method1() {}
	void method2() {}
	private void method3() {}
	
}
