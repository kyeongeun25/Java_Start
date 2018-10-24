package com.biz.b02;

public class Be_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수만들기
		// 1. 선언자 keyword
		// 2. 변수이름
		// 3. 초기화 값
		
		// 선언자
			// 변수이름
				// 초기화 값
		int num = 10; // 정수만을 4Byte 공간에 저장하겠다.
		float num1 = 20.0f ; // 실수를 저장하겠다.
		
		int num2 = 20; //한번 선언문에서 사용된
						// 변수명은 다시 선언문에서 사용 불가
		
		// 할당문
		num = 30; // num 변수에 30을 저장하라
		num = 40; // num 변수에 40을 저장하라
		num = 10; // num 변수에 10을 저장하라
		// 변수는 기존에 어떤 값이 있더라도 
		// 새로운 할당문을 만나면
		// 기존 값은 쫓겨난다.
		System.out.println(num);
		
		// 할당문
		num = num + 10;
		// 1. 기존의 num 변수에 저장된 값을 CPU로 가져오기
		// 2. 거기에 10을 더하기
		// 3. 더한 값(20)을 num 변수에 다시 할당(저장)
		// num = 10 + 10 과 같게 된다.
		System.out.println(num);
		
		
		
		
		
		
	}

}
