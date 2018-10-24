package com.biz.be_06_01;

/*
 * 클래스 내부의 method 밖에 선언된 변수를
 * 클래스 전역변수라고 한다.
 * 
 * 이 변수는 "클래스 내의 method들"에서 어떤 방식으로든
 * 접근이 가능하다.
 * 
 * 이 방법은 쉬워보이나 
 * 매우 위험한 방법일 수 있다.
 * 
 * 전역변수를 예상치 못한 어떤 메서드에서
 * 
 * 변경하게 되면 
 * 예측하지 못한 결과가 나올 수 있다.
 * 그래서 꼭 필요한 상황에서만 사용한다.
 * 
 */

public class Be_06_03 {

	static int intNum1 = 0;
	static int intNum2 = 0;
	static int intSum = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		intNum1 = 30;
		intNum2 = 40;
		덧셈();
		System.out.println(intSum);
		
	}
	
	static void 덧셈() {
		intSum = intNum1 + intNum2 ;
		
	}

}
