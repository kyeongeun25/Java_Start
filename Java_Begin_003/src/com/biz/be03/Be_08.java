package com.biz.be03;

public class Be_08 {

	// main method�� Be_08 Ŭ�������� ���ʷ� ȣ��, ����Ǵ� ��
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �� ���� ������ ������ ���� 
		// ����, ����, ������ �ϴ� �ڵ带 �ۼ�
		int intNum1 = 20;
		int intNum2 = 30;
		
		// method�� ����� ����
		// ������ �ڵ带 ���� �� �����ϱ� ���ؼ�
		sum(30, 40);
		sum(intNum1, intNum2);
		sum(20,50,90);
		sum(30.0f, 40.0f);
		
	}
	//method ����, ����
	public static void sum(int num1, int num2) {
		System.out.println("�� ���� �� : "+(num1+num2));
	}
	
	//public static void sum(int n1, int n2) {
	//	System.out.println("�� ���� �� : "+(n1+n2));
	//}
	
	public static void sum(float num1, float num2) {
		System.out.println("�� �Ǽ��� �� : "+(num1+num2));
	}
	
	public static void sum(int num1, int num2, int num3) {
		System.out.println("�� ���� �� : "+ ( num1+num2+num3));
	}
	

}
