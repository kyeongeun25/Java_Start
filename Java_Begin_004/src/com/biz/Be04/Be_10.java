package com.biz.Be04;

public class Be_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNum = 0;
		intNum = make();
		System.out.println(intNum);
		
		intNum = make(20);
		System.out.println(intNum);
		
		intNum = make(20, 30);
		System.out.println(intNum);
		
	}

	// return 값이 있는 method라고 한다.
	// 30+40을 계산해서 return
	public static int make() {
		return 30 + 40 ;
	}
	
	// 한개의 정수값을 받아서
	// 두번 덧셈해서 return
	public static int make(int num) {
		return num + num;
	}
	
	// 두 개의 정수값을 받아서
	// 두 값을 덧셈한 후 return
	public static int make(int num1, int num2) {
		return num1 + num2 ;
	}
}
