package com.biz.app;

public class App_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean ok = false;
		
		// static method는 클래스 객체 생성 없이 사용가능하다.
		ok = App_09.primeCheck(9);
		if(ok) {
			System.out.println("소수");
		}else {
			System.out.println("소수 아님");
		}
		
		/*
		 *  2부터 10까지의 수 중 소수인 것들만 출력
		 */
		for(int i = 2 ; i <= 10 ; i++) {
			if(App_09.primeCheck(i)) {
				System.out.println(i+"는(은) 소수임");
			}
		}
		
		/*
		 *  2부터 50까지의 수 중 소수인 것들만 출력
		 */
		for( int i = 2 ; i<= 50 ; i++) {
			if(App_09.primeCheck(i)) {
				System.out.println(i+"는(은) 소수임");
			}
		}
		
		/*
		 *  2부터 100까지 수 중 소수인 것들의 합?
		 */
		int intSum = 0;
		for(int i = 2 ; i<=100 ; i++) {
			if(App_09.primeCheck(i)) {
				intSum += i ;
				System.out.println(i+"은(는) 소수임");
			}
		}
		System.out.println("소수들의 총 합 : "+intSum);
		
	}

}
