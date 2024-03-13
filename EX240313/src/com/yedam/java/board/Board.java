package com.yedam.java.board;


// VO(Value Object) => 자료를 저장하는 클래스
public class Board { // 게시글 하나
	// 필드 => private
	private String title;		// 제목
	private String writer;		// 작성자
	private String createDate;	// 작성일자
	private String content;		// 작성내용

	// 생성자 => 기본생성자, 초기화하는 생성자
	public Board(){}
	
	public Board(String title, String writer, String createDate, String content) {
		this.title = title;
		this.writer = writer;
		this.createDate = createDate;
		this.content = content;
	}
	
	// 메소드 => getter/setter
	// title get set
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	// writer get set
	public String getWriter() {
		return this.writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	// createDate get set
	public String getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	
	// content get set
	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	// print Info
	public String getBoardInfo() {
		return this.title + " " + this.writer + " " + this.createDate + " " + this.content;
	}
}
