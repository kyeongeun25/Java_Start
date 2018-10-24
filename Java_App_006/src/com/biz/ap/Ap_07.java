package com.biz.ap;

public class Ap_07 {

	public static void main(String[] args) {
			
		/*
		 * ������ �� ����(Call By Value) : ���� ���� ���纻 ����
		 * ������ method()�� ���޵Ǿ�
		 * method()���� ���� �����ص�
		 * ���� ������ ���� ������ ����. 
		 */
		
		int num = 30 ;
		System.out.println(num);
		��������(num) ; // ������ method()�� ����
		System.out.println(num);
		
		/*
		 * �ּ��� ����(Call By Reference)
		 * 			������ �ִ� ���� �ּҸ� ���� ����
		 * �迭�̳�, ��ü�� ���
		 * method()�� ������ ��
		 * method() ���ο��� �迭�̳�, ��ü�� member���� �Ϻθ�
		 * ������ ��� 
		 * ���� �迭�̳�, ��ü�� member������ �����ȴ�.
		 */
		// �迭 ����
		int[] nums = new int[10] ;
		nums[3] = 50 ;
		System.out.println(nums[3]);	// 50
		�ּ�����(nums); // �迭�� method()�� ����
		System.out.println(nums[3]);	
		

	}
	
	public static void ��������(int num) {
		num += 40 ;
	}
	
	public static void �ּ�����(int[] num) {
		num[3] += 30 ;
	}

}
