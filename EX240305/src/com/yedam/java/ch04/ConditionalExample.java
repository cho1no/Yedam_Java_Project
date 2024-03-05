package com.yedam.java.ch04;

public class ConditionalExample {
	public static void main(String[] args) {
		// 1 ~ 10 사이의 모든 정수들의 합
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
		}
		System.out.println("for문 : " + sum);
		sum = 0;
		int i = 1;
		while (i < 11) {
			sum += i;
			i++;
		}
		System.out.println("while문 : " + sum);
	}
}
