package com.biz.op;

public class Op_02 {

	/*
	 * 정수형 배열 100개를 생성
	 * 0부터 99까지 임의 값을 할당
	 * 그 전체를 합계 계산
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intNums = new int[100];
		for(int i = 0; i < intNums.length ; i++) {
			intNums[i] = (int)(Math.random() * 100);
		}
		
		int intSum = 0;
		// 무조건 배열의 처음부터 끝까지
		for( int n : intNums) {
			intSum += n;
		}
		
		System.out.println("총점 : "+intSum);
		
	}

}
