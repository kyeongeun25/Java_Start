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
		
		// �迭�� ���� ������ ū �� ������ : ��������
		// ��������
		
		// ã�� �˰����� ����
		// 100���� �迭�� ����� ������ ���� �߿��� 50�� ���� ���ʷ�
		// ���° �迭��ġ���� �������� �˾ƺ���
		// 
		for(int i = 0 ; i < nums.length ; i++) {
			if(nums[i]==50) {
				System.out.println("50�� "+i+"��° ����");
				break ; // �ݺ����� �ߴ��϶�
			}
		}
		
		
	}

}
