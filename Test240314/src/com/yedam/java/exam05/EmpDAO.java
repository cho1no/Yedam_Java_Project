package com.yedam.java.exam05;

import java.util.ArrayList;
import java.util.List;

public class EmpDAO {

	// 필드
	// 사원 목록
	private List<Employee> list = new ArrayList<>();
	
	// 생성자
	public EmpDAO() {}
	
	// 메소드
	public void addEmpInfo(Employee emp) { // 추가
		list.add(emp);
	}
	
	public void updateEmpSalary(int id, int salary) { // 수정
		for (Employee emp : list) {
			if (emp.getId() == id) {
				emp.setSalary(salary);
			}
		}
	}
	
	public void delEmpInfo(int id) { // 삭제
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				list.remove(i);
			}
		}
	}
	
	public void searchHireDate(String hireDate) { // 조회
//		System.out.println("사원번호\t이름\t입사일자");
		String text = "";
		for (Employee emp : list) {
			if (emp.getHireDate().equals(hireDate)) {
//				System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getHireDate());
				text += emp.getId() + " ";
				text += emp.getName() + " ";
				text += emp.getHireDate() + "\n";
			}
		}
		System.out.print(text);
	}
	
	public void printEmpAll() { // 출력
//		System.out.println("사원번호 이름 연락처 입사일 급여");
		String text = "";
		for (Employee emp : list) {
//			System.out.println(emp.printEmpInfo());
			text += emp.getId() + " ";
			text += emp.getName() + " ";
			text += emp.getPhone() + " ";
			text += emp.getHireDate() + " ";
			text += emp.getSalary() + "\n";
		}
		System.out.print(text);
	}
}
