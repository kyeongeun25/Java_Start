package com.biz.b02;

public class Be_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intSum = 0;
		for(int i=0;i<10;i++) {
			intSum++;
		}
		// ���� �̸��� ������ �� �ٽ� ���� �� �� ����
		// int intSum = 10;
		
		int num = 0 ;
		intSum = 0 ;
		for(int i=0; i<100; i++) {
			num++; //num ���� 1�� ����
			intSum = intSum + num;
		}
		// 1���� 100���� ������ ���
		
		System.out.println(intSum);
		
	}

}
