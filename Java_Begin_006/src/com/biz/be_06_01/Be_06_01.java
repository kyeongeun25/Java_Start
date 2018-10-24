package com.biz.be_06_01;

public class Be_06_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// main()에서 선언된 intNum는
		// 덧셈() 메서드로 건너가는 순간
		// 모두 단단한 금고속에 감추어진다.
		int intNum = 0;
		덧셈();
		System.out.println(intNum);
		
	}
	
	public static void 덧셈() {
		
		// 덧셈()에서 선언된 intNum는
		// 덧셈() 메서드 코드가 실행되는 동안에는 
		// 메모리에 남아 있다가
		// 덧셈() 메서드가 중단, 종료되는 순간
		// 모두 사라진다.
		int intNum = 0 ;
		intNum = 30;
		
	}

}
