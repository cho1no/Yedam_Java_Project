package com.yedam.java.object;

public class Member {
	// 필드
	public String id;
	public String name;
	public int age;
	
	// 생성자
	public Member(String id) {
		this.id = id;
	}
	public Member(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	// 메소드
	@Override
	public boolean equals(Object obj) {
		Member mem = null;
		// 필드 id값이 같다면 같은 객체로 인식
		if(obj instanceof Member) { // 객체를 강제 변환 할경우 instanceof로 비교를 먼저 하자
			mem = (Member)obj;
		}
		return id.equals(mem.id);
		
//		if(obj instanceof Member) { // 객체를 강제 변환 할경우 instanceof로 비교를 먼저 하자
//			Member mem = (Member)obj;
//			if (mem.id.equals(this.id)) {
//				return true;
//			}
//		}
//		return false;
	}
	
	@Override
	public int hashCode() {
		return this.id.hashCode();
	}
	
	@Override
	public String toString() {
//		return super.toString();
		return "Member : id, " + id;
	}
}
