package com.biz.be03;

public class Be_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// sum method�� ȣ�� �� �� 
		// ���� ���ڰ� 2���� �ѱ��
		// ����� ��ٸ��� ���
		for(int i=1; i<=100; i++) {
			sum(10, 20);
		}
		
		
		// num1�� ���� �ּҿ�
		// i�� ���� �ּҸ� �ѱ��
		// �� �ּҿ� �ִ� ���� ��������
		// ������ ó���ϴ� ���
		int num1 = 0;
		for(int i = 1; i<=100; i++) {
			num1++; //num1�� 1�� �������Ѷ�
			sum(num1,i);
		}
		
	}

	public static void sum(int num1, int num2) {
		System.out.println("�� ���� �� : "+(num1 + num2));
	}
}
