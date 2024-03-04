package com.yedam.java.ch04;

public class ConditionalExample {

	public static void main(String[] args) {
		// 기본 if 문
		int score = 56;
		// 점수가 90점 이상인 경우 등급은 A로 할당
		if (score >= 90) {
			System.out.println("점수가 90점 이상입니다.");
			System.out.println("등급은 A입니다.");
		} else if (score >= 80) {
			System.out.println("점수가 80점 이상입니다.");
			System.out.println("등급은 B입니다.");
		} else if (score >= 70) {
			System.out.println("점수가 70점 이상입니다.");
			System.out.println("등급은 C입니다.");
		} else if (score >= 60) {
			System.out.println("점수가 60점 이상입니다.");
			System.out.println("등급은 D입니다.");
		} else {
			System.out.println("점수가 60점 미만입니다.");
			System.out.println("등급은 F입니다.");
		}
		
		System.out.println("점수 배점이 끝났습니다.");
		// 정수 1~ 6사이의 값을 랜덤하게 가져오는 연산식
		int num = (int)(Math.random() * 6) + 1;
		System.out.println(num);
		
		if (num == 1) {
			System.out.println("현재 값은 1입니다.");
		} else if (num == 2) {
			System.out.println("현재 값은 2입니다.");
		} else if (num == 3) {
			System.out.println("현재 값은 3입니다.");
		} else if (num == 4) {
			System.out.println("현재 값은 4입니다.");
		} else if (num == 5) {
			System.out.println("현재 값은 5입니다.");
		}
		
		
		switch (num) {
		case (6):
			System.out.println("현재 값은 6입니다.");
			break;
		case (5):
			System.out.println("현재 값은 5입니다.");
			break;
		case (4):
			System.out.println("현재 값은 4입니다.");
			break;
		case (3):
			System.out.println("현재 값은 3입니다.");
			break;
		case (2):
			System.out.println("현재 값은 2입니다.");
			break;
		default:
			System.out.println("현재 값은 1입니다.");
			break;
		}
		
		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		}
	}
}
