package com.yedam.java.ch04;

public class ConditionalExample {
	public static void main(String[] args) {
		// 1 ~ 10 사이의 모든 정수들의 합
		/* for */
		System.out.println("####### for #######");
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
		}
		System.out.println("for문 : " + sum);

		/* while */
		System.out.println("####### while #######");
		sum = 0;
		int i = 1;
		while (i < 11) {
			sum += i;
			i++;
		}
		System.out.println("while문 : " + sum);

		/* do ~ while => 조건만족하지 않아도 1번은 실행 됨 */
		System.out.println("####### do while #######");
		int index = 0;
		while (index < 0) {
			System.out.println("while 문, " + index); // 실행 안됨 (조건 충족 X)
		}
		do {
			System.out.println("do ~ while 문, " + index);
		} while (index < 0);

		/* break */
		System.out.println("####### break #######");
		for (int j = 0; j < 100; j += 2) {
			if (j >= 20)
				break;
			System.out.print(j + " :: ");
		}
		System.out.println();

		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.print(num + " ");
			if (num == 5)
				break;
		}
		System.out.println();
		
		System.out.println("####### 중첩 반목문 범용 전체 break #######"); 
		for (char upper = 'A'; upper <= 'Z'; upper++) { // 본인의 블록 안에서만 break 가능
			boolean isLowerG = false; // 어떤 언어든 사용할 수 있는 범용적인 방법
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + " :: " + lower);
				if (lower == 'g') {
					isLowerG = true; // 변수 값 넘겨서
					break;					
				}
			}
			System.out.println("1) 안쪽 반복문 종료");
			if (isLowerG) break; // 탈출
		}
		System.out.println("1) 바깥쪽 반복문 종료");
		
		System.out.println("####### 중첩 반목문 범용 라벨링 방식 break #######");
		outter: for (char upper = 'A'; upper <= 'Z'; upper++) { // java에서 사용가능한 라벨링 방식
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + " :: " + lower);
				if (lower == 'g') {
					break outter; // 불러서 탈출 가능
				}
			}
			System.out.println("2) 안쪽 반복문 종료");
		}
		System.out.println("2) 바깥쪽 반복문 종료");
		
		/* continue */
		System.out.println("####### continue #######");
		for (int k = 1; k <= 5; k++) {
			if (k % 2 == 0) continue;
			System.out.println(k + " :: 해당 값은 홀수 입니다.");
		}
		System.out.println("####### same with continue #######");
		for (int k = 1; k <= 5; k++) {
			if (k % 2 != 0) System.out.println(k + " :: 해당 값은 홀수 입니다.");
		}
		
	}
}
