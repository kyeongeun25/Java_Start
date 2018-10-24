package com.biz.Be04;

public class Be_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(make());
		int intSum = make();
		System.out.println(intSum);
		
		// intSum 변수를 사용해서 make(int num)가
		// return 하는 값을 받겠다.
		
		System.out.println(make(100));
		intSum = make(100);
		System.out.println(intSum);
		
		
	}
	
	// 1부터 num까지 덧셈 계산
	public static int make(int num) {
		
		int intSum = 0;
		for(int i =1; i<=num;i++) {
			intSum += i;
		}
		
		return intSum;
	}

	// 1부터 10까지의 덧셈계산 method
	public static int make() {
		
		int intSum = 0;
		for(int i = 1; i<=10; i++) {
			intSum += i;
		}
		return intSum ;
		
	}
	
}
