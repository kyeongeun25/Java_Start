package com.biz.b02;

public class Be_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 두개의 변수 선언
		int num1 = 0;
		int num2 = 0;
		
		// 변수에 각각 값을 할당
		num1 = 20;
		num2 = 30;
		
		// 각 변수에 10을 추가
		num1 = num1 + 10;
		num2 = num2 + 10;
		
		// 두 변수의 값을 더하여 sum 변수에 할당
		int sum = num1 + num2;
		
		System.out.println(sum);
		
		// 이미 연산이 끝난 sum 변수는 
		// num1과 num2 값이 변하여도
		// 변경되지 않는다.
		num1 = 0;
		num2 = 0;
		
		
		
	}

}
