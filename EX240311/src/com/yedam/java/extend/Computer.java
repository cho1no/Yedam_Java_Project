package com.yedam.java.extend;

public class Computer extends Calculator{
	
	// 어노테이션(@) 쓰는 이유는 메소드 오버라이딩 시 정확히 불러와서 쓰는지 확인하기 위함(체크용)
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
	
	double selectedParentMethod(double r) { // 부모의 메소드를 불러올 수 있음
		return super.areaCircle(r);
	}
}
