package com.yedam.java.exam;

public class Work {
	// 필드
	String content;		 // 해야하는 내용
	boolean isCompleted; // 완료여부
	
	// 생성자
	Work(String content){
		this.content = content;
	}
	
	// 메소드
	// 완료여부 수정
	void complete() {
		this.isCompleted = true;
	}
	
	// 현재 완료상태 확인
	boolean getCompletion() {
		return this.isCompleted;
	}
	
	// 현재 해야하는 내용 확인
	String getWorkContent() {
		return this.content;
	}
	
	// 해야하는 내용과 완료여부를 확인
	void printWork() {
		System.out.printf("%s, %s\n", this.content, (this.isCompleted ? "완료" : "미완료"));
	}
}
