package com.biz.be_06;

public class Be_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intKor = 0;
		int intEng = 0;
		
		int intSum = 0;
		
		for(int i = 0 ; i < 10 ; i++) {
			
			double nNum = Math.random();
			intKor = (int)(nNum * 100) + 1 ; // 1���� 100����
			
			nNum = Math.random();
			intEng = (int)(nNum * 100) + 1 ;
			
			intSum = intKor + intEng ;
			
			System.out.println("���� : "+intKor);
			System.out.println("���� : "+intEng);
			System.out.println("���� : "+intSum);
			System.out.println();
			
		}
		
	}

}
