package com.biz.op;

public class Op_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNum = 0; // 정수형 변수를 선언하고 0으로 초기화
		
		Integer intNum1 = new Integer(0);
		Integer intNum2 = 0;
		// intNum1, intNum2는 엄밀히 말하면 정수형 객체다.
		
		intNum = intNum1 ; // intNum1 객체의 값만 추출해서 intNum 변수에 저장 unBoxing
		intNum2 = intNum ; // intNum변수 값을 객체로 싸서(포장)해서 
								//  intNum2객체에 저장 Boxing
		
		// Integer같이 기본변수와 호환되는 클래스를
		// 래퍼(wrapper) 클래스라고 한다.
								
		// int = Integer : 정수
		// float = Float : 실수
		// boolean = Boolean : 참(true), 거짓(false)
		// char = CHARACTER : 문자
		// char[] = String : 문자열
		// double = Double : 배정도 실수, float보다 소수이하 자리수가 큰 수
		// long = Long : 정수, 8Byte 2^64
		
	}

}
