package com.yedam.java.ch0603;

public class VendingMachine {
	// 필드
	String[] list;
	
	// 생성자
	VendingMachine(){
		list = new String[] {"콜라", "생수", "환타", "탄산수"};
	}
	
	// 메소드
	String getBeverage(int menu) {
		String selecedProduct = list[menu-1];
		return selecedProduct;
	}
}
