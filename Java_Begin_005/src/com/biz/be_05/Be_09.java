package com.biz.be_05;

public class Be_09 {

	/*
	 * 화면표시() 메서드를 만들고
	 * main()에서 화면표시()를 호풀하고,
	 * 		호출하면서 숫자 30을 전달하고
	 * 화면표시()에서는 매개변수에 숫자를 받고
	 * 나는 30살 입니다. 라고 표시
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		화면표시(30);
	}
	public static void 화면표시(int num) {
		System.out.println("나는 "+num+"살 입니다.");
	}

}
