package com.biz.op;

public class Op_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 연속된 메모리장소에 
		// 다수의 변수를 생성하는 방법
		// ==>> 배열
		
		int[] intNums = new int[10] ;
		// intNums라는 변수를 만드는데
		// int[] 키워드로 시작되면
		// >> 연속된 장소에 ??개의 변수를
		// 		선언하라는 말이구나
		// new int[??] : ?? 개수만큼 만들어라 
		// (반드시) 연속된 ?? 개의 변수를 만들고
		// 처음 변수 위치를 0으로 하고 
		// 끝 변수의 위치(주소 값)를 ??-1을 정하여
		// 각각의 변수에 접근 할 수 있도록 한다.
		
		// intNums의 4번째 위치 변수에 10을 할당하라
		intNums[4] = 10 ;
		
		// intNums의 4번째 위치 변수 값을 출력해라
		System.out.println(intNums[4]);
		
		
	}

}
