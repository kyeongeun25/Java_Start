package com.biz.app;

/*
 *  어떤 회사에서 급여를 현금으로 지급하려 한다.
 *  이 때 최소한의 화폐매수를 구하는 코드를 작성
 */

public class App_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int money = 2785430 ;
		int m = 0;
		
		m = (money / 50000);
		System.out.println("5만원권 "+m+"매");
		money = money - m*50000 ;
		
		m = (money / 10000);
		System.out.println("1만원권 "+m+"매");
		money = money - m*10000 ;
		
		m = (money / 5000);
		System.out.println("5천원권 "+m+"매");
		money = money - m*5000 ;
		
		m = (money / 1000);
		System.out.println("1천원권 "+m+"매");
		money = money - m*1000 ;
		
		m = (money / 500);
		System.out.println("5백원짜리 "+m+"개");
		money = money - m*500 ;
		
		m = (money / 100);
		System.out.println("백원짜리 "+m+"개");
		money = money - m*100 ;
		
		m = (money / 10);
		System.out.println("십원짜리 "+m+"매");
		money = money - m*10 ;
		
	}

}
