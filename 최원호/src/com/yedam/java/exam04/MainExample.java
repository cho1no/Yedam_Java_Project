package com.yedam.java.exam04;

public class MainExample {

	public static void main(String[] args) {
		for (int i = 2; i < 10; i+=2) { // 증가 조건을 짝수(2)로 걸고 시작을 짝수(2)로 함
			System.out.printf("### %d단 ###\n", i); // 구별을 위해 단 출력
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d X %d : %d\n", i, j, i*j);
			}
		}
	}
}
