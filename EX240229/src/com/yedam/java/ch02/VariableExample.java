package com.yedam.java.ch02;

public class VariableExample {

	public static void main(String[] args) {
		// 정수
		byte var1 = 0b1000001; // -128 ~ 127
		short var2 = -32768; // -32768 ~ 32767
		int var3 = 0b1010;
		long var4 = 9000000000000000000L; // long은 숫자뒤에 L 붙이기
		System.out.println(var1 + " " + var2 + " " + var3 + " " + var4);
		
		// char ''
		char c1 = 'A'+1;
		char c2 = (char)(c1 * 99999);
		char c3 = '됌';
		System.out.println((int)c1 + " " + c2 + " " + (int)c3 + " " + (int)'a');
		
		// 문장(문자열) => String ""
		String s1 = "\"AB\"";
		String s2 = s1 + 1;
		System.out.println(s1 + " " + s2 + 13);
		
		// 실수
		float f1 = 0.12345678912345f;
		double d1 = 0.12345678912345;
		System.out.println(f1);
		System.out.println(d1);
		
		// true false
		boolean isSelected = false;
		if (isSelected) {
			System.out.println("선택한 값은 ...");
		} else {
			System.out.println("선택한 값이 존재하지 않습니다.");
		}

	}

}
