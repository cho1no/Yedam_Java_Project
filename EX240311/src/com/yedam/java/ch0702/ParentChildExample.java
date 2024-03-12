package com.yedam.java.ch0702;

public class ParentChildExample {
	public static void main(String[] args) {
		/*
		 * 자동타입변환 : 자식 -> 부모 부모의 속성을 가지지만 오버라이딩된 메소드는 자식의 것을 사용
		 * 즉 Child c = new Child();일 경우 부모 포함 사용 가능 메소드가 3가지이지만,
		 * Parent p = new Child(); 일 경우 부모의 메소드만 사용하며 오버라이딩 된 경우 그것을 사용
		 * 
		 * 결론 : 데이터 타입인 부모 클래스를 기준으로 사용할 수 있는지 없는지 판단
		 * 메소드 오버라이딩 -> 자식의 메소드를 사용
		 */
		Parent parent = new Child();
		parent.method1();
		parent.method2();
		// parent.method3(); // 호출불가능

		/*
		 * 강제타입변환 : 부모 -> 자식, 에러가날 확률이 높음 부모만 가지고는 자식과의 관계를 파악하기가 힘듬
		 * 전제조건 : 자동타입변환이 먼저 실행된 대상만 가능
		 * 항상 instanceof를 사용하길 권장함
		 */
		if (parent instanceof Child) { // 변수가 Child 클래스의 인스턴스가 맞는지 확인
			Child child = (Child) parent;
			child.method1();
			child.method2();
			child.method3();
		}
		if (parent instanceof Second) { // 변수가 Second 클래스의 인스턴스가 맞는지 확인
			Second second = (Second) parent;
			second.method1();
			second.method2();
			second.method4();
		}
	}
}
