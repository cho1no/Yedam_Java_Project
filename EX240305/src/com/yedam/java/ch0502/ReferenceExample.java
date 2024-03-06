package com.yedam.java.ch0502;

public class ReferenceExample {

	public static void main(String[] args) {

		int[] intAry = { 11, 42, 53, 41, 75, 61 };
		double[] doubleAry;
		doubleAry = new double[] { 25.3, 6.2 };
		String[] strAry = new String[3];

		for (int i = 0; i < intAry.length; i++) {
			System.out.print(i + " : " + intAry[i] + " | ");
		}
		System.out.println();

		for (int i = 0; i < doubleAry.length; i++) {
			System.out.print(i + " : " + doubleAry[i] + " | ");
		}
		System.out.println();
		
		for (int i = 0; i < strAry.length; i++) {
			strAry[i] = "A" + i;
			System.out.print(i + " : " + strAry[i] + ", " + strAry[i].getClass().getSimpleName() + " | ");
		}
		System.out.println();

		// int[][] intMulAry = { { 2, 3 }, { 1, 2, 3, 4 }, { 6, 7, 0 } };
		int[][] intMulAry = new int[3][3];
		for (int i = 0; i < intMulAry.length; i++) {
			for (int j = 0; j < intMulAry[i].length; j++) {
				intMulAry[i][j] = i+j;
				System.out.printf("[%d][%d] : %d ", i, j, intMulAry[i][j]);
			}
			System.out.println();
		}
		
		// 배열 복사
		String[] oldStrAry = { "java", "array", "copy" };
		String[] newStrAry = new String[5];
		
		System.out.print("oldStrAry : ");
		for (int i = 0; i < oldStrAry.length; i++) {
			System.out.print("[" + oldStrAry[i] + "] ");
		}
		System.out.println();

		// System.arraycopy(원본, 원본의 몇번째 인덱스 부터, 새로운 배열, 새로운 배열의 몇번째 인덱스에, 몇개 복사)
		System.arraycopy(oldStrAry, 0, newStrAry, 0, oldStrAry.length);
		System.out.print("newStrAry : ");
		for (int i = 0; i < newStrAry.length; i++) {
			System.out.print("[" + newStrAry[i] + "] ");
		}
		System.out.println();
		oldStrAry[0] = "asdf";
		System.out.printf("oldStrAry : %s, newStrAry : %s\n", oldStrAry[0], newStrAry[0]);
		
		// 참조 타입 배열 복사
		int[][] intList = new int[][] {{1,2,3}, {5,6,7}};
		int[][] newList = new int[2][3];
		
		// 1. 얕은 복사 : 주소값 복사
//		for (int i = 0; i < intList.length; i++) {
//			newList[i] = intList[i];
//		}
//		System.out.printf("intList : %d, newList : %d\n", intList[1][0], newList[1][0]);
//		newList[1][0] = 10; // 복사된 newList의 값만 바꾸었지만 같은 위치의 intList의 값도 바뀜
//		System.out.printf("intList : %d, newList : %d\n", intList[1][0], newList[1][0]);
		
		// 2. 깊은 복사 : 실제 값을 복사
		for (int i = 0; i < intList.length; i++) {
			for (int j = 0; j < intList[i].length; j++) {
				newList[i][j] = intList[i][j];
			}
		}
		System.out.printf("intList : %d, newList : %d\n", intList[1][0], newList[1][0]);
		newList[1][0] = 30; // 복사된 newList의 값만 바뀜
		System.out.printf("intList : %d, newList : %d\n", intList[1][0], newList[1][0]);
		
		// 향상된 for 문
		int[] arr = { 1, 2, 5, 7, 8 };
		// python : for i in arr:
		// Js : for (let e of arr){}
		for (int i : arr) { // 위 주석과 같음
			System.out.print(i + " ");
		}
		System.out.println();
		
	}
}
