package com.biz.op.vo;
/*
 * 10개의 숫자 배열을 만들고
 * 임의 값을 채워 넣은 후 
 * 오름차순 정렬을 해 보자
 */
public class Op_Array_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[10];
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = (int)(Math.random()*100);
		}
		
		System.out.println("원래숫자===============");
		for(int i : nums) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 정렬에서 기본설정
		// 두번 겹친 for 반복문을 사용
		for(int i = 0 ; i <nums.length ; i++) {
			for(int j = i ; j < nums.length ; j++) {
				System.out.print(nums[j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 배열에 담긴 요소 값을 오름차순으로 정렬하는
		// bubble 정렬
		for(int i = 0 ; i < nums.length ; i++) {
			for(int j = i ; j <nums.length ; j++) {
				if(nums[i]>nums[j]) {
					int _t = nums[i];
					nums[i] = nums[j];
					nums[j] = _t ;
				}
			}
		}
		System.out.println("정렬 후 숫자 ===========");
		for(int i : nums) {
			System.out.print(i+" ");
		}
	}

}
