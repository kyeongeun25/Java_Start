package com.biz.b02;

public class Be_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����ó�� ����
		// 3���� ������ ����, ����� ���
		
		int intKorGrade = 80;
		int intEngGrade = 90;
		int intMathGrade = 69;
		
		int intSum = 0;
		int intAvg = 0;
		
		//�������
		intSum = intKorGrade ;
		intSum = intSum + intEngGrade ;
		intSum = intSum + intMathGrade ;
		
		intSum = intKorGrade + intEngGrade + intMathGrade ;
		
		intAvg = intSum / 3;
		
		System.out.println("���� : " + intSum );
		System.out.println("��� : " + intAvg);
		
		float flAvg = intSum / 3;
		System.out.println("���1 : " + flAvg);
		
		flAvg = intAvg; // �ڵ����� ������ �Ǽ��� ������ 
					// �����϶�
		
		intAvg = (int)flAvg; // ������ �Ǽ��������� ����
						// ������ ������ �־��
						// �Ҽ��� ���� ���� ������ ©���
		
		
	}

}
