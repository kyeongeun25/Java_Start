package com.biz.Be04;

public class Be_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNum1 = 0;
		int intNum2 = 0;
		
		// intNum1�� 30�� �Ҵ�
		intNum1 = 30;
		
		// intNum1�� ���� intNum2�� '����'
		intNum2 = intNum1 ;
		// >> intNum2�� 30�̶�� ���� ���� ��
		System.out.println(intNum1);
		System.out.println(intNum2);
		
		// intNum1�� 20�� �Ҵ�
		intNum1 = 20 ;
		// intNum2�� ���� ������ ����.
		System.out.println(intNum1);
		System.out.println(intNum2);
		
		// intNum1�� intNum2�� ������, �ٸ��� Ȯ���غ���
		if(intNum1==intNum2) {
			System.out.println("intNum1�� intNum2�� ����.");
		} else {
			System.out.println("intNum1�� intNum2�� ���� �ʴ�.");
		}
		
		
		
		
	}

}
