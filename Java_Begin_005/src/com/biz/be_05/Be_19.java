package com.biz.be_05;

public class Be_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		점프(1);
		점프(2);
		점프(3);
		점프(4);
	}
	
	// 1개의 정수형 매개변수를 받고
	// 변수 값에 따라 덧셈, 곱셈, 뺄셈을 하도록 
	// method를 만든다.
	public static void 점프(int 매개변수) {
		if( 매개변수 > 3 ) {
			return;
		}
		if( 매개변수 == 1 ) {
			System.out.println(30+30);
			return;
		}
		if( 매개변수 == 2 ) {
			System.out.println(30*30);
			return;
		}
		if( 매개변수 == 3) {
			System.out.println(30-30);
		}
	}

}
