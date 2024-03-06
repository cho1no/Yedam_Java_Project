package com.yedam.java.ch0502;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountExample {
	public static void main(String[] args) {
		boolean run = true; // 프로그램 실행여부
		int account = 0;	// 계좌(저장소)
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("메뉴 선택> ");
			
			int menu  = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.print("애금액>");
				account += sc.nextInt();
				break;
			case 2:
				System.out.print("출금액>");
				account -= sc.nextInt();
				break;
			case 3:
				System.out.println("잔고>" + account);
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
