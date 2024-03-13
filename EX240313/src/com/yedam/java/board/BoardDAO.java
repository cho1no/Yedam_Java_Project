package com.yedam.java.board;

import java.util.ArrayList;
import java.util.List;

// DAO(Data Access Object) => 자료에 접근하는 클래스
public class BoardDAO {
	// 필드 => DB 안했으니까 실제 자료를 저장하는 변수 만들거임.
	private List<Board> boardList;
	
	// 생성자 => 초기화하는 생성자(기본생성자 매개변수X)
	public BoardDAO() {
		// 필드에서 초기화 해도 되지만 불필요한 메모리를 줄이기위해
		// 객체가 생성 되었을 때 초기화해줌
		this.boardList = new ArrayList<>(); 
	}
	
	// 메소드
	// 등록 => 게시글 등록
	public void addBoard(String title, String writer, String createDate, String content) {
		Board board = new Board(title, writer, createDate, content);
		boardList.add(board);
	}
	public void addBoard(Board board) { // 밖에서 board 만들어 넘겨주는 방식
		boardList.add(board);
	}
	
	// 수정 => title을 기준으로 content만 수정
	public void updateBoard(String title, String content) {
		for (int i = 0; i < boardList.size(); i++) {
			Board thisBoard = boardList.get(i);
			if (thisBoard.getTitle().equals(title)) { // 문자열 비교엔 equals "=="은 안됨
				thisBoard.setContent(content);
			}
		}
	}
	
	// 삭제 
	public void delBoard(String title) {
		for (int i = 0; i < boardList.size(); i++) {
			Board thisBoard = boardList.get(i);
			if (thisBoard.getTitle().equals(title)) {
				boardList.remove(i);
			}
		}
	}
	
	// 조회
	// 1) 단건조회
	public Board getBoard(String title) {
		Board selected = null;
		for (Board b : boardList) {
			if (b.getTitle().equals(title)) {
				selected = b;
			}
		}
		return selected;
	}
	
	// 2) 전체조회
	public void printAllBoard() {
		for (Board b : boardList) {
			System.out.println(b.getBoardInfo());
		}
	}
}
