package com.biz.be03;

public class Be_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// sum method를 호출 할 때 
		// 직접 숫자값 2개를 넘기고
		// 결과를 기다리는 방법
		for(int i=1; i<=100; i++) {
			sum(10, 20);
		}
		
		
		// num1의 변수 주소와
		// i의 변수 주소를 넘기고
		// 그 주소에 있는 값을 가져가서
		// 덧셈을 처리하는 방법
		int num1 = 0;
		for(int i = 1; i<=100; i++) {
			num1++; //num1을 1씩 증가시켜라
			sum(num1,i);
		}
		
	}

	public static void sum(int num1, int num2) {
		System.out.println("두 수의 합 : "+(num1 + num2));
	}
}
