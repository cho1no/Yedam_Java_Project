package com.yedam.java.ch0502;

public class ReferenceSubject {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();
		// 문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 60) {
				System.out.println("값이 60인 곳의 인덱스 : " + i);
				break;
			}
		}

		// 문제2. 주어진 배열 중에서 인덱스가 짝수인 값을 출력
		System.out.print("짝수인 인덱스의 값 : ");
		for (int i = 0; i < arr1.length; i++) {
			if (i % 2 == 0) System.out.print("[" + i +"] : "+arr1[i] + " ");
		}
		System.out.println();

		// 문제3. 주어진 배열 중에서 최대값과 최소값을 출력
		int min = arr1[0];
		int max = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			if (min > arr1[i]) min = arr1[i];
			if (max < arr1[i]) max = arr1[i];
		}
		System.out.printf("최대값 : %d, 최소값 : %d\n", max, min);
		
		// 추가문제. 내림차순정렬 큰->작
		System.out.print("0번째 >> ");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 버블정렬
		for (int i = 0; i < arr1.length-1; i++) {
			for (int j = 0; j < arr1.length-1-i; j++) {
				if (arr1[j] < arr1[j+1]) {
					int temp = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = temp;
				} 
			}
			
			System.out.print(i+1 + "번째 >> ");
			for (int k = 0; k < arr1.length; k++) {
				System.out.print(arr1[k] + " ");
			}
			System.out.println();
		}

		System.out.println("---------------------------");
		
		// 초기화
		arr1 = new int[]{ 10, 20, 30, 50, 3, 60, -3 };
		System.out.print("0번째 >> ");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 순차정렬
		for (int i = 0; i < arr1.length-1; i++) { // i : 배열의 현재 위치
			for (int j = i+1; j < arr1.length; j++) { // j : 탐색할 배열의 위치
				if (arr1[i] < arr1[j]) {
					int temp = arr1[j];
					arr1[j] = arr1[i];
					arr1[i] = temp;
				}
			}
			
			System.out.print(i+1 + "번째 >> ");
			for (int k = 0; k < arr1.length; k++) {
				System.out.print(arr1[k] + " ");
			}
			System.out.println();
		}
		
	}
}
