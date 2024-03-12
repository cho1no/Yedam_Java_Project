package com.yedam.java.assignment240312;

public class HumanExample {
	public static void main(String[] args) {
		StandardWeightInfo hong = new StandardWeightInfo("홍길동", 168, 45);
		hong.getInformation();
		
		ObesityInfo park = new ObesityInfo("박둘이", 168, 90);
		park.getInformation();
	}
}
