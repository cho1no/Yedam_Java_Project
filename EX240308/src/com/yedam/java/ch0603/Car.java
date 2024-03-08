package com.yedam.java.ch0603;

public class Car {
	// 필드
	private String company;
	String model;
	String color;
	int maxSpeed;
	int speed;

	String[] record;

	// 생성자
	
	// 오버로딩
	Car(){
//		this.company = "현대자동차";
//		this.model = "그랜저";
//		this.color = "검정";
		this("현대자동차", "그랜저", "검정");
		this.maxSpeed = 300;
	}
	Car(String company) {
//		this.company = company;
//		this.model = "그랜저";
//		this.color = "검정";
		this(company, "그랜저", "검정");
		this.maxSpeed = 300;
	}
	Car(String company, String model) {
//		this.company = company;
//		this.model = model;
//		this.color = "검정";
		this(company, model, "검정"); // 위 주석과 같은 효과
		this.maxSpeed = 300;
	}
	Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = 300;
	}
	
	public String getCompany() { return company; }
}
