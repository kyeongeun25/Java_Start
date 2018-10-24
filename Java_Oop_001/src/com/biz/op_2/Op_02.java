package com.biz.op_2;

public class Op_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3개의 객체 생성
		GradeVO_1 g = new GradeVO_1 () ;
		GradeVO_1 g1 = new GradeVO_1 () ;
		GradeVO_1 g2 = new GradeVO_1 () ;
		
		// 각각 객체의 과목점수 할당(Setting)
		g.intKor = 30 ;
		g.intEng = 90 ;
		g.intMath = 70 ;
		
		g1.intKor = 89 ;
		g1.intEng = 77 ;
		g1.intMath = 87 ;
		
		g2.intKor = 66 ;
		g2.intEng = 55 ;
		g2.intMath = 88 ;
		
		/*for(int i = 0; i < 10 ; i++) {
			GradeVO_1 i = new GradeVO_1() ;
			
		}*/
		
		// 총점() method 호출
		// return 값을 intSum에 할당
		int intSum = g.총점() ;
		System.out.println("g의 총점 : "+intSum);
		
		System.out.println("g1의 총점 : "+g1.총점());
		System.out.println("g2의 총점 : "+g2.총점());
		
		/*
		 * 클래스에 선언된 method는
		 * 그 클래스로 선언된 다른 객체에는 전혀 영향을
		 * 미치지 않는다.
		 * 
		 */
	}

}
