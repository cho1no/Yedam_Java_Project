package com.yedam.java.ch0501;

public class ReferenceExample {
	public static void main(String[] args) {
		String strVal1 = "신미철";
		String strVal2 = "신미철";
		
		System.out.println("strVal1과 strVal2의 결과 : " + (strVal1 == strVal2));

		String strVal3 = new String("신미철");
		String strVal4 = new String("신미철");

		System.out.println("strVal3과 strVal4의 결과 : " + (strVal3 == strVal4));
		System.out.println("strVal1과 strVal3의 결과 : " + (strVal1 == strVal3));
		
		System.out.println("strVal1과 strVal2의 결과 == " + (strVal1 == strVal2));
		System.out.println("strVal1과 strVal2의 결과 equals " + (strVal1.equals(strVal2)));
		
		System.out.println("equals\t\t :: " + strVal3.equals(strVal4));
		System.out.println("equalsIgnoreCase :: " + strVal3.equalsIgnoreCase(strVal4)); // 대소문자 상관없이 비교하는 equal문
		
		int[] arr = {1,2,3,4};
		System.out.println(arr[0]);
	}
}
