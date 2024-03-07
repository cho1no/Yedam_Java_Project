package com.yedam.java.additional;

import java.util.Scanner;

public class AdditionalProblem {
	public static void main(String[] args) {
		boolean isRun = true;
		
		int diceRange = 0;
		int cnt = 0;
		int[] diceCount = null;
		
		Scanner sc = new Scanner(System.in);
		while(isRun) {
			System.out.println("===1.주사위크기 2.주사위 굴리기 3.결과 보기 4.가장 많이 나온 수 5. 종료 ===");
			System.out.println("메뉴 >");
						
			int select = sc.nextInt();
			switch(select) {
			case 1:
				System.out.println("주사위 크기 >");
				diceRange = sc.nextInt();
				while (diceRange < 5 || diceRange > 10) {
					System.out.println("주사위의 크기는 5~10입니다. 다시 입력해주세요");
					System.out.println("주사위 크기 >");
					diceRange = sc.nextInt();
				}
				diceCount = new int[diceRange];
				break;
			case 2:
				while(true && diceRange != 0) {
					cnt++;
					int dice = (int)(Math.random() * diceRange) + 1;
					diceCount[dice-1]++;
					if (dice == 5) break;
				}
				System.out.printf("5가 나올 때까지 주사위를 %d번 굴렸습니다.\n", cnt);
				break;
			case 3:
				if (diceCount == null) break;
				for (int i = 0; i < diceCount.length; i++) {
					System.out.printf("%d은 %d번 나왔습니다.\n", i+1, diceCount[i]);
				}
				break;
			case 4:
				int maxIdx = -1;
				int max = diceCount[0];
				for (int i = 0; i < diceCount.length; i++) {
					if (max < diceCount[i]) {
						max = diceCount[i];
						maxIdx = i;
					}
				}
				System.out.printf("가장 많이 나온 수는 %d입니다.\n", maxIdx+1);
				break;
			case 5:
				isRun = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}
