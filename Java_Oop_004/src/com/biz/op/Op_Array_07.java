package com.biz.op;

public class Op_Array_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[100];
		for(int i = 0; i < nums.length ; i++) {
			nums[i] = (int)(Math.random()*100);
		}
		for(int i : nums ) {
			System.out.println(i);
		}
		
		// 배열을 작은 값부터 큰 값 순으로 : 오름차순
		// 정렬하자
		
		// 찾기 알고리즘을 연습
		// 100개의 배열에 저장된 임의의 숫자 중에서 50의 값이 최초로
		// 몇번째 배열위치에서 나오는지 알아보자
		// 
		for(int i = 0 ; i < nums.length ; i++) {
			if(nums[i]==50) {
				System.out.println("50은 "+i+"번째 있음");
				break ; // 반복문을 중단하라
			}
		}
		
		
	}

}
