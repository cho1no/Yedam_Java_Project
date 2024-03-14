package com.yedam.java.exam05;

import java.util.Scanner;

public class EmpApp {
	public static void main(String[] args) {
		boolean isRun = true;
		EmpDAO dao = new EmpDAO();

		Scanner sc = new Scanner(System.in);

		while (isRun) {
			System.out.println("==============================================================");
			System.out.println(" 1.등록 | 2.목록 | 3.수정(급여) | 4.삭제 | 5.조회(조건:입사일자) | 6.종료");
			System.out.println("==============================================================");
			System.out.print("메뉴 > ");
			int menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) { // 등록
				System.out.println("==== 등록할 사원정보를 입력하세요. ====");
				System.out.print("사원번호 > ");
				int id = Integer.parseInt(sc.nextLine());
				System.out.print("이름 > ");
				String name = sc.nextLine();
				System.out.print("연락처 > ");
				String phone = sc.nextLine();
				System.out.print("입사일 > ");
				String hireDate = sc.nextLine();
				System.out.print("급여 > ");
				int salary = Integer.parseInt(sc.nextLine());

				Employee emp = new Employee(id, name, phone, hireDate, salary);
				dao.addEmpInfo(emp);
			} else if (menu == 2) { // 목록
				System.out.println("==== 사원 전체 목록 ====");
				System.out.println("사원번호 이름 연락처 입사일 급여");
				dao.printEmpAll();
			} else if (menu == 3) { // 수정(급여)
				System.out.println("==== 수정할 사원정보를 입력하세요. ====");
				System.out.print("사원번호 > ");
				int id = Integer.parseInt(sc.nextLine());
				System.out.print("급여 > ");
				int salary = Integer.parseInt(sc.nextLine());
				
				dao.updateEmpSalary(id, salary);
			} else if (menu == 4) { // 삭제
				System.out.println("==== 삭제할 사원정보를 입력하세요. ====");
				System.out.print("사원번호 > ");
				int id = Integer.parseInt(sc.nextLine());
				
				dao.delEmpInfo(id);
			} else if (menu == 5) { // 조회(조건:입사일자)
				System.out.println("==== 조회할 사원정보를 입력하세요. ====");
				System.out.print("입사일 > ");
				String hireDate = sc.nextLine();
				System.out.println("사원번호\t이름\t입사일자");
				dao.searchHireDate(hireDate);
			} else if (menu == 6) { // 종료
				isRun = false;
			} else {
				System.out.println("없는 메뉴입니다.");
			}
		}
		System.out.println("프로그램을 종료했습니다.");
		sc.close();
	}
}
