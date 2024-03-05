package com.yedam.java.ch04;

import java.util.Scanner;

public class ConditionalSubject {
	public static void main(String[] args) {
		// 문제1) 두 개의 정수가 주어졌을 때 두 정수의 합이 자연수이면 'Natural Number'을 출력하도록 하세요.
		int a,b;
		a = 3;
		b = 5;
		if ((a+b) > 0) {
			System.out.println("Natural Number");
		}
		// 문제2) 두 개의 정수가 주어졌을 때 두 수의 대소관계에 따라 부등호( > or = or < )를 출력하도록 하세요.
		int x, y;
		x = 5;
		y = 3;
		if (x > y) {
			System.out.println("x > y");
		} else if (x == y) {
			System.out.println("x = y");
		} else {
			System.out.println("x < y");
		}
			
		/* 문제3) 체질량 지수인 BMI에 따라 비만도를 네가지 단계로 구분하여 결과값을 출력하도록 하세요.
		   BMI = 체중(kg) / ( 키(m) * 키(m) )
		   저체중(18.5미만), 정상(18.5 이상 25미만), 과체중(25이상 30미만), 비만(30이상) */
		double weight, height, bmi; //키는 m로 체중은 kg으로
		height = 1.73;
		weight = 69;
		bmi = weight / (height * height);
		if (bmi >= 30) {
			System.out.println("비만(30이상)");
		} else if (bmi >= 25) {
			System.out.println("과체중(25이상 30미만)");
		} else if (bmi > 18.5) {
			System.out.println("정상(18.5이상 25미만)");
		} else {
			System.out.println("저체중(18.5미만)");
		}
		
		/* 문제4) 선택한 단의 6번째 값을 출력하도록 하세요.
		   예를 들어, 2단일 경우 2 X 6 = 12 
		   단, 출력문에 변수를 사용하지 않는다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("입력한 숫자의 구구단 6번째 값이 출력됩니다.");
		System.out.print("2~9까지의 숫자 입력 >>");
		int num = sc.nextInt();
		switch (num) {
		case 2:
			System.out.println(2 * 6 + "입니다.");
			break;
		case 3:
			System.out.println(3 * 6 + "입니다.");
			break;
		case 4:
			System.out.println(4 * 6 + "입니다.");
			break;
		case 5:
			System.out.println(5 * 6 + "입니다.");
			break;
		case 6:
			System.out.println(6 * 6 + "입니다.");
			break;
		case 7:
			System.out.println(7 * 6 + "입니다.");
			break;
		case 8:
			System.out.println(8 * 6 + "입니다.");
			break;
		case 9:
			System.out.println(9 * 6 + "입니다.");
			break;
		default:
			System.out.println("2~9까지의 숫자를 적어주세요.");
		}
		sc.close();
	}
}
