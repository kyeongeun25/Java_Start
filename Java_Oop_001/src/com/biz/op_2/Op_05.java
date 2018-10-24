package com.biz.op_2;

public class Op_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grade05 g = new Grade05 () ;
		
		// 값을 할당, 값을 Setting
		g.setIntNum(1);
		g.setStrName("홍길동");
		g.setIntKor(90);
		g.setIntEng(80);
		g.setIntMath(80);
		
		// 읽어서 과목 총점 계산
		int intSum = g.getIntEng() + g.getIntKor() + g.getIntMath() ;
		
		System.out.print("학번 "+ g.getIntNum() + "의 ");
		System.out.println(g.getStrName()+"은 ");
		System.out.println("국어점수 : "+g.getIntKor());
		System.out.println("수학점수 : "+g.getIntMath());
		System.out.println("영어점수 : "+g.getIntEng());
		
		
	}

}
