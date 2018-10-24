package com.biz.op;

public class Op_01 {
/*
 * 정수형으로 100개짜리 배열을 하나 생성하고
 * 각각의 요소에 랜덤값으로 0부터 99까지를 채워넣고
 * 전체의 총점을 계산
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 정수형 100개짜리 배열 생성
		int[] intNums = new int[100];
		// 정수형 배열은 생성을 하면
		// 각 요소의 값들이 전부 0으로 초기화가 된다.
		// 초기화가 된다 = 변수를 읽을 수 있다.
		// 만약 선언만되고, 초기화가 안되면 
		// 		>> 변수의 값을 쓰기(할당)는 할 수 있으나 읽기는 안된다.
		int intN ; //선언 : 읽기 불가, 쓰기만 가능
		int intN1 = 0 ; //선언과 초기화 동시 =>생성
		
		// 		>> 그런데 정수형 배열은 생성만 해도 자동 초기화가 된다.
		
		// 2. 각 배열의 요소를 0부터 99까지 값으로 채워넣는다.(할당)
		// Math.random(); 메서드 활용
		for( int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = (int)(Math.random() * 100);
		}
		
		// 3. 채워진 전체 요소 값의 총점 계산
		
		// 총점계산 할 변수 생성
		int intSum = 0 ;		// 반드시 초기화 한다.
		
		intSum = 30 ; // 최초에 30으로 초기화
		intSum += 40 ; // 30에 40을 더해서 70을 다시 할당
		
		for( int i = 0 ; i <intNums.length ; i++) {
			intSum += intNums[i] ;
		}
		
		// 4. 총점을 화면에 표시
		System.out.println("총점 : "+intSum);

		intSum = 0 ; // 배열 총점 비우기
		
		// 배열에서 값을 읽을 용도로 사용 할 때는
		// 기존의 for 구문대신, 확장된, 새로운 for를 사용 할 수 있다. = > 확장for문 =>값을 할당 할 때는 안됨
		// 다른 언어에서는 forEach라고도 한다.
		for( int n : intNums) { //intNums는 반드시 배열이어야 한다.
			intSum += n ;
		}
		
	}

}
