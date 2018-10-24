package com.biz.op;

public class Op_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3명 학생의 성적을 입력하고, 3명의 전체 총점을 계산
		// 3개의 gradeVO 객체를 생성
		
		GradeVO g01 = new GradeVO();
		GradeVO g02 = new GradeVO();
		GradeVO g03 = new GradeVO();
		
		// 1번 학생의 점수를 등록
		g01.setIntNum(1);
		g01.setStrName("홍길동");
		g01.setIntKor(80);
		g01.setIntEng(70);
		g01.setIntMath(77);
		
		g02.setIntNum(2);
		g02.setStrName("이몽룡");
		g02.setIntKor(60);
		g02.setIntEng(90);
		g02.setIntMath(80);
		
		g03.setIntNum(3);
		g03.setStrName("성춘향");
		g03.setIntKor(78);
		g03.setIntEng(67);
		g03.setIntMath(88);
		
		int int01 = g01.getIntKor() ;
		int01 += g01.getIntEng() ;
		int01 += g01.getIntMath();
		
		int int02 = g02.getIntKor() ;
		int02 += g02.getIntEng() ;
		int02 += g02.getIntMath();
		
		int int03 = g03.getIntKor() ;
		int03 += g03.getIntEng() ;
		int03 += g03.getIntMath();
		
		int intSum = int01 + int02 + int03 ;
		
		
		
	}

}
