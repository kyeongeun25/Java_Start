package com.biz.ap;

import java.util.Scanner;

/*
 * ���ڸ� 5�� �Է¹޾Ƽ�
 * ������ �迭�� �����ϰ�
 * 5�� ��� �Է��� ������
 * �迭�� ��� ���� �հ踦 ����Ͽ� ���
 */
public class KeyInput_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int[] nums = new int[5];
		
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.print((i+1)+"��° �� >>");
			nums[i] = Integer.valueOf(scanner.nextLine());
		}
		
		int intSum = 0;
		for(int i : nums) {
			intSum += i;
		}
		System.out.println("�հ� : "+intSum);
		
	}

}
