package com.biz.Op_01;

public class Op_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Grade Ŭ������ �̿��ؼ� grade ������ ����(����, �ʱ�ȭ)
		Grade grade = new Grade();
		
		// grade.member ������ ���� �Ҵ�
		grade.num = 1;
		grade.name = "ȫ�浿";
		grade.kor = 90;
		grade.eng = 80;
		grade.math = 80;
		
		// ȫ�浿�� ���� ���� ���ϱ�
		int intSum = grade.kor + grade.eng + grade.math ;
		intSum = ����(grade.kor, grade.eng, grade.math);
		// >> �Ϲ����� ���
		
		// ������ ������ �ƴ� grade�� �����ϴ� ����()�� �����
		// ���� ������ ���Ѵ�.
		����(grade);
		
		// ȫ�浿�� ������ ����() method�� �����ϰ� 
		// ��������� return �ް� �ʹ�
		
		int intNum = 2;
		String strName = "�̸���";
		int intKor = 80;
		int intEng = 70;
		int intMath = 90;
		
		intSum = intKor + intEng + intMath ;
		
		// �̸����� ������ �� ��() method�� �����ϰ�
		// ���� ����� return �ް� �ʹ�.
		intSum = ����(intKor, intEng, intMath);
		
	}
	static int ���� (Grade grade) {
		int intSum = grade.kor ;
		intSum = grade.eng ;
		intSum = grade.math ;
		
		return intSum ; 
	}
	
	static int ����(int intKor, int intEng, int intMath) {
		return intKor + intEng + intMath ;
	}
	

}
