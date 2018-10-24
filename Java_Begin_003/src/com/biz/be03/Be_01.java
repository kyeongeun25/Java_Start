package com.biz.be03;

public class Be_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNum = 10; // 처음부터 변수에 10이라는 값을
						// 할당하라
						// 변수선언과 할당을 동시에 실행 => 변수 생성, 초기화
		
		intNum = 20;
		intNum = 10;
		intNum = 30;
		intNum = 5;
		intNum = 0; // 기존의 어떤 값이 있던지 관계없이 
				// 가장 마지막에 실행된 명령문에 따라
				// intNum 값은 0이 된다.
		System.out.println(intNum);
		
		
		// 기존의 intNum에 10을 더하여 다시 원래 저장소에 
		// 보관 
		intNum = intNum + 10; // intNum가 10 
		intNum = intNum + 20; // intNum가 30
		intNum = intNum + 30; // intNum의 값은 60이 된다.
		System.out.println(intNum);
		
		
	}

}
