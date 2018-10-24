package com.biz.be03;

public class Be_08 {

	// main method는 Be_08 클래스에서 최초로 호출, 실행되는 곳
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 두 개의 정수형 변수를 만들어서 
		// 덧셈, 뺄셈, 곱셈을 하는 코드를 작성
		int intNum1 = 20;
		int intNum2 = 30;
		
		// method를 만드는 이유
		// 복잡한 코드를 여러 번 재사용하기 위해서
		sum(30, 40);
		sum(intNum1, intNum2);
		sum(20,50,90);
		sum(30.0f, 40.0f);
		
	}
	//method 생성, 사용법
	public static void sum(int num1, int num2) {
		System.out.println("두 수의 합 : "+(num1+num2));
	}
	
	//public static void sum(int n1, int n2) {
	//	System.out.println("두 수의 합 : "+(n1+n2));
	//}
	
	public static void sum(float num1, float num2) {
		System.out.println("두 실수의 합 : "+(num1+num2));
	}
	
	public static void sum(int num1, int num2, int num3) {
		System.out.println("세 수의 합 : "+ ( num1+num2+num3));
	}
	

}
