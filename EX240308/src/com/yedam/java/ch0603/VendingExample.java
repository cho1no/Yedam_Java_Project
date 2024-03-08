package com.yedam.java.ch0603;

import java.util.Scanner;

public class VendingExample {
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 > ");
		int menu = sc.nextInt();
		
		System.out.println(vm.getBeverage(menu));
		sc.close();
	}
}
