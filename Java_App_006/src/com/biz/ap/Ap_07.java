package com.biz.ap;

public class Ap_07 {

	public static void main(String[] args) {
			
		/*
		 * 변수의 값 전달(Call By Value) : 변수 값의 복사본 전달
		 * 변수는 method()에 전달되어
		 * method()에서 값을 변경해도
		 * 원본 변수의 값은 변동이 없다. 
		 */
		
		int num = 30 ;
		System.out.println(num);
		변수전달(num) ; // 변수를 method()에 전달
		System.out.println(num);
		
		/*
		 * 주소의 전달(Call By Reference)
		 * 			원본이 있는 곳의 주소를 서로 공유
		 * 배열이나, 객체의 경우
		 * method()에 전달한 후
		 * method() 내부에서 배열이나, 객체의 member변수 일부를
		 * 변경할 경우 
		 * 원본 배열이나, 객체의 member변수가 변동된다.
		 */
		// 배열 생성
		int[] nums = new int[10] ;
		nums[3] = 50 ;
		System.out.println(nums[3]);	// 50
		주소전달(nums); // 배열을 method()에 전달
		System.out.println(nums[3]);	
		

	}
	
	public static void 변수전달(int num) {
		num += 40 ;
	}
	
	public static void 주소전달(int[] num) {
		num[3] += 30 ;
	}

}
