package com.yedam.java.exam;

public class Product {
	// 필드
	private String name;
	private int price;

	// 생성자
	Product(String name, int price) {
		this.name = name;
		this.price = price < 0 ? 0 : price;
	}
	
	//메소드
	// Name
	public void setName(String name) { // setter
		this.name = name;
	}
	public String getName() { // getter
		return this.name;
	}
	
	// Price
	public void setPrice(int price) { // setter
		this.price =  price < 0 ? 0 : price;
	}
	public int getPrice() { // getter
		return this.price;
	}
}
