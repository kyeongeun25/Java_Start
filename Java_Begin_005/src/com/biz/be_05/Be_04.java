package com.biz.be_05;

public class Be_04 {

	/*
	 * 정수형 변수 num1, num2를 선언하고
	 * 각각 20과 30을 할당한 후
	 * sum() 메서드에 전달하고
	 * 
	 * 덧셈한 결과를 return 받아서 
	 * 콘솔에 표시하시오
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=20;
		int num2=30;
		
		System.out.println("덧셈결과 : "+sum(num1,num2));
	}
	
	public static int sum(int num1, int num2) {
		return num1+num2;
	}

}
