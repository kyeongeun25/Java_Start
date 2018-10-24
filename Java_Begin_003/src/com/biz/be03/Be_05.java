package com.biz.be03;

public class Be_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<100; i=i+2) {
			System.out.println(i);
		}
		
		// 0부터 100까지 숫자 중에 짝수의 합을 구하라
		int intSum = 0;
		for(int i=0; i<=100; i+=2) {
			intSum = intSum + i;
		}
		System.out.println("짝수의 합 : "+intSum);
		
		// 1부터 100까지 숫자 중에서 홀수의 합을 구하라
		int intOdd = 0;
		for(int i=1;i<=100;i+=2) {
			intOdd += i;
		}
		System.out.println("홀수의 합 : "+intOdd);
		
		intOdd = 0;
		for(int i = 0; i<=100; i++) {
			if(i%2!=0) {
				intOdd += i;
			}
		}
		System.out.println("if를 이용한 홀수의 합 : "+intOdd);
		
	}

}
