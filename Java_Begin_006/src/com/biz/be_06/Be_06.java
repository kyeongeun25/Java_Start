package com.biz.be_06;

public class Be_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intKor = 0;
		int intEng = 0;
		
		int intSum = 0;
		
		for(int i = 0 ; i < 10 ; i++) {
			
			double nNum = Math.random();
			intKor = (int)(nNum * 100) + 1 ; // 1부터 100까지
			
			nNum = Math.random();
			intEng = (int)(nNum * 100) + 1 ;
			
			intSum = intKor + intEng ;
			
			System.out.println("국어 : "+intKor);
			System.out.println("영어 : "+intEng);
			System.out.println("총점 : "+intSum);
			System.out.println();
			
		}
		
	}

}
