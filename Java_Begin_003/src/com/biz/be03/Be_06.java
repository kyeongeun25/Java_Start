package com.biz.be03;

public class Be_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ����, ����, ���� ������ ������ ������ �����
		// ������ ����� ���϶�
		
		int intKorGrade = 90;
		int intEngGrade = 82;
		int intMathGrade = 85;
		int intSum = 0;
		int intAvg = 0;
		
		// �� ������ �� ��
		intSum = intKorGrade + intEngGrade + intMathGrade;
		intAvg = intSum / 3;
		
		
		intSum = intKorGrade ;
		intSum += intEngGrade ;
		intSum += intMathGrade ;
		
		System.out.println("�� �� : "+intSum);
		System.out.println("�� �� : "+intAvg);
		System.out.println("�� �� : "+intSum/3);
		
		float flAvg = intSum / 3;
		System.out.println("�� �� : "+flAvg);
	}

}
