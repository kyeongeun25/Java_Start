package com.biz.be_06;

public class Be_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� ���� Ŭ����
		// �������� ���� ���� ���� ����
		// Math() class
		// 	���� �߻� method
		
		
		
		for(int i = 0 ; i < 10 ; i ++) {
			
			// double�� float���� ���е��� ���� �Ǽ�
			// float�� �Ҽ��� ���� 6�ڸ�
			// double�� �Ҽ��� ���� 14�ڸ�
			double nNum = Math.random();
			nNum *= 100;
			// nNum�� (�Ҽ������ϸ� �ϴ� ���ٰ� �����ϰ�)
			// 0���� 9���� ������ ���� ���´�.
			
			// *= 100 : 0���� 99����
			int intNum = (int)nNum;
			System.out.println(intNum);
			
			
			
			
		}
	}

}
