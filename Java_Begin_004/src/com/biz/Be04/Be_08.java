package com.biz.Be04;

public class Be_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1���� 100������ ���� �߿�
		// ¦���� Ȧ���� ���� ���� ����϶�.
		
		int intEven = 0;
		int intOdd = 0;
		for(int i =1;i<=100;i++) {
			if(i%2==0) {
				intEven +=i;
			}else {
				intOdd += i;
			}
		}
		
		// if���� �ѹ��� ����ص� ��� ������� ������ ���� ������ ����������
		// �� �� Ȯ���� ��� ���ؼ� 
		// if���� ��ø����ϱ⵵ ��
		System.out.println("1���� 100���� ¦������ �� : "+intEven);
		System.out.println("1���� 100���� Ȧ������ �� : "+intOdd);
		
		
		// 1���� 100������ ���� �߿�
		// ¦���� Ȧ���� ���� ���� ����϶�.
		
		int intEven2 = 0;
		int intOdd2 = 0;
		
		for(int i = 1 ; i <= 100 ; i++) {
			if(i%2==0) {
				intEven2 += i ;
			}else {
				intOdd2 += i;
			}
		}
		System.out.println("¦�� �� : "+intEven2);
		System.out.println("Ȧ�� �� : "+intOdd2);
		
	}

}
