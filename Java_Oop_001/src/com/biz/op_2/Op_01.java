package com.biz.op_2;

public class Op_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Grade Ŭ������ �̿��ؼ� ��ü�� �����Ѵ�.
		GradeVO grade1 = new GradeVO ();
		GradeVO grade2 = new GradeVO ();
		GradeVO grade3 = new GradeVO ();
		
		grade1.intKor = 30 ;
		grade2.intKor = 50 ;
		grade3.intKor = 30 ;
		
		grade2.strName = "ȫ�浿" ;
		grade3.strName = "ȫ�浿" ;
		
		if(grade1.intKor == grade3.intKor) {
			System.out.println("�� ����� ���� ������ ����.");
		}
		
		// member������ �ڷ����� String�̸� ������ �� �� ��
		// ==�� ������� ���� String.equals()�� ����ؾ� �Ѵ�.
		if(grade3.strName.equals(grade2.strName)) {
			System.out.println("�� ����� ���������Դϴ�.");
		}
		
	}

}
