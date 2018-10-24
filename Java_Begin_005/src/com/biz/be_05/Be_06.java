package com.biz.be_05;

public class Be_06 {

	/*
	 * 화면표시() 라는 메서드를 만들고
	 * main()에서 호출하면
	 * 안녕하세요 라는 문자열을 콘솔에 표시
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		화면표시(); 
		System.out.println(hi());
	}
	
	public static void 화면표시() {
		System.out.println("안녕하세요");
	}
	
	public static String hi() {
		return "안녕하세요";
	}

}
