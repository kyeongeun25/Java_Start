package com.biz.Be04;

public class Be_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(make());
		int intSum = make();
		System.out.println(intSum);
		
		// intSum ������ ����ؼ� make(int num)��
		// return �ϴ� ���� �ްڴ�.
		
		System.out.println(make(100));
		intSum = make(100);
		System.out.println(intSum);
		
		
	}
	
	// 1���� num���� ���� ���
	public static int make(int num) {
		
		int intSum = 0;
		for(int i =1; i<=num;i++) {
			intSum += i;
		}
		
		return intSum;
	}

	// 1���� 10������ ������� method
	public static int make() {
		
		int intSum = 0;
		for(int i = 1; i<=10; i++) {
			intSum += i;
		}
		return intSum ;
		
	}
	
}
