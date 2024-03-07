package com.yedam.java.ch0602;

public class MainExample {

	public static void main(String[] args) {
//		String str = null;
		
		Car myCar = new Car("현대", "아이오닉5", "실버");
		myCar.color = "gray";
		
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.speed);
		System.out.println(myCar.record);
		
		Car yourCar = new Car("기아", "쏘렌토", "검정");
		System.out.println(yourCar.company);
		System.out.println(yourCar.model);
		System.out.println(yourCar.color);
		System.out.println(yourCar.maxSpeed);
		System.out.println(yourCar.speed);
		System.out.println(yourCar.record);
		
		// 필드가 배열일 경우
		yourCar.record = new String[5];
		yourCar.record[0] = "출고일자 : 2024-03-27";
		for (String rec : yourCar.record) { //향상된 for문
			System.out.println(rec);
		}
		int[][] intList = {{1,2,3}, {5,6,7}};
		System.out.println(intList[1][1]);
	}
}
