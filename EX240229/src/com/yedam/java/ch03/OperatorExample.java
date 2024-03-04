package com.yedam.java.ch03;

import java.util.Scanner;

public class OperatorExample {

	public static void main(String[] args) {
		/* 부호 연산자 */
		int a = -100;
		int result1 = -a;
		int result2 = +a;
		System.out.println("res1 : " + result1);
		System.out.println("res2 : " + result2);
		
		byte b = -100;
		byte result3 = (byte)-b;
		System.out.println("res3 : " + result3);
		
		System.out.println("========================");
		/* 증감 연산자 */
		int x = 10;
		int y = 10;
		int z;
		x++;
		++x;
		System.out.println("x : " + x);
		
		y--;
		System.out.println("y : " + y);
		--y;
		System.out.println("y : " + y);
		
		System.out.println("========================");
		
		z = x++;
		System.out.printf("z : %d, x : %d \n", z, x);
		z = ++x;
		System.out.printf("z : %d, x : %d \n", z, x);

		System.out.println("========================");

		x = 5;
		y = 5;
		z = ++x + y--; // ++x -> +y = z -> y--  ==> x = 6, z = 11, y = 4
		System.out.printf("z : %d, x : %d, y : %d \n", z, x, y);
		
		System.out.println("========================");
		/* 산술 연산자 */
		int e = 10;
		int f = 3;
		int g;
		g = e / f; // 몫
		System.out.println("g : " + g);
		g = e % f; // 나머지
		System.out.println("g : " + g);
		
		System.out.println("========================");
		/* 비교, 논리 연산자*/
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 >>");
		String value = sc.nextLine();
		
		char charVal = value.charAt(0);
		// 대문자 : 유니코드 이용 65 <= val <= 90
		if (65 <= charVal && charVal <= 90) System.out.println("대문자입니다.");
		// 소문자 : 유니코드 이용 97 <= val <= 122
		if (97 <= charVal && charVal <= 122) System.out.println("소문자입니다.");
		// 숫자 0 ~ 9 : 유니코드 47 < val < 58
		if (47 < charVal && charVal < 58) System.out.println("숫자입니다.");
		
		sc.close();
		
		System.out.println("========================");
		/* 복합 대입 연산자*/
		int res = 10;
		res += 10;
		res *= 2;
		res /= 3;
		res %= 4;
		System.out.println("res : " + res);
		
		System.out.println("========================");
		/* 삼항 연산자 */
		String result = (res > 10) ? "A" : "B";
		System.out.println("result : " + result);
	}

}
