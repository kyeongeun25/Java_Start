package com.biz.be_05;

public class Be_17 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(리턴());
		System.out.println(리턴());
		System.out.println(리턴());
		
		// void method에서도 return을 사용하는 경우가 있다.
		// 이 경우는 특별히 method 실행을 중단하고 싶을 때
		
		return; // main() method가 중단
		
		//System.out.println(리턴());
		//System.out.println(리턴());
	}

	// 매개변수 없는 리턴() 메서드를 만들고 
	// 안녕하세요 문자열을 return 하도록 한다.
	
	public static String 리턴() {
		
		// method 내부에서 return 명령문이 실행되면
		// 그곳이 method의 끝이다.
		return "안녕하세요";
		
		//int num1 = 0;
		//int num2 = 0;
		//String strNation = "대한민국";
	}
	
	// 리턴값이 void형인 메서드를 제외하고는
	// return값이 1번 이상 반드시 나와야 한다.
}
