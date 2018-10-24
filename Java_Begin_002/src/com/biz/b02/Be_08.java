package com.biz.b02;

public class Be_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intSum = 0;
		for(int i=0;i<10;i++) {
			intSum++;
		}
		// 같은 이름의 변수는 또 다시 선언 할 수 없다
		// int intSum = 10;
		
		int num = 0 ;
		intSum = 0 ;
		for(int i=0; i<100; i++) {
			num++; //num 값을 1씩 증가
			intSum = intSum + num;
		}
		// 1부터 100까지 덧셈한 결과
		
		System.out.println(intSum);
		
	}

}
