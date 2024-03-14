package com.yedam.java.object;

import java.util.HashMap;
import java.util.Map;

public class ObjectExample {
	public static void main(String[] args) {
		Member m1 = new Member("blue");
		Member m2 = new Member("red");
		Member m3 = m1;
		
		if (m1 == m2) {
			System.out.println("m1과 m2는 같은 객체를 참조합니다.");
		} else {
			System.out.println("m1과 m2는 다른 객체를 참조합니다.");
		}
		if (m1.equals(m2)) {
			System.out.println("m1과 m2는 같은 객체를 참조합니다.");
		} else {
			System.out.println("m1과 m2는 다른 객체를 참조합니다.");
		}
		if (m1.equals(m3)) {
			System.out.println("m1과 m3는 같은 객체를 참조합니다.");
		} else {
			System.out.println("m1과 m3는 다른 객체를 참조합니다.");
		}
		
		Member mA = new Member("green");
		Member mB = new Member("green");
		if (mA.equals(mB)) { // Member의 equals는 Override한 id값 비교임.
			System.out.println("mA와 mB는 같은 객체를 참조합니다.");
		} else {
			System.out.println("mA와 mB는 다른 객체를 참조합니다.");
		}
		if (mA == mB) {
			System.out.println("mA와 mB는 같은 객체를 참조합니다.");
		} else {
			System.out.println("mA와 mB는 다른 객체를 참조합니다.");
		}
		
		Map<Member, Integer> map = new HashMap<>();
		map.put(mA, 85);
		Integer result = map.get(mB); // hashCode()를 Override해서 id 스트링의 HashCode를 반환 -> mA의 객체와 mB의 id가 같기 때문에 결과가 나옴 
		System.out.println("결과 : " + result);
		System.out.println(mA);
	}
}
