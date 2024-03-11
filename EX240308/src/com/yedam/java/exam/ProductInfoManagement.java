package com.yedam.java.exam;

import java.util.Scanner;

public class ProductInfoManagement {
	/*
	 * 다음은 키보드로부터 상품 수와 해당 상품정보(상품명, 가격)을 입력받아 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 평균을
	 * 구하는 프로그램을 작성하세요. => 힌트, 클래스는 총 2개가 필요합니다. (Product, ProductInfoManagement)
	 * 
	 * - 메뉴는 다음과 같이 구성하세요. 1.상품수 | 2.상품정보입력 | 3.전체정보출력 | 4.분석 | 5.종료
	 * 
	 * [메뉴1] 상품수 - 해당 프로그램에서 입력받을 수 있는 상품이 최대 몇개인지를 입력받으세요. 
	 * [메뉴2] 상품정보입력 - 입력한 상품 수만큼 상품명과 해당 가격을 입력받으세요. 
	 * [메뉴3] 전체정보출력 - 입력한 제품 정보를 모두 출력하세요.
	 * - 출력 예시 
	 * 상품A : 8524원 
	 * 상품B : 6547원 
	 * 상품C : 6578원 
	 * [메뉴4] 분석 - 분석 기능은 최고가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다. 
	 * - 출력 예시 
	 * 최고 가격을 가지는 제품 > 상품A, 9874원 
	 * 해당 제품을 제외한 제품들의 가격을 다 더하면 1234원입니다. 
	 * [메뉴5] 종료 - 프로그램을 종료하며 "프로그램을 종료합니다." 메세지를 출력하세요.
	 */
	public static void main(String[] args) {
		boolean isRun = true;

		Product[] products = null;
		Scanner sc = new Scanner(System.in);

		while (isRun) {
			System.out.println("===================================================");
			System.out.println(" 1.상품수 | 2.상품정보입력 | 3.전체정보출력 | 4.분석 | 5.종료");
			System.out.println("===================================================");
			System.out.print("선택 > ");

			int select = Integer.parseInt(sc.nextLine());

			switch (select) {
			case 1:
				System.out.print("최대 상품 수 입력 > ");
				int n = Integer.parseInt(sc.nextLine());
				n = n < 0 ? 0 : n;
				products = new Product[n];
				break;
			case 2:
				for (int i = 0; i < products.length; i++) {
					System.out.printf("%d번째의 상품명 > ", i+1);
					String name = sc.nextLine();
					System.out.printf("%d번째의 가격 > ", i+1);
					int price = Integer.parseInt(sc.nextLine());
					products[i] = new Product(name, price);
				}
				break;
			case 3:
				for (int i = 0; i < products.length; i++) {
					System.out.printf("%s : %d원\n", products[i].getName(), products[i].getPrice());
				}
				break;
			case 4:
				// 최대 가격의 품목
				Product max = products[0];
				for (int i = 0; i < products.length; i++) {
					if (max.getPrice() < products[i].getPrice()) max = products[i];
				}
				//최대 가격의 품목"들" 제외하고 합 구하기
				double sum = 0;
				int cnt = 0;
				for (int i = 0; i < products.length; i++) {
					if (max.getPrice() != products[i].getPrice()) {
						cnt++;
						sum += products[i].getPrice();
					}
				}
				System.out.printf("최고 가격을 가지는 제품 > %s, %d원\n", max.getName(), max.getPrice());
				System.out.printf("해당 제품을 제외한 제품들의 가격을 다 더하면 %.0f원 평균은 %.2f입니다.\n", sum, sum/cnt); // 최대 항목인 값들 제외한 평균값
				break;
			case 5:
				isRun = false;
				break;
			default:
				System.out.println("메뉴에 없는 번호입니다.");
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
		sc.close();
	}
}
