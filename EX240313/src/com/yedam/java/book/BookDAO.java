package com.yedam.java.book;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	private List<Book> bookList;
	
	public BookDAO() {
		this.bookList = new ArrayList<>();
	}
	// 메소드
	// 등록
	public void addBoard(Book book) { // 밖에서 board 만들어 넘겨주는 방식
		bookList.add(book);
	}
	// 수정
	public void updateBoard(String bookNum, String bookIntro) {
		for (int i = 0; i < bookList.size(); i++) {
			Book thisBook = bookList.get(i);
			if (thisBook.getBookNum().equals(bookNum)) { // 문자열 비교엔 equals "=="은 안됨
				thisBook.setBookIntro(bookIntro);
			}
		}
	}
	
	// 조회
	// 1) 단건조회
	public Book getBook(String bookNum) {
		Book selected = null;
		for (Book b : bookList) {
			if (b.getBookNum().equals(bookNum)) {
				selected = b;
			}
		}
		return selected;
	}
	// 2) 전체조회
	public void printAllBook() {
		for (Book b : bookList) {
			System.out.println(b.getBookInfo());
		}
	}
	
	// 검색
	public void searchBook(String searchWord) {
		for (Book b : bookList) {
			if (b.getTitle().equals(searchWord)) 	System.out.println(b.getBookInfo());
			else if (b.getWriter().equals(searchWord)) 	System.out.println(b.getBookInfo());
		}
	}
	
	// 삭제
	public void delBook(String bookNum) {
		for (int i = 0; i < bookList.size(); i++) {
			Book thisBook = bookList.get(i);
			if (thisBook.getBookNum().equals(bookNum)) {
				bookList.remove(i);
			}
		}
	}
}
