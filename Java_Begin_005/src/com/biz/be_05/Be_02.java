package com.biz.be_05;

public class Be_02 {

	/*
	 * ������ ���ں��� intKor, intEng, intMath�� �����ϰ�
	 * ���� 89,98,77 ������ �Ҵ��ϰ�
	 * ������ ����Ͽ� intSum�� �����ϰ�, ����� ����Ͽ� intAvg�� ������ ��
	 * �� ������, ����, ����� console�� ǥ���Ͻÿ�
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intKor = 0 ;
		int intEng = 0;
		int intMath = 0;
		intKor = 89;
		intEng = 98;
		intMath = 77;
		
		int intSum = 0;
		intSum = intKor + intEng + intMath;
		int intAvg = 0;
		intAvg = intSum/3;
		
		System.out.println("�� �� : "+intKor);
		System.out.println("�� �� : "+intEng);
		System.out.println("�� �� : "+intMath);
		System.out.println("�� �� : "+intSum);
		System.out.println("�� �� : "+intAvg);
		System.out.println();
		
		intSum = sum(intKor, intEng, intMath);
		intAvg = avg(intSum);
		System.out.println("�� �� : "+intSum);
		System.out.println("�� �� : "+intAvg);
		
	}
	public static int sum(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	public static int avg(int num1) {
		return num1/3;
	}

}
