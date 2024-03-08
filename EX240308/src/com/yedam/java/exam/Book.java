package com.yedam.java.exam;

public class Book {
	// 필드
	String title;
	String author;
	String memo;
	
	// 생성자
	Book(String title, String author, String memo){
		this.title = title;
		this.author = author;
		this.memo = memo;
	}
	
	// 메소드
	String getTitle() {return this.title;}
	
	void printInfo() {
		System.out.printf("제목: %s, 저자: %s, 메모: %s\n", this.title, this.author, this.memo);
	}
}
