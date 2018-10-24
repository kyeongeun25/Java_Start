package com.biz.b02;

public class Be_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 반복문 
		int i=0;
		for(i=0; // 1. 최초에 i를 0으로 reset하고
				i<10; // 2. i가 10보다 작은지 묻고
				i++) { // 5. i를 1증가
			 
			// 3. i < 10 = true 이면
			//   실행하고
			// 4. 다시 for로 올라가서
		}
		// i가 10이되면 끝

		for(i=0;i<10;i++) {
			System.out.println(i);
		}
		// 횟수가 정해진 반복문
		
		int intSum = 0;
		for(i=0;i<10;i++) {
			intSum = intSum+1;
			
		}
		System.out.println(intSum);
		
		intSum = 0;
		for(i=0;i<10;i=i+1) {
			intSum++;
			// 1씩 증가시킬 때 
			// 플러스(+) 기호를 두 번 연속해서 사용한다.
		}
		System.out.println(intSum);
		
		
	}

}
