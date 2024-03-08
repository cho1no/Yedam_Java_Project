package com.yedam.java.ch0605;

public class FinalExample {
	public static void main(String[] args) {
		// 정적 필드 상수
		System.out.printf("지구 반지름 : %.2f, 지구 표면적 : %.10f\n", Earth.EARTH_RADIUS, Earth.EARTH_AREA);
		
		// 인스턴스 필드 상수
		Person choi = new Person("1111", "Wonho");
		System.out.printf("%s, %s, %s\n", choi.nation, choi.ssn, choi.name);
		Person lee = new Person("2222", "Kangin");
		System.out.printf("%s, %s, %s\n", lee.nation, lee.ssn, lee.name);
	}
}
