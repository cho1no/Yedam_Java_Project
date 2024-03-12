package com.yedam.java.exam05;

import java.util.Scanner;

public class MainExample {
	static int chargeSum(int[] list) {
		int sum = 0;
		for (int var : list) {
			sum += var;
		}
		return sum;
	}
	public static void main(String[] args) {
		boolean isRun = true; // 동작 여부
		int[] chargeList = new int[7]; // 가계부 생성
		
		Scanner sc = new Scanner(System.in);
		
		while (isRun) {
			System.out.println("====================================================================");
			System.out.println(" 1.가계부 초기화 | 2. 가계부 일괄입력 | 3. 가계부 확인 | 4.통계 | 5.분석 | 6.종료");
			System.out.println("====================================================================");
			
			System.out.print("메뉴 선택 > ");
			int select = sc.nextInt();
			
			switch (select) {
			case 1: // 가계부 초기화 (가계부 모든 값 0으로 초기화)
				for (int i = 0; i < chargeList.length; i++) {
					chargeList[i] = 0;
				}
				System.out.println("가계부를 초기화했습니다.");
				break;
			case 2: // 가계부 일괄입력
				System.out.println("각 날짜별로 지출한 금액을 입력해주세요.");
				for (int i = 0; i < chargeList.length; i++) {
					System.out.printf("chargeList[%d] > ", i);
					int money = sc.nextInt();
					while (money < 0) { // 음수 체크 => 양수 입력까지 반복
						System.out.println("[Error] 음수의 값을 입력할 수 없습니다. 다시 입력해주세요.");
						System.out.printf("chargeList[%d] > ", i);
						money = sc.nextInt();
					}
					chargeList[i] =  money;
				}
				break;
			case 3: // 가계부 확인
				for (int i = 0; i < chargeList.length; i++) { // 인덱스 필요해서 일반 for문
					System.out.printf("chargeList[%d] > %d\n", i, chargeList[i]);
				}
				break;
			case 4: // 통계
				int sum = chargeSum(chargeList);
				double avg = (double)sum/chargeList.length;
				System.out.printf("지출 총 합계는 %d원이며 평균적으로 %.2f원을 사용했습니다.\n", sum, avg); // 미리 구한 합계와 평균 가져와서 처리
				break;
			case 5: // 분석
				int cnt = 0;
				int max = chargeList[0];
				sum = chargeSum(chargeList);
				avg = (double)sum/chargeList.length;
				for (int val : chargeList) { // 인덱스 필요 없어서 향상된 for문 사용
					if (val > avg) cnt++; // 평균 초과시 cnt 증가
					if (max < val) max = val; // 최대값 찾기
				}
				System.out.printf("평균 지출액은 %.2f이며 평균보다 많이 지출한 날짜는 %d입니다.\n", avg, cnt);
				System.out.printf("그 중 가장 많이 지출한 금액은 %d원입니다.\n", max);				
				break;
			case 6: // 종료
				isRun = false;
				break;
			default: // 다른 숫자 입력 시
				System.out.println("[Error] 메뉴에 있는 항목의 숫자를 입력해주세요.");
			}
		}
		System.out.println("프로그램을 종료하겠습니다.");
		sc.close();
	}
	
}
