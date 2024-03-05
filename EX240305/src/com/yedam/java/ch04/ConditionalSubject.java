package com.yedam.java.ch04;

import java.util.Scanner;

public class ConditionalSubject {
	public static void main(String[] args) {
		// 문제1) 책 161페이지 5번, for문을 이용해서 다음과 같이 *를 출력하는 코드를 작성해보세요.
		// *
		// **
		// ***
		// ****
		// *****
		// 변수 없이
		System.out.println("##### 1번 #####");
		System.out.println("변수 미사용(2중 for)");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 변수 사용
		System.out.println("변수 사용");
		String star = "";
		for (int i = 0; i < 5; i++) {
			star += "*";
			System.out.println(star);
		}
		System.out.println();
		
		// 문제2) 책 160페이지 2번, for문을 이용해서 1부터 100까지의 정수 중에서 2의 배수가 아닌 숫자의 개수를 구하세요.
		// 단, continue 문을 사용한다.
		System.out.println("##### 2번 #####");
		int cnt = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%2 == 0) continue; // 2의 배수면 continue
			cnt++;
		}
		System.out.println(cnt);
		System.out.println();
		
		// 문제3) 책 161페이지 4번, 중첩 for문을 이용하여 방정식 4x+5y = 60의 모든 해 중 첫번째로 구해지는 값을 (x, y)
		// 형태로 출력해보세요.
		// 단, x와 y는 10이하의 자연수입니다.
		System.out.println("##### 3번 #####");
		outter: for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				if ((i*4) + (j*5) == 60) { // 4x + 5y = 60
					System.out.println("(" + i + ", " + j + ")");
					break outter;
				}
			}
		}
		System.out.println();
		
		// 문제4) do ~ while문과 Math.random()함수를 이용하여 1 ~ 10의 정수 중 7이라는 수가 나올때까지 숫자를 출력하는
		// 코드를 작성해보세요.
		System.out.println("##### 4번 #####");
		int r = 0;
		do {
			r = (int)(Math.random() * 10) + 1;
			System.out.print(r + " ");
		} while (r != 7);
		System.out.println();
		System.out.println();
		
		// 문제5) 책 161페이지 3번, while문과 Math.random() 함수를 이용해서 2개의 주사위를 던졌을때 나오는 숫자를 (숫자1, 숫자2) 형태로 출력하고,
		// 숫자의 합이 5가 아니면 계속 주사위를 던지고, 숫자의 합이 5이면 실행을 멈추는 코드를 작성해보세요.
		// 또한 주사위를 몇번 던졌는지. 횟수를 출력하세요.
		// 숫자의 합이 5가 되는 조합은 (1,4), (4,1), (2,3),(3,2)
		System.out.println("##### 5번 #####");
		cnt = 0;
		while (true) {
			int dice1 = (int)(Math.random() * 6) + 1;
			int dice2 = (int)(Math.random() * 6) + 1;
			cnt++; // 주사위 굴린 횟수 증가
			if (dice1 + dice2 == 5) {
				System.out.println(cnt + "회 시행 : " + "(" + dice1 + ", " + dice2 + ")"); // 조건 만족 시 주사위 굴린 횟수와 주사위 결과 출력
				break;
			}
		}
		System.out.println();
		
		// 문제7)
		System.out.println("##### 7번 #####");
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			System.out.println("--------------------------------");
			System.out.println("| 1.예금 | 2.출금 | 3.잔고 | 4.종료 |");
			System.out.println("--------------------------------");
			System.out.print("선택> ");
			switch (sc.nextInt()) {
			case 1:
				System.out.print("애금액>");
				balance += sc.nextInt();
				break;
			case 2:
				System.out.print("출금액>");
				balance -= sc.nextInt();
				break;
			case 3:
				System.out.println("잔고>" + balance);
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("보기에 나온 숫자만 입력해주세요");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}
}
