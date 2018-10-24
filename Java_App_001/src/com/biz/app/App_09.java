package com.biz.app;
/*
 * method를 하나 생성해서
 * 소수여부를 검사
 */
public class App_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(primeCheck(7)) {
			System.out.println("7은 소수임");
		}
		
		if(primeCheck(8)) {
			
		}else {
			System.out.println("8은 소수가 아님");
		}
		
		if(primeCheck(8)==false) {
			System.out.println("8은 소수가 아님");
		}
		
		// not ptimeCheck(8)
		if(!primeCheck(8)) {
			System.out.println("8은 소수가 아님");
		}
		
	}
	
	public static boolean primeCheck(int num) {
		
		for(int i = 2 ; i < num ; i++) {
			
			// 중간에 어떤 수(i)와 나눈 나머지가 0인 경우가 있으면
			// num 수는 소수가 아님
			if(num % i == 0) {
				return false ;
			}
		}
		// num까지 검사 했으나 i와 나눈 나머지가 0인 경우가 없으므로
		// num는 소수임
		return true ;
	}

}
