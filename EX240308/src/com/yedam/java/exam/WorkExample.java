package com.yedam.java.exam;

import java.util.Scanner;

public class WorkExample {
	public static void main(String[] args) {
		boolean isRun = true;
		Scanner sc = new Scanner(System.in);
		Work[] workList = new Work[10];
		int current = 0;
		while (isRun) {
			System.out.println("=================================================");
			System.out.println(" 1.할일추가 | 2.할일확인 | 3.할일완료 | 4.전체목록 | 5.종료");
			System.out.println("=================================================");
			System.out.print("선택 > ");
			int select = sc.nextInt();
			switch (select) {
			case 1: // 할일추가
				/*
				 * 사용자가 해야하는 내용을 입력하면 그 내용을 이용해서 Work 클래스를 새로 생성하고 변수 workList에 추가하는 기능
				 */
				System.out.print("할 힐 입력 > ");
				String toDo = sc.next();
				workList[current++] = new Work(toDo);
				break;
			case 2: // 할일확인
				for (int i = 0; i < current; i++) {
					if (workList[i].getCompletion()) continue;
					System.out.printf("할 일 [%d] %s\n", i+1, workList[i].getWorkContent());
				}
				break;
			case 3: // 할일완료
				System.out.print("완료할 일 선택 > ");
				int choice = sc.nextInt();
				workList[choice-1].complete();
				workList[choice-1].printWork();
				break;
			case 4: // 전체목록
				for (int i = 0; i < current; i++) {
					System.out.printf("[%d] ", i+1);
					workList[i].printWork();
				}
				break;
			case 5: // 종료
				isRun = false;
				break;
			default:
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}
		}
		sc.close();
	}
}
