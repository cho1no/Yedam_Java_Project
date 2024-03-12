package com.yedam.java.assignment240312;

public class CultureExample {
	public static void main(String[] args) {
		Movie mv = new Movie("추격자", 7, 5, 3, 12, "");
		mv.getInformation();
		
		System.out.println("=====================");
		
		Performance pf = new Performance("지킬앤하이드", 9, 10, 9, 46, "");
		pf.getInformation();
	}
}
