package com.yedam.java.ch0502;

import java.util.Scanner;

public class BankExample {
	public static void main(String[] args) {
		/*
		다음 메뉴를 가지는 프로그램을 작성하세요.
		1) 메뉴는 다음과 같이 구성하세요.
		 1.계좌개설 | 2.예금 | 3.출금 | 4.계좌이체 | 5.잔액조회 | 9.종료
		2) 각 메뉴별 기능은 다음 요구사항을 만족하세요.
		[메뉴1] 계좌개설
		- 사용자가 새로운 계좌를 요청할 경우 
		  은행이 보유한 계좌를 추가하고 생성된 계좌번호를 안내합니다.
		- 해당 은행의 경우 최대 보유 계좌 수는 20입니다.(배열 사용)
		- 배열의 인덱스가 고유 계좌번호가 됩니다.
	    [메뉴2] 예금
		- 사용자가 본인 계좌번호를 입력한 후
		  입금할 금액을 입력하면 해당 계좌번호에 입금합니다.
		[메뉴3] 출금
		- 사용자가 본인 계좌번호를 입력한 후
		  출금할 금액을 입력하면 해당 계좌번호에 출금합니다.
		- 이때 해당 계좌번호의 잔액보다 출금할 금액이 크면
		  "요청한 출금 금액이 계좌잔액보다 큽니다."라고 안내합니다.
		[메뉴4] 계좌이체
		- 사용자가 본인 계좌번호를 입력하면 잔액을 안내합니다.
		- 이체할 계좌번호를 입력한 후 
		  이체할 금액을 입력하면 계좌이체를 진행합니다.
		- 이때,
	      1)이체할 계좌번호가 존재하지 않을 경우
		  "없는 계좌번호입니다. 계좌번호를 확인해주세요."라고 안내합니다.
		  2)해당 계좌번호의 잔액보다 출금할 금액이 크면
		  "요청한 출금 금액이 계좌잔액보다 큽니다."라고 안내합니다.  
		[메뉴5] 잔액조회
		- 사용자가 본인 계좌번호를 입력하면 잔액을 안내합니다.
		[메뉴6] 종료
		- 해당 프로그램을 종료합니다.
		 */
		boolean isRun = true;
		Scanner sc = new Scanner(System.in);
		int[] accounts = new int[20]; // 보유 계좌 목록 (배열)
		int account = -1;
		int currentMax = -1;
		
		System.out.println("은행 프로그램을 실행하였습니다.");
		while(isRun) {
			//메뉴 출력
			System.out.println("--------------------------------------");
			System.out.println("1.계좌개설\t\t2.예금\t\t3.출금 ");
			System.out.println("4.계좌이체\t\t5.잔액조회\t\t9.종료");
			System.out.println("--------------------------------------");
			
			//메뉴선택
			System.out.print("선택 >> ");
			int menu = sc.nextInt();
			
			//각 메뉴별 기능수행
			switch (menu) {
			case 1: // 계좌개설
				if (currentMax >= accounts.length-1) {
					System.out.println("계좌를 생성할 수 없습니다.");
					System.out.printf("은행이 보유 할 수 있는 계좌 수는 %d개 입니다.\n", accounts.length);
				} else {
					currentMax++;
					System.out.println("계좌를 만들었습니다.");
					System.out.printf("게좌번호는 %d 입니다.\n", currentMax+1);
				}
				break;
			case 2: // 예금
				System.out.println("예금하실 계좌번호를 입력해주세요.");
				System.out.print("계좌번호 입력 >> ");
				account = sc.nextInt();
				if (account > currentMax+1) {
					System.out.println("해당 계좌는 존재하지 않습니다.");
				} else {
					System.out.print("예금하실 금액을 임력해주세요. >> ");
					int money = sc.nextInt();
					if (money < 0) {
						System.out.println("양수의 값만 입력해주세요.");
					} else {
						accounts[account-1] += money;
						System.out.printf("%d 계좌에 %d원이 예금되었습니다.\n", account, money);
					}
				}
				break;
			case 3: // 출금
				System.out.println("출금하실 계좌번호를 입력해주세요.");
				System.out.print("계좌번호 입력 >> ");
				account = sc.nextInt();
				if (account > currentMax+1) {
					System.out.println("해당 계좌는 존재하지 않습니다.");
				} else {
					System.out.print("출금하실 금액을 임력해주세요. >> ");
					int money = sc.nextInt();
					if (money < 0) {
						System.out.println("양수의 값만 입력해주세요.");
					} else if (accounts[account-1] - money < 0){
						System.out.printf("계좌에 돈이 충분하지 않습니다. 잔액 : %d원\n", accounts[account-1]);
					} else {
						accounts[account-1] -= money;
						System.out.printf("%d 계좌에 %d원이 출금되었습니다.\n", account, money);
					}
				}
				break;
			case 4: // 계좌이체
				System.out.println("본인 계좌와 이체하실 계좌를 입력해주세요.");
				System.out.print("본인 계좌 >> ");
				int myAccount = sc.nextInt();
				if (myAccount > currentMax+1) {
					System.out.println("없는 계좌입니다.");
					break;
				}
				System.out.print("이체할 계좌 >> ");
				int toAccount = sc.nextInt();
				if (toAccount > currentMax+1) {
					System.out.println("없는 계좌입니다.");
					break;
				}
				System.out.print("이체할 금액 >> ");
				int money = sc.nextInt();
				if (money < 0) {
					System.out.println("양수의 값만 입력해주세요.");
				} else if (accounts[myAccount-1] - money < 0) { 
					System.out.println("본인 계좌에 돈이 충분하지 않습니다.");
					System.out.println("계좌 이체에 실패했습니다.");
				} else {
					accounts[toAccount-1] += money;
					accounts[myAccount-1] -= money;
					System.out.printf("%d 계좌에서 %d 계좌로 %d원이 이체되었습니다.\n", myAccount, toAccount, money);
				}
				break;
			case 5: // 잔액조회
				System.out.println("조회하실 계좌번호를 입력해주세요.");
				System.out.print("계좌번호 입력 >> ");
				account = sc.nextInt();
				if (account > currentMax+1) {
					System.out.println("해당 계좌는 존재하지 않습니다.");
				} else {
					System.out.printf("%d 계좌 잔액 %d원\n", account, accounts[account-1]);
				}
				break;
			case 9: // 종료
				isRun = false;
				break;
//			case 81: // 전체 계좌 조회
//				for (int i = 0; i < currentMax+1; i++) {
//					System.out.printf("계좌번호 %d : %d원\n", i+1, accounts[i]);
//				}
//				break;
			default: // 메뉴 범위의 수 처리
				System.out.println("메뉴 항목에 맞는 숫자를 입력해주세요.");
			}
			System.out.println();
		}
		sc.close();
		System.out.println("프로그램을 종료하겠습니다.");
	}
}
