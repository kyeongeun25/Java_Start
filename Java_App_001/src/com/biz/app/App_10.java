package com.biz.app;

public class App_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean ok = false;
		
		// static method�� Ŭ���� ��ü ���� ���� ��밡���ϴ�.
		ok = App_09.primeCheck(9);
		if(ok) {
			System.out.println("�Ҽ�");
		}else {
			System.out.println("�Ҽ� �ƴ�");
		}
		
		/*
		 *  2���� 10������ �� �� �Ҽ��� �͵鸸 ���
		 */
		for(int i = 2 ; i <= 10 ; i++) {
			if(App_09.primeCheck(i)) {
				System.out.println(i+"��(��) �Ҽ���");
			}
		}
		
		/*
		 *  2���� 50������ �� �� �Ҽ��� �͵鸸 ���
		 */
		for( int i = 2 ; i<= 50 ; i++) {
			if(App_09.primeCheck(i)) {
				System.out.println(i+"��(��) �Ҽ���");
			}
		}
		
		/*
		 *  2���� 100���� �� �� �Ҽ��� �͵��� ��?
		 */
		int intSum = 0;
		for(int i = 2 ; i<=100 ; i++) {
			if(App_09.primeCheck(i)) {
				intSum += i ;
				System.out.println(i+"��(��) �Ҽ���");
			}
		}
		System.out.println("�Ҽ����� �� �� : "+intSum);
		
	}

}
