package com.biz.be_05;

public class Be_01 {

	/*
	 * 
	 * 2개의 정수형 숫자변수를 선언하고,
	 * 각각 10과 20의 숫자를 할당한 후
	 * 덧셈, 곱셈, 뺄셈, 나눗셈을 표시하는 
	 * 코드를 작성합니다.
	 *
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNum1 =20;
		int intNum2 =10;
		
		System.out.println(intNum1+"+"+intNum2+"="+(intNum1+intNum2));
		System.out.println(intNum1+"*"+intNum2+"="+(intNum1*intNum2));
		System.out.println(intNum1+"-"+intNum2+"="+(intNum1-intNum2));
		System.out.println(intNum1+"/"+intNum2+"="+(intNum1/intNum2));
		
		String strName1 = "+";
		if(strName1=="+") {
			System.out.println(intNum1+"+"+intNum2+"="+(intNum1+intNum2));
		}
		
		System.out.println("덧셈 : "+sum(intNum1, intNum2));
		
	}
	
	public static int sum(int num1, int num2) {
		return num1+num2;
	}

}
