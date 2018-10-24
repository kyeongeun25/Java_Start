package com.biz.be01;

public class Be004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 0 이라는 값을 메모리에 저장해 두었다가
		// 나중에 꺼내 쓰려고 한다.
		// 나중에 꺼내 쓰기 위해서는 저장된 주소를
		// 알아야 하는데,
		// 컴퓨터 내부의 주소값은 우리가 알아보기 어려운
		// data 형태이다.
		
		// 그래서 편의상 주소값 대신 i 라는 별명을 붙여 두고
		// 나중에 꺼내 쓸 때 별명을 사용해서
		// 꺼내 쓰도록 하겠다.
		
		int i=3; // 변수선언문
		System.out.println(i);
		
		int a = 5;
		int b = 4;
		
		System.out.println(a+b);
		
		int c = a+b;
		System.out.println(c);
		
		
		
	}

}
