package com.yedam.java.assignment240312;

public class EmpDept extends Employee{
	// 필드
	private String deptName;
	
	// 생성자
	EmpDept(String name, int salary, String deptName){
		super(name, salary);
		this.deptName = deptName;
	}
	
	// 메소드
	// getter
	public String getDeptName() {
		return this.deptName;
	}
	
	@Override
	public void getInformation() {
		System.out.printf("이름:%s 연봉:%d 부서:%s\n", super.getName(), super.getSalary(), this.getDeptName());
	}
	
	@Override
	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
	}
}
