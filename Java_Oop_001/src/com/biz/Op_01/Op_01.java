package com.biz.Op_01;

/*
 * main() method�� �ִ� Ŭ������
 * ȥ�� ������ �����ϴ�.
 * Ctrl + F11 : run�� �����ؼ�
 * � ����� Ȯ�� �� �� �ִ� Ŭ����
 */
public class Op_01 {

	public static void main(String[] args) {
	
		// �ڹٿ� �⺻������ ���Ե�
		// �ڷ���(������)�� int, String, float ���� �ƴ�
		// �������� ���ؼ� ���Ƿ� ������� �ڷ���
		����ǥ g = new ����ǥ();
		// ����ǥ g1 = ??; = ������ �� �� �ִ� ����
								// �������� �ʾƼ� String, Integer ó��
								// ����� �� ���� �� ��
								// String�̳� Integer�� ���� Ŭ������� �θ�
		
		int intNum1 = 0;
		String strName = "ȫ�浿";
		Integer intNum2 = 0;
		
		String strName2 = new String("�̸���");
		Integer intNum3 = new Integer(0);
		
		// �츮�� ���� Grade��� Ŭ������ ����ؼ�
		// grade��� ������ ���� ��
		// Grade��� Ŭ������ �⺻ ���� ���� ������
		// Grade ���� = ?? �������� ������� ���Ѵ�.
		Grade grade = new Grade();
		
		// �ƹ��͵� ���� �� Ŭ������ ������ ������ ����
		// �׷���
		// �� ������ String, Integer�� ������ ����ó��
		// �������� method�� ��� �� �� �ֵ��� �̤Ӥ�
		// ����� ���Ҵ�.
		// �̹� ������� method�� "����."���� �����Ͽ�
		// ��� �� �� �ִ�.
		
		// ����, Ŭ������ ���� member ������ "����.member" ��������
		// ��밡���ϴ�.
		
		grade.num = 1;
		grade.name = "ȫ�浿";
		grade.kor = 90;
		grade.eng = 80;
		grade.math = 70;
		
		System.out.println(grade.num);
		System.out.println(grade.name);
		System.out.println(grade.kor);
		System.out.println(grade.eng);
		System.out.println(grade.math);
		
	}

}
