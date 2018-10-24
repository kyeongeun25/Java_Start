package com.biz.be_05;

public class Be_14 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		너누구야(); // 호출만 해서는 아무런 반응을 볼 수 없다.
		// return한 값, 변수를 받을 변수를 = 왼쪽에 써 주어야 한다.
		String 이름 = 너누구야();
		System.out.println(이름); // 홍길동 문자열이 콘솔에 표시
		
		int 생년월일 = 1995;
		몇살일까요(생년월일);
		
		int 나이 = 0;
		나이 = 몇살일까요(생년월일);
		System.out.println(나이);
		
	}

	// method에 return 명령문이 있는 경우
	// 호출하는 곳으로 어떤 값을 다시 전달한다.(넘긴다, 리턴한다)
	// 이럴 경우 void 키워드 대신
	// return 할 값, 변수의 자료형을 써주어야 한다.
	public static String 너누구야() {
		return "홍길동";
	}
	
	public static int 몇살일까요(int intBirth) {
		int 나이 = 0;
		나이 = 2018 - intBirth + 1;
		return 나이;
	}
}
