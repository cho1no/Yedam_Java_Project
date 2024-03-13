package com.yedam.java.book;

public class Book {
	// 필드
	private String title;
	private String bookNum;
	private String writer;
	private String published;
	private String bookInfo;
	
	// 생성자
	public Book() {}
	
	public Book(String title, String bookNum, String writer, String published, String bookInfo) {
		this.title = title;
		this.bookNum = bookNum;
		this.writer = writer;
		this.published = published;
		this.bookInfo = bookInfo;
	}
	
	// 메소드
	// Getter Setter
	// title get set
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	// bookNum get set	
	public String getBookNum() {
		return bookNum;
	}
	public void setBookNum(String bookNum) {
		this.bookNum = bookNum;
	}
	// writer get set
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	// published get set
	public String getPublished() {
		return published;
	}
	public void setPublished(String published) {
		this.published = published;
	}
	// bookInfo get set
	public String getBookInfo() {
		return bookInfo;
	}
	public void setBookInfo(String bookInfo) {
		this.bookInfo = bookInfo;
	}
}
