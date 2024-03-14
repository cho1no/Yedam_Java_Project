package com.yedam.java.wrap;

import java.util.ArrayList;
import java.util.List;

public class WrapExample {
	public static void main(String[] args) {
		int i = 1000;
		
		// Boxing : 정통적인 포장
		Integer a = Integer.parseInt("1234");
		// unBoxing : 자동
		int j = a;
		// Boxing : 자동
		Integer b = j;
		
		List<Integer> list = new ArrayList<>();
		list.add(1000);
		list.add(1234); // 자동 Boxing
		int result = list.get(0); // 자동 unBoxing
		
		System.out.println(i);
		System.out.println(a);
		System.out.println(j);
		System.out.println(b);
		System.out.println(result);
	}
}
