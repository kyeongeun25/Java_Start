package com.biz.op_2;

public class Op_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// g °´Ã¼ »ý¼º
		Grade02 g = new Grade02();
		g.setIntKor(80);
		g.setIntKor(180);
		g.setIntKor(-90);
		
		GradeVO g1 = new GradeVO();
		g1.intKor = 101 ;
		g1.intEng = 201;
		g1.intMath = -100;
		
		int intSum = g1.intEng + g1.intKor + g1.intMath ;
		
		System.out.println(intSum);
		
	}

}
