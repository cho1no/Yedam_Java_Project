package com.yedam.java.assignment240312;

public class ObesityInfo extends StandardWeightInfo{
	// 필드
	
	// 생성자
	ObesityInfo(String name, double height, double weight) {
		super(name, height, weight);
	}
	
	// 메소드
	@Override
	public void getInformation() {
		double standWeight = this.getStandardWeight();
		String text = "";
		if (standWeight >= 25) {
			text = "비만";
		} else if (standWeight >= 23) {
			text = "과체중";
		} else if (standWeight >= 18.5) {
			text = "정상";
		} else {
			text = "저체중";
		}
		System.out.printf("%s님의 신장 %.0f, 몸무게 %.0f, %s입니다.\n", super.name, super.height, super.weight, text);
	}
	
	public double getObesity() {
		return (super.weight - super.getStandardWeight())/super.getStandardWeight() * 100;
	}
}
