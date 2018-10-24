package com.biz.be_06;

public class Be_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int와 Integer는 서로 데이터를 주고 받을 수 있다.
		Integer num1 = 0; // Integer 정수
		Integer num2 = 0;
		
		num1 = 30;
		num2 = 20;
		
		System.out.println(num1 + num2); // 50
		System.out.println(num1.toString()+num2.toString()); // 3020
		
		// Integer는 int의 클래스형(type)
		// 	int의 여러가지 기능을 확장, 추가하기 위해서
		// 	JDK에 포함된 정수형 클래스
		
		System.out.println(num1.toString());
		// >> 정수형 클래스(Integer class)에서 가장 많이 사용되는
		// 		method로 정수를 문자열 형태로 바꾸어 준다.
		
		num1 = 19293919 ; 
		// Integer형을 String 형으로 변경하고
		String strNum = num1.toString();
		
		// 문자열을 1자리씩 분해
		// >> substring()을 사용해서 분해
		int intSum = 0 ;
		for( int i = 0; i <strNum.length();i++) {
			
			// String.substring() 한자리씩 문자열 분해
			String s = strNum.substring(i, i+1);
			
			// 문자열을 숫자로 바꾼다.
			int intNum = Integer.valueOf(s); // s라는 변수에 담긴 "숫자형 문자열"을
											// 정수형으로 바꾸는 것
			intSum += intNum;
			
		}
		System.out.println(intSum);
		
	}

}
