package com.biz.op;

public class Op_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// GradeVO 클래스(class)를 사용해서 gradeVO 객체(object)를 생성
		GradeVO gradeVO = new GradeVO () ;
		StudentVO studentVO = new StudentVO () ;
		
		// gradeVO 객체의 member 변수값을 할당
		gradeVO.setIntNum(1);
		gradeVO.setStrName("홍길동");
		gradeVO.setIntKor(80);
		gradeVO.setIntEng(90);
		gradeVO.setIntMath(70);
		
		studentVO.setIntNum(1);
		studentVO.setStrName("홍길동");
		studentVO.setStrAddr("광주");
		
	}

}
