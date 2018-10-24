package com.biz.op;

public class Op_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열을 만들겠다.
		//		배열의 이름
		//						크기가 10인 배열을 만들어라
		// ** 여기에는 정수형 값만 저장 할 수 있다.
		int[] intNums = new int[10] ;
		
		// 값을 할당
		// 배열의 index = 첨자라고 부른다.
		//  	  >> 배열의 위치
		intNums[0] = 1 ;
		intNums[1] = 5 ;
		intNums[2] = 10 ;
		intNums[3] = 9 ;
		intNums[4] = 3 ;
		intNums[5] = 5 ;
		intNums[6] = 2 ;
		intNums[7] = 8 ;
		intNums[8] = 20 ;
		intNums[9] = 10;
		// 배열을 10개 만들면
		// 		index는 0부터 9까지만 생성된다.
		// 그런데 10번 index에 11이라는 값을 
		// 할당하라고 하니 크기가 초과돼서 exception이 발생
		// intNums[10] = 10 ;
		
		// 배열 값 출력
		System.out.println(intNums[0]);
		System.out.println(intNums[1]);
		System.out.println(intNums[2]);
		System.out.println(intNums[3]);
		System.out.println(intNums[4]);
		System.out.println(intNums[5]);
		System.out.println(intNums[6]);
		System.out.println(intNums[7]);
		System.out.println(intNums[8]);
		System.out.println(intNums[9]);
		
		for ( int index = 0 ; index < 10 ; index ++) {
			System.out.println(intNums[ index ]);
		}
		
	}

}
