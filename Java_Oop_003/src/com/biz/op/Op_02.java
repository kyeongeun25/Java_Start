package com.biz.op;

public class Op_02 {

	/*
	 * ������ �迭 100���� ����
	 * 0���� 99���� ���� ���� �Ҵ�
	 * �� ��ü�� �հ� ���
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intNums = new int[100];
		for(int i = 0; i < intNums.length ; i++) {
			intNums[i] = (int)(Math.random() * 100);
		}
		
		int intSum = 0;
		// ������ �迭�� ó������ ������
		for( int n : intNums) {
			intSum += n;
		}
		
		System.out.println("���� : "+intSum);
		
	}

}
