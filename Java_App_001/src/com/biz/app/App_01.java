package com.biz.app;

public class App_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 구구단 표시를 위한 객체 선언
		GuguDan gu = new GuguDan();
		
		gu.guguDan(3); // 매개변수로 값을 전달하면서
							// method를 호출
		
		gu.setNum(4);	// member변수에 값을 세팅한 후
		gu.guguDan();	// method를 호출
		
		// for 구문을 이용해서 2단부터 9단까지 구구단을 표시
		for(int i = 1 ; i <10 ; i++) {
			// member변수에 값을 세팅하는 방법으로 구구단 호출
			gu.setNum(i);
			gu.guguDan();
		}
		
	}

}
