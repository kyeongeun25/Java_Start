package com.biz.be_05;

public class Be_03 {

	/*
	 * 3���� ������ ���� ������ num1, num2, num3��� �����ϰ�
	 * ���� 10, 20, 30�� �Ҵ��� ��
	 * 
	 * sum(num1, num2)
	 * sum(num1, num2, num3) 
	 * �޼��带 ����� 
	 * �޼��忡�� �� ���� �����Ͽ� �ֿܼ� ǥ���ϱ�
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		sum(num1,num2);
		sum(num1,num2,num3);
		

	}
	
	public static void sum(int num1, int num2) {
		System.out.println("�� ���� �� : "+(num1+num2));
	}
	public static void sum(int num1, int num2, int num3) {
		System.out.println("�� ���� �� : "+(num1+num2+num3));
	}
	

	
	
}
