package com.yedam.java.assignment240312;

public class StandardWeightInfo extends Human{
	// 필드
	
	// 생성자
	StandardWeightInfo(String name, double height, double weight) {
		super(name, height, weight);
	}
	
	// 메소드
	@Override
	public void getInformation() {
		super.getInformation();
		System.out.printf(", 표준체중 %.1f 입니다.\n", this.getStandardWeight());
	}
	public double getStandardWeight() {
		return ((super.height - 100) * 0.9);
	}
}
