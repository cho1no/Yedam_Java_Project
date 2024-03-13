package com.yedam.java.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		String[] strList = new String[10];
		List<String> list = new ArrayList<String>(); // ArrayList<>()로도 사용 가능함 -> 추측해서 타입을 받기 때문 -> 정석은 써주는것이 맞다

		System.out.println("strList : " + strList.length); // 필드값 기반으로 가져와서 ()가 없음
		System.out.println("크기 : " + list.size());

		// 값을 추가할 때 사용 add(value) or add(index, value)
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP"); // Java, JDBC, Servlet/JSP
		list.add(2, "Database");
		list.add("iBATIS"); // Java, JDBC, Database, Servlet/JSP, IBATIS

		// 현재 크기를 가져올 때 size()
		System.out.println("크기 : " + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println("index[" + i + "] : " + list.get(i));
		}

		// 값을 제거할 떄 사용 remove(index)
		list.remove(2);
		list.remove(2);
		
		// 향상된 for문 사용 가능 - 배열, List, Set 만 가능 (Iterable을 가졌기 때문)
		for (String s : list) {
			System.out.println(s);
		}

	}
}
