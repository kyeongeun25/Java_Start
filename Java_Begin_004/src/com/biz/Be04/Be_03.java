package com.biz.Be04;

public class Be_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정수형 숫자 변수 2개를 선언
		
		// 가. 변수를 선언하면서 0을 채워서
		//    clear하는 방식을 '초기화'한다 라고 한다.
		// 나. 변수선언과 초기화를 동시에 하는 것을 
		//	  '변수생성 및 초기화'라고 한다.
		int intNum1 = 0; // 변수를 선언하면서 0을 할당하는 방법
		int intNum2 ; // 1. 선언만하고
		intNum2 = 20; // 2. 어떤 값을 할당
		
		//이제 이 두 개의 변수는 읽기를 실행해도 오류가 발생하지 않음
		System.out.println(intNum1 + intNum2);
		
		
	}

}
