package com.biz.be_05;

public class Be_16 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String 리턴값 = 문자열("우리나라 ","만세");
		System.out.println(리턴값);
	}
	
	// 두 개의 문자열을 매개변수로 갖는 
	// 문자열() 이라는 메서드를 선언(정의)하고
	// 받은 두 문자열을 덧셈연산하여 
	// 문자열을 return하도록 한다.
	
	public static String 문자열(String 문자열1, String 문자열2) {
		
		String 문자열들 = 문자열1 + 문자열2 ;
		
		return 문자열들;
	}

}
