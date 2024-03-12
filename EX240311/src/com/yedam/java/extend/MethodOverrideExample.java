package com.yedam.java.extend;

public class MethodOverrideExample {
	public static void main(String[] args) {
		Computer com = new Computer();
		
		double result = com.areaCircle(10);
		System.out.println("Computer : " + result);
		
		com.print(); // 부모 메소드 호출
		
		result = com.selectedParentMethod(10);
		System.out.println("selectedP : " + result);
	}
}
