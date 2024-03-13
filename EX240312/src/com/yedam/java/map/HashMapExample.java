package com.yedam.java.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		// map<key, value>
		Map<String, Integer> map = new HashMap<>();
		
		// 값 추가
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); // 동일 키 일 경우 값 갱신
		
		System.out.println("총 Entry(키, 값) 수 : " + map.size());
		
		// 값 확인
		System.out.println("\t 홍길동 : " + map.get("홍길동"));
		
		// Iterator - Entry
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			//System.out.println(iterator.next());
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			
			System.out.printf("%s %d\n", key, value);
		}
		
		// 객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry(키, 값) 수 : " + map.size()); // 전체 사이즈 줄어듬
		
		// Iterator - Key
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			Integer value = map.get(key);
			System.out.printf("%s %d\n", key, value);
		}
		
	}
}
