package com.biz.be_06_01;

public class Be_06_02 {

	// 변수를 main(), 또는 덧셈() method 밖에서
	// 선언 할 수 있다.
	
	// 클래스 전역(전체구역)변수
	// 클래스 내부의 어떤 method에서도 접근하여
	// 읽기, 쓰기가 가능하고
	// 어떤 method에서 변경된 값은 
	// 또 어떤 method에서 확인 가능하다
	static int intNum = 0;
	static String strName = "홍길동";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// method 밖에서 선언된 변수에 접근 할 수 있다.
		System.out.println("main에서 : "+intNum);
		덧셈();
		System.out.println("main에서 덧셈호출 후 : "+intNum);
		이름();
		System.out.println("main에서 이름호출 후 : "+intNum);
		
	}

	public static void 덧셈() {
		intNum += 20;
	}
	
	// static이 없는 method
	public static void 이름() {
		
		// 클래스 전역변수와 같은 이름으로
		// method 내부에서 변수를 선언하면
		// 그 순간 클래스 전역변수는 감춰진다.
		// 그리고 method 내부의 변수는 method가 종료, 중단되면
		// 사라져 버린다.
		
		// >> method 지역변수다
		int intNum = 100;
		System.out.println("이름에서 : "+strName);
		
		// 단, 지역변수로 선언되지 않은 strName은 그대로 유지된다.
		
	}
	
}
