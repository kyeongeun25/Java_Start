package com.biz.ap;

import java.util.Scanner;

/*
 * 숫자를 5번 입력받아서
 * 정수형 배열에 저장하고
 * 5번 모두 입력이 끝나면
 * 배열에 담긴 수의 합계를 계산하여 출력
 */
public class KeyInput_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int[] nums = new int[5];
		
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.print((i+1)+"번째 수 >>");
			nums[i] = Integer.valueOf(scanner.nextLine());
		}
		
		int intSum = 0;
		for(int i : nums) {
			intSum += i;
		}
		System.out.println("합계 : "+intSum);
		
	}

}
