package com.biz.b02;

public class Be_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 자료형, 변수형
		 * 		어떤 형태의 값을 저장 할 것인가?
		 */
		
		
		// 정수형
		int intNum = 0; // 숫자(정수, 실수)를 저장 할 변수는
						// 일단 0으로 초기화를 해주는 것이 좋다.
		
		// 실수형
		float flNum = 0.0f ; // 실수형은 끝에 f를 붙인다.
		boolean bo = true ; // true, false를 갖는 변수
		String strName = ""; //문자열을 저장하는 변수
		double doNum = 0;
		
		
		int intSum = 3+4; // 3+4의 덧셈 결과를  intSum에 할당
		String strSum = "3+4="; // 3+4 문자열을 strSum에 할당
		System.out.println(strSum + intSum);
		
		intSum = 10 + 10;
		intSum = 20 + 20;
		System.out.println(intSum);
		
		// 숫자형 덧셈 결과를 문자열형 변수에 저장할 수 없다.
		// strSum = 3+3;
		// strSum = 4+4;
		
		String strName1 = "홍";
		String strName2 = "길동";
		// 문자열의 + 연산은 문자열을 이어 붙이라는 뜻
		strName = strName1 + strName2;
		System.out.println(strName);
		
		String strNum = "3" + 3;
		System.out.println(strNum);
		strNum = 3 + "3";
		System.out.println(strNum);
		
		strNum = "결과:"+3+3;
		System.out.println(strNum);
		
		strNum = "결과:"+(3+3);
		System.out.println(strNum);
		
		strNum = "" + (3+3); // null 문자열을 붙여
							// 숫자형 변수를 문자열형으로 변환시킨다.
		System.out.println(strNum);
		
		// strNum = 3+3; 단순히 숫자는 문자열로 변환 안됨
		
	
	
		
	}

}
