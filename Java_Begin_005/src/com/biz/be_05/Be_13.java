package com.biz.be_05;

public class Be_13 {

	
	public static void main(String[] args) {
		안녕("이몽룡");
		안녕("이몽룡",16);
		
	}
	
	// 메서드에 포함된 매개변수도
	// 일반 변수처럼 다양한 자료형으로 선언 할 수 있다.
	public static void 안녕(String strName) {
		// 매개변수로 선언된 변수도 
		// 일반 변수처럼 값을 읽을 수 있다.
		
		System.out.println("나는 "+strName+"입니다.");
	}
	
	public static void 안녕(String strName, int intAge) {
		// 매개변수에 값을 쓰게 되 면?
		// 호출하는 곳에서 어떤 값을 전달해도 의미가 없어진다.
		
		strName = "홍길동";
		
		System.out.println("나는 "+strName+"입니다.");
	}

}
