package com.biz.op;

public class Op_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정수형 배열 10개를 생성
		int[] intNums = new int[10];
		
		// 10개의 배열에 Math.randeom() 메서드를 이용해서
		// 난수를 할당(저장)하자
		
		// 먼저,
		// 테스트 0 번 위치에 난수값을 하나 할당
		intNums[0] = (int)(Math.random()*10 );
		// 		>> 0부터 9까지 임의 값이 할당
		System.out.println(intNums[0]);
		
		// for 반복문을 이용해서 10개의 배열에
		// 난수를 할당
		System.out.println("난수리스트");
		System.out.println("==========");
		for ( int i = 0 ; i < 10 ; i++) {
			intNums[i] = (int)(Math.random()*100 );
			System.out.println(i + "번째 난수 : "+ intNums[i]);
		}
		
		// 위에서 배열에 저장된 난수들의 합을 계산
		System.out.println("합계 계산");
		System.out.println("==========");
		
		// 합계용 변수 선언
		int intSum = 0;
		for ( int i = 0 ; i  < 10 ; i++) {
			intSum += intNums[i];
		}
		System.out.println("난수 총합 : "+ intSum);
		
		System.out.println();
		System.out.println("평균 계산");
		System.out.println("===========");
		
		int intAvg = 0;
		for(int i =0 ; i < 10 ; i++) {
			// 여기에서 평균을 구해서 덧셈을 하면
			// 절대 안된다!!!
			intAvg += intNums[i] / 10 ;
		}
		System.out.println("난수 평균 : "+ intAvg);
		System.out.println();
		
		intAvg = intSum / 10 ;
		System.out.println(intAvg);
		
	}

}
