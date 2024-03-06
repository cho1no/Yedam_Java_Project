package com.yedam.java.ch0502;

import java.util.Scanner;

public class Assignment240306 {
	public static void main(String[] args) {
		boolean isRun = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);

		while (isRun) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생 수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");

			int menu = sc.nextInt();
			if (menu == 1) { // 학생 수 보기
				System.out.print("학생수> ");
				studentNum = sc.nextInt();
				while (studentNum <= 0) {
					System.out.println("[Error] 학생 수는 0보다 커야합니다.");
					System.out.print("학생수> ");
					studentNum = sc.nextInt();
				}
				scores = new int[studentNum];
			} else if (menu == 2) { // 점수 입력
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]> ", i);
					int score = sc.nextInt();
					while (score > 100 || score < 0) { // 점수 0 ~ 100 범위 벗어날 시 다시 받기
						System.out.println("[Error] 점수는 0~100 사이의 정수로 입력해주세요.");
						System.out.printf("scores[%d]> ", i);
						score = sc.nextInt();
					}
					scores[i] = score;
				}
			} else if (menu == 3) { // 점수 리스트
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]> %d\n", i, scores[i]);
				}
			} else if (menu == 4) { // 분석 최고점, 평균
				int max = scores[0];
				double avg = 0;
				for (int score : scores) { // index가 필요 없으니 향상된 for문 사용
					if (max < score) max = score;
					avg += score;
				}
				avg /= scores.length;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			} else if (menu == 5) { // 종료
				isRun = false;
			} else {
				System.out.println("메뉴에 없는 입력입니다.");
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}
