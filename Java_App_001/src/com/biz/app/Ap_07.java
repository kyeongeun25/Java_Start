package com.biz.app;

/*
 * 	 ���� ���� �Ҽ��ΰ� �˻��ϱ�
 */

public class Ap_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 7 ;
		
		for( int i = 2 ; i < num ; i++) {
			if(num%i==0) {
				System.out.println(num+"�� �Ҽ��� �ƴ�");
				break;
			}
		}
		System.out.println(num+"�� �Ҽ���");
		
		// for �ݺ����� ��� ������ i ���� i>=num �̸�
		// num�� �Ҽ���.
		
	}

}
