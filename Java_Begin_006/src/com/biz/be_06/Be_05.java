package com.biz.be_06;

public class Be_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 수학 관련 클래스
		// 여러가지 수학 관련 연산 가능
		// Math() class
		// 	난수 발생 method
		
		
		
		for(int i = 0 ; i < 10 ; i ++) {
			
			// double는 float보다 정밀도가 높은 실수
			// float는 소수점 이하 6자리
			// double은 소수점 이하 14자리
			double nNum = Math.random();
			nNum *= 100;
			// nNum는 (소수점이하를 일단 없다고 가정하고)
			// 0부터 9까지 범위의 수를 갖는다.
			
			// *= 100 : 0부터 99까지
			int intNum = (int)nNum;
			System.out.println(intNum);
			
			
			
			
		}
	}

}
