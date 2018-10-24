package com.biz.be_05;

public class Be_18 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		없음(-1);
		없음(2);
	}
	
	// void 형(return 값이 없는) method를 만드는데
	// 한개의 정수형 매개변수를 받고 
	// 전달받은 값이 -1 이면 아무런 일도 하지 말고 
	// 그렇지 않으면 '안녕하세요'라는 문자열을
	// 콘솔에 보여라
	
	public static void 없음(int 매개변수) {
		if(매개변수 == -1) {
			// 매개변수 값이 -1이면
			// 없음() 메서드를 중단하라
			return;
		}else {
			System.out.println("안녕하세요");
		}
	}

}
