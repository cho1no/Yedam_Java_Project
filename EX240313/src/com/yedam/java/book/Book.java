package com.yedam.java.book;

public class Book {
	// 필드
	private String title;
	private String bookNum;
	private String writer;
	private String published;
	private String bookIntro;
	
	// 생성자
	public Book() {}
	
	public Book(String bookNum, String title, String writer, String published, String bookIntro) {
		this.bookNum = bookNum;
		this.title = title;
		this.writer = writer;
		this.published = published;
		this.bookIntro = bookIntro;
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
	public String getBookIntro() {
		return bookIntro;
	}
	public void setBookIntro(String bookIntro) {
		this.bookIntro = bookIntro;
	}
	
	public String getBookInfo() {
		return "[" + this.bookNum + "] " + this.title + ", " + this.writer + ", " + this.published + ", " + this.bookIntro;
	}
}
