package com.biz.op.vo;
/*
 * 10���� ���� �迭�� �����
 * ���� ���� ä�� ���� �� 
 * �������� ������ �� ����
 */
public class Op_Array_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[10];
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = (int)(Math.random()*100);
		}
		
		System.out.println("��������===============");
		for(int i : nums) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// ���Ŀ��� �⺻����
		// �ι� ��ģ for �ݺ����� ���
		for(int i = 0 ; i <nums.length ; i++) {
			for(int j = i ; j < nums.length ; j++) {
				System.out.print(nums[j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// �迭�� ��� ��� ���� ������������ �����ϴ�
		// bubble ����
		for(int i = 0 ; i < nums.length ; i++) {
			for(int j = i ; j <nums.length ; j++) {
				if(nums[i]>nums[j]) {
					int _t = nums[i];
					nums[i] = nums[j];
					nums[j] = _t ;
				}
			}
		}
		System.out.println("���� �� ���� ===========");
		for(int i : nums) {
			System.out.print(i+" ");
		}
	}

}
