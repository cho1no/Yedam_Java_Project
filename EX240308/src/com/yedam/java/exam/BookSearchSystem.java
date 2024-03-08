package com.yedam.java.exam;

import java.util.Scanner;

public class BookSearchSystem {
	/*
	 * == 도서 검색 시스템 : 클래스명 BookSearchSystem 메뉴 1.도서등록 | 2.도서검색 | 3.전체출력 | 5.종료
	 * 
	 * [메뉴1] 도서등록 한 도서 정보(제목, 작가, 메모)을 등록 => 클래스가 필요, 클래스명은 Book => 필드(제목, 작가, 메모)와
	 * 생성자만 등록할 수 있는 도서 수는 최대 10권 [메뉴2] 도서검색 사용자가 도서제목을 입력할 경우 해당 도서 정보(제목, 작가, 메모)를
	 * 출력 [메뉴3] 전체출력 현재 등록되어 있는 모든 도서들의 정보(제목, 작가, 메모)를 출력
	 * 
	 */
	public static void main(String[] args) {
		boolean isRun = true;

		String name = "";
		String author = "";
		String memo = "";

		int curr = 0;

		Book[] books = new Book[10];

		Scanner sc = new Scanner(System.in);

		while (isRun) {
			System.out.println("=======================================");
			System.out.println(" 1.도서등록 | 2.도서검색 | 3.전체출력 | 4.종료");
			System.out.println("=======================================");
			System.out.print("입력 > ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.print("도서명 입력 > ");
				name = sc.next();
				System.out.print("작가명 입력 > ");
				author = sc.next();
				System.out.print("메모 입력 > ");
				memo = sc.next();

				books[curr++] = new Book(name, author, memo);
				break;
			case 2:
				System.out.print("검색할 책 제목 입력 > ");
				name = sc.next();
				for (int i = 0; i < curr; i++) {
					if (name.equals(books[i].getTitle())) {
						books[i].printInfo();
					}
				}
				break;
			case 3:
				for (int i = 0; i < curr; i++) {
					books[i].printInfo();
				}
				break;
			case 4:
				isRun = false;
				break;

			}
		}
		sc.close();
	}
}
