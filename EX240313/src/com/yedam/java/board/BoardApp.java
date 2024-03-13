package com.yedam.java.board;

import java.util.Scanner;

public class BoardApp {
	public static void main(String[] args) {
		boolean isRun = true;
		Scanner sc = new Scanner(System.in);
		BoardDAO dao = new BoardDAO();

		while (isRun) {
			System.out.println("======================================");
			System.out.println(" 1.등록 | 2.목록 | 3.수정 | 4.삭제 | 5.종료");
			System.out.println("======================================");
			System.out.print("메뉴 선택 > ");
			int select = Integer.parseInt(sc.nextLine());

			if (select == 1) { // 등록
				System.out.println("==== 게시글 등록 ====");
				System.out.print("제목 > ");
				String title = sc.nextLine();
				System.out.print("글쓴이 > ");
				String writer = sc.nextLine();
				System.out.print("작성일 > ");
				String createDate = sc.nextLine();
				System.out.print("내용 > ");
				String content = sc.nextLine();

				Board b = new Board(title, writer, createDate, content);
				dao.addBoard(b);
				
			} else if (select == 2) { // 목록
				System.out.println("==== 익명 개시판 ====");
				dao.printAllBoard();
				
			} else if (select == 3) { // 수정
				System.out.println("==== 게시글 수정 ====");
				System.out.print("수정할 게시글 제목 > ");
				String title = sc.nextLine();
				
				Board b = dao.getBoard(title);
				System.out.println(b.getBoardInfo());
				
				System.out.print("수정할 내용 > ");
				String content = sc.nextLine();

				dao.updateBoard(title, content);
				
			} else if (select == 4) { // 삭제
				System.out.println("==== 게시글 삭제 ====");
				System.out.print("삭제할 게시글 제목 > ");
				String title = sc.nextLine();

				dao.delBoard(title);
				
			} else if (select == 5) { // 종료
				isRun = false;
			} else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}
