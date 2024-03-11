package com.yedam.java.package3;

public class SingletonExample {
	public static void main(String[] args) {
		//Singleton one = new Singleton();
		Singleton one = Singleton.getInstance();
		
		Singleton tow = Singleton.getInstance();
		
		if (one == tow) {
			System.out.println("Y");
		} else {
			System.out.println("N");
		}
	}
}
