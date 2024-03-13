package com.yedam.java.book;

import java.util.Scanner;


public class BookApp {
	public static void main(String[] args) {
		boolean isRun = true;
		Scanner sc = new Scanner(System.in);
		BookDAO dao = new BookDAO();

		while (isRun) {
			System.out.println("======================");
			System.out.println(" 1.등록 | 2.목록 | 3.수정");
			System.out.println(" 4.검색 | 5.삭제 | 6.종료");
			System.out.println("======================");
			System.out.print("메뉴 선택 > ");
			int select = Integer.parseInt(sc.nextLine());

			if (select == 1) { // 등록
				System.out.println("==== 게시글 등록 ====");
				System.out.print("도서번호 ex) BN00 > ");
				String bookNum = sc.nextLine();
				System.out.print("도서제목 > ");
				String title = sc.nextLine();
				System.out.print("도서저자 > ");
				String writer = sc.nextLine();
				System.out.print("출판일자 > ");
				String published = sc.nextLine();
				System.out.print("도서소개 > ");
				String bookIntro = sc.nextLine();

				Book b = new Book(bookNum, title, writer, published, bookIntro);
				dao.addBoard(b);
				
			} else if (select == 2) { // 목록
				System.out.println("==== 도서 목록 ====");
				dao.printAllBook();
				
			} else if (select == 3) { // 수정
				System.out.println("==== 도서 수정 ====");
				System.out.print("수정할 도서 번호 > ");
				String bookNum = sc.nextLine();
				
				Book b = dao.getBook(bookNum);
				System.out.println(b.getBookInfo());
				
				System.out.print("도서소개 수정 > ");
				String bookIntro = sc.nextLine();

				dao.updateBoard(bookNum, bookIntro);
				
			} else if (select == 4) { // 검색 (검색어가 정확히 일치하는 제목과 도서소개 뽑기)
				System.out.println("==== 도서 검색 ====");
				System.out.print("검색어 > ");
				String searchWord = sc.nextLine();
				dao.searchBook(searchWord);
				
			} else if (select == 5) { // 삭제
				System.out.println("==== 도서 삭제 ====");
				System.out.print("삭제할 도서 번호 > ");
				String bookNum = sc.nextLine();

				dao.delBook(bookNum);
			} else if (select == 6) { // 종료
				isRun = false;
			} else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}
