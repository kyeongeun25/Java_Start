package com.biz.b02;

public class Be_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNum1 = 10;
		int intNum2 = 5;
		
		int intResult = 0;
		
		intResult = intNum1 + intNum2;
		System.out.println("�������:"+ intResult);
		
		intResult = intNum1 - intNum2;
		System.out.println("�������:"+ intResult);
		
		intResult = intNum1 * intNum2;
		System.out.println("�������:"+ intResult);
		
		intResult = intNum1 / intNum2;
		System.out.println("���������:"+ intResult);
		
		// % mod����, ����������
		intResult = intNum1 % intNum2;
		System.out.println("�����������:"+ intResult);
		
		int num =0;
		int intSum = 0;
		int intSum2 = 0;
		for(int i =0;i<100;i++) {
			num++;
			// num�� ¦���� ��츸 console�� ǥ��
			// ���Ǵ� �������
			if( num%2==0) {
				System.out.println("¦�� : "+num);
				intSum = intSum + num;
			}else {
				System.out.println("Ȧ�� : "+num);
				intSum2 = intSum2 + num;
			}
		}
		System.out.println("1���� 100���� ¦������ �� : "+intSum);
		System.out.println("1���� 100���� Ȧ������ �� : "+intSum2);
		
		num = 0;
		int intEven = 0; // ¦���� ��
		int intOdd = 0; //Ȧ���� ��
		for(int i = 0; i<100; i++) {
			num++;
			if(num%2==0) {
				intEven = intEven + num;
			}else {
				intOdd = intOdd + num;
			}
		}
		System.out.println("¦������ �� : "+intEven);
		System.out.println("Ȧ������ �� : "+intOdd);
		
		int intNum = 10;
		if(intNum == 10) {
			System.out.println("���� 10�̴�");
		}
		if(intNum>5) {
			System.out.println("5���� ũ��");
		}
		if(intNum<20) {
			System.out.println("20���� �۴�");
		}
		if(intNum != 20) {
			System.out.println("20�� �ƴϴ�");
		}
	}

}
