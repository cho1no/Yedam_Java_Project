package com.yedam.java.another;

import com.yedam.java.extend.ParentClass;

public class AnotherChildClass extends ParentClass{
	String home;
	
	public int getAge() {
		return this.age; // protect라서 다른 패키지에 있어도 사용 가능
	}
//	public String getJob() {
//		return this.job; // defualt라서 다른 패키지에 있을 때 사용 불가능
//	}
}
