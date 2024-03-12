package com.yedam.java.ch0703;

public class SmartPhone extends Phone{
	// 생성자
	public SmartPhone(String owner){
		super(owner);
	}
	
	// 메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
	// 추상메소드
	@Override
	public void execute() {
		System.out.println("소유주 : " + this.owner);
		System.out.println("어플을 실행합니다.");
	}
}
