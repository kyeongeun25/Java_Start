package com.biz.be_05;

public class Be_15 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// return 값이 있는 메서드는 일반적으로 
		// 그 return 값을 받을 변수가 = 왼쪽에 온다.
		// 왼쪽의 변수는 메서드에서 return하는 값, 변수의
		// 자료형과 같아야 한다.
		// String s = 덧셈(30,40); // 덧셈은 return 값이 int 형인데
				// s는 String 형이어서 오류가 발생한다.
		
		String s = str덧셈(30,40);
				// s 변수에 오른쪽에 오는 method는 return 값이 반드시 String형 이어ㅑ 한다.
		
		float f = 덧셈(30,40);
		// return 값이 int 형인 덧셈으로 부터 받은 값을
		// float f에 저장하려고 시도하면
		// f는 int 형보다 큰 float 형이므로 오류 없이
		// 실행이 된다.
	}

	// 매개변수로 숫자 2개를 받고 
	// 두 숫자의 덧셈을 실행해서 
	// 결과를 return 해주도록 
	
	public static int 덧셈(int 숫자1, int 숫자2) {
		int 더하기 = 숫자1 + 숫자2 ;
		return 더하기;
	}
	
	public static String str덧셈(int 숫자1, int 숫자2) {
		return "덧셈";
	}
}
