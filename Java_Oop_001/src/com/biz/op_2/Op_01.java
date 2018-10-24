package com.biz.op_2;

public class Op_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Grade 클래스를 이용해서 객체를 생성한다.
		GradeVO grade1 = new GradeVO ();
		GradeVO grade2 = new GradeVO ();
		GradeVO grade3 = new GradeVO ();
		
		grade1.intKor = 30 ;
		grade2.intKor = 50 ;
		grade3.intKor = 30 ;
		
		grade2.strName = "홍길동" ;
		grade3.strName = "홍길동" ;
		
		if(grade1.intKor == grade3.intKor) {
			System.out.println("두 사람의 국어 점수는 같다.");
		}
		
		// member변수도 자료형이 String이면 같음을 비교 할 때
		// ==을 사용하지 말고 String.equals()를 사용해야 한다.
		if(grade3.strName.equals(grade2.strName)) {
			System.out.println("두 사람은 동명이인입니다.");
		}
		
	}

}
