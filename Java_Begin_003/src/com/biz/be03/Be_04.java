package com.biz.be03;

public class Be_04 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNum = 0;
		
		// �������
		intNum = intNum + 10;
		// Java ������ ���
		intNum += 10;
		
		System.out.println(intNum);
		
		
		intNum += 1; // 1����
		intNum ++; // 1����
		
		// i���� 0���� 10�̸�(9����) 1�� �����ǵ���
		// for�� ���� ��ɹ��� �ݺ� �����Ѵ�.
		
		int intNum1 = 0;
		for(int i = 0; i<10; i++) {
			intNum1 ++;
			System.out.println(intNum1);
		}
		System.out.println("������");
		System.out.println(intNum1);
		
		System.out.println("i�� Ȯ��");
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("i�� Ȯ��");
		for(int i = 1 ; i<=10; i++) {
			System.out.println(i);
		}
		
		int intSum = 0;
		for(int i=1; i<=10; i++) {
			intSum += i;
		}
		System.out.println("1���� 10���� ��:"+intSum);
	}

}
