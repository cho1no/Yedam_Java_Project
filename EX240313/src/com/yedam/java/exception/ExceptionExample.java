package com.yedam.java.exception;

import java.util.ArrayList;
import java.util.List;

import com.yedam.java.object.Member;

public class ExceptionExample {
	public static void main(String[] args) {
		try {
			// 실행예외 (Runtime Exception)
			// 1) NullPointerException
			String str = null;
//			System.out.println(str.length()); // null 값에 객체 접근 연산자인 . 을 사용해서 예외 발생
			
			// 2) (Array)IndexOutOfBoundsException
			List<Integer> list = new ArrayList<>();
			list.add(100);
			list.add(200);
			for (int i = 0; i < list.size()+1; i++) { // index의 범위를 벗어나는 반복문 (i < list.size() + 1)이라 예외 발생
				System.out.println(list.get(i));
			}
		} catch (NullPointerException e) {
			System.out.println("해당 변수의 값을 확인해주세요. 아마 null일듯?");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("인덱스 범위를 확인해주세요.");
		} finally {
			System.out.println("[finally] 나는 항상 실행되지");
		}
		// 3) NumberFormatException
		String strA = "100";
		String strB = "a100";
		String strC = "10.1";
		int intA = Integer.parseInt(strA);
//		int intB = Integer.parseInt(strB); // a100은 문자 a로 인해 숫자로 변환 할 수 없어 예외 발생
//		int intC = Integer.parseInt(strC); // 10.1은 실수인데 int타입으로 parsing 해서 예외 발생
		Double dobC = Double.parseDouble(strC);
		
		// 4) ClassCastException
		try {
			Object obj = new Member("blue");
			Member member = (Member)obj; // <- obj는 type은 Object지만 Member 객체(아들느낌)로 생성됐기 때문에 괜찮음
//			Member newMem = (Member)(new Object()); // <- Object 생성은 Member의 아버지느낌이라 캐스팅괄호를이용한 타입변환 예외 발생
			System.out.println("정상 실행 시 출력");
		} catch (ClassCastException e) {
			e.printStackTrace(); // 보통 운영할 땐 안씀
			System.out.println("예외가 발생되었습니다.");
		} finally { // 필수는 아님
			System.out.println("[finally] 나는 항상 실행되지");
		}
	}
}
