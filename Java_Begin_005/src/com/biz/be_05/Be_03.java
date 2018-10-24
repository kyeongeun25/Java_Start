package com.biz.be_05;

public class Be_03 {

	/*
	 * 3개의 정수형 숫자 변수를 num1, num2, num3라고 선언하고
	 * 각각 10, 20, 30을 할당한 후
	 * 
	 * sum(num1, num2)
	 * sum(num1, num2, num3) 
	 * 메서드를 만들고 
	 * 메서드에서 각 값을 덧셈하여 콘솔에 표시하기
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		sum(num1,num2);
		sum(num1,num2,num3);
		

	}
	
	public static void sum(int num1, int num2) {
		System.out.println("두 수의 합 : "+(num1+num2));
	}
	public static void sum(int num1, int num2, int num3) {
		System.out.println("세 수의 합 : "+(num1+num2+num3));
	}
	

	
	
}
