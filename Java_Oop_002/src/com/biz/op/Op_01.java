package com.biz.op;

public class Op_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// GradeVO Ŭ����(class)�� ����ؼ� gradeVO ��ü(object)�� ����
		GradeVO gradeVO = new GradeVO () ;
		StudentVO studentVO = new StudentVO () ;
		
		// gradeVO ��ü�� member �������� �Ҵ�
		gradeVO.setIntNum(1);
		gradeVO.setStrName("ȫ�浿");
		gradeVO.setIntKor(80);
		gradeVO.setIntEng(90);
		gradeVO.setIntMath(70);
		
		studentVO.setIntNum(1);
		studentVO.setStrName("ȫ�浿");
		studentVO.setStrAddr("����");
		
	}

}
