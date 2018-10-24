package com.biz.be_05;

public class Be_10 {

	/*
	 * 정보표시()라는 메서드를 만들고
	 * main()에서 정보표시()를 호출하고
	 * 이때, 홍길동 이라는 문자열과 25라는 숫자를 전달하고
	 * 정보표시()에서는 문자열과 숫자를 받는 매개변수를 각각 만들고
	 * 화면에 나는 홍길동이며 25세 입니다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		정보표시("홍길동",25);
	}
	public static void 정보표시(String name, int age) {
		System.out.println("나는 "+name+"이며 "+age+"세 입니다.");    
	}
	

}
