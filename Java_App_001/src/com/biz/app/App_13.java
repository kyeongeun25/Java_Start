package com.biz.app;

public class App_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int money = 2785430 ;
		int x = 50000 ;
		int m = 0 ;
		int sw = 1;
		
		
		// for( ;; ){}
		// 무한 반복 for문
		
		// for는 무한 반복용이 아니므로
		// 무한반복을 하고자 할 때는
		// while(true)를 사용한다.
	
		 while(true){
			m = money / x;
			money -= m*x ;
			
			System.out.println(x + "원권 "+m+"매");
			
			if(money < 10) {
				break;
			}
			
			if(sw==1) {
				x /= 5 ;
			} else {
				x /= 2;
			}
			
			sw *= -1;
		}
		 
		
		
		
	}

}
      