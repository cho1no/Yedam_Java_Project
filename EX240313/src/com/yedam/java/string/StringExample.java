package com.yedam.java.string;

public class StringExample {
	public static void main(String[] args) {
		// charAt(idx) : 문자추출
		String ssn = "020568-1765432";
		char gender = ssn.charAt(7);
		switch (gender) {
		case '3':
		case '1':
			System.out.println("남자입니다.");
			break;
		case '4':
		case '2':
			System.out.println("여자입니다.");
		}
		// indexOf(str) : 문장 안에 원하는 값이 있는지 없는지
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		if (subject.indexOf("자바") > -1) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련된 책이 아니군요");
		}
		
		// substring(), length()
		String search = subject.substring(location, subject.length());
		System.out.println(search);
		String birthday = ssn.substring(0,6);
		System.out.println(birthday);
		
		String valA = "Hello, World";
		String valB = "HELLO, WORLD";
		
		if (valA.toUpperCase().equals(valB.toUpperCase())) {
			System.out.println("같은 글자입니다.");
		} else {
			System.out.println("다른 글자입니다.");
		}
		
	}
}
