package com.biz.app;

/*
 * 	 임의 수가 소수인가 검사하기
 */

public class Ap_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 7 ;
		
		for( int i = 2 ; i < num ; i++) {
			if(num%i==0) {
				System.out.println(num+"은 소수가 아님");
				break;
			}
		}
		System.out.println(num+"은 소수임");
		
		// for 반복문이 모두 끝나서 i 값이 i>=num 이면
		// num은 소수다.
		
	}

}
