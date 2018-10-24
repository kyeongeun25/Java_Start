package com.biz.Be04;

public class Be_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1부터 100까지의 숫자 중에
		// 짝수와 홀수의 합을 각각 계산하라.
		
		int intEven = 0;
		int intOdd = 0;
		for(int i =1;i<=100;i++) {
			if(i%2==0) {
				intEven +=i;
			}else {
				intOdd += i;
			}
		}
		
		// if문을 한번만 사용해도 계산 결과에는 변함이 없을 것으로 생각되지만
		// 좀 더 확실한 얻기 위해서 
		// if문을 중첩사용하기도 한
		System.out.println("1부터 100까지 짝수들의 함 : "+intEven);
		System.out.println("1부터 100까지 홀수들의 합 : "+intOdd);
		
		
		// 1부터 100까지의 숫자 중에
		// 짝수와 홀수의 합을 각각 계산하라.
		
		int intEven2 = 0;
		int intOdd2 = 0;
		
		for(int i = 1 ; i <= 100 ; i++) {
			if(i%2==0) {
				intEven2 += i ;
			}else {
				intOdd2 += i;
			}
		}
		System.out.println("짝수 합 : "+intEven2);
		System.out.println("홀수 합 : "+intOdd2);
		
	}

}
