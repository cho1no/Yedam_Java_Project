package com.yedam.java.board;

// VO(Value Object) => 자료를 저장하는 클래스
public class Board { //게시글 하나
	// 필드  => private
	private String title;		//제목
	private String writer;		//작성자
	private String createDate;	//작성일자
	private String content;		//작성내용
	
	// 생성자 => 기본생성자, 초기화하는 생성자
	public Board(){}
	
	public Board(String title, String writer, 
					String createDate, String content) {
		this.title = title;
		this.writer = writer;
		this.createDate = createDate;
		this.content = content;
	}
	
	// 메소드 => getter(read)/setter(대입)
	// title
	// getter(필드 -> 외부)
	// 1)매개변수가 없음 2)return 필수
	public String getTitle() {
		return this.title;
	}
	// setter(매개변수 -> 필드)
	// 1)매개변수가 반드시 있음 2)return 불가
	public void setTitle(String title) {
		this.title = title;
	}
	// writer
	public String getWriter() {
		return this.writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getBoardInfo() {
		return title + " " + writer + " " + createDate + " " + content;
	}
}
