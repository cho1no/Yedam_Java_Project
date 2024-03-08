package com.yedam.java.ch0603;

public class Calculator {
	// 필드
	
	// 생성자
	
	// 메소드
	// 더하기
	int plus(int n, int m) { return n + m; }
	int plus(double n, double m) { return (int)(n + m); }
	// 빼기
	int minus(int n, int m) { return n - m;	}
	// 평균
	double avg(double n, double m) {
		return plus(n, m)/2.0;
	}
}
