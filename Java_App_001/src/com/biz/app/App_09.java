package com.biz.app;
/*
 * method�� �ϳ� �����ؼ�
 * �Ҽ����θ� �˻�
 */
public class App_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(primeCheck(7)) {
			System.out.println("7�� �Ҽ���");
		}
		
		if(primeCheck(8)) {
			
		}else {
			System.out.println("8�� �Ҽ��� �ƴ�");
		}
		
		if(primeCheck(8)==false) {
			System.out.println("8�� �Ҽ��� �ƴ�");
		}
		
		// not ptimeCheck(8)
		if(!primeCheck(8)) {
			System.out.println("8�� �Ҽ��� �ƴ�");
		}
		
	}
	
	public static boolean primeCheck(int num) {
		
		for(int i = 2 ; i < num ; i++) {
			
			// �߰��� � ��(i)�� ���� �������� 0�� ��찡 ������
			// num ���� �Ҽ��� �ƴ�
			if(num % i == 0) {
				return false ;
			}
		}
		// num���� �˻� ������ i�� ���� �������� 0�� ��찡 �����Ƿ�
		// num�� �Ҽ���
		return true ;
	}

}
