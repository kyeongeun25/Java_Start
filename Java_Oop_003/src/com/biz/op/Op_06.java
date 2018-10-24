package com.biz.op;

/*
 * Grade02 클래스를 이용하여
 * gs 객체배열을 10개 생성하고
 * 초기화 하시오.
 */

public class Op_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grade02[] gs = new Grade02[10] ;
		
		for( int i = 0; i<gs.length ; i++) {
			gs[i] = new Grade02();
		}
		
		// 초기화된 gs 배열에
		// 각 점수를 Math.random() 메서드를 사용해서
		// 0부터 99까지의 점수를 할당
		
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("======================");
		for ( int i = 0 ; i < gs.length ; i++) {
			
			int intKor = (int)(Math.random()*1000);
			gs[i].setIntKor(intKor);
			
			int intEng = (int)(Math.random()*100);
			gs[i].setIntEng(intEng);
			
			int intMath = (int)(Math.random()*100);
			gs[i].setIntMath(intMath);
			
			System.out.print(gs[i].getIntKor()+"\t");
			System.out.print(gs[i].getIntEng()+"\t");
			System.out.print(gs[i].getIntMath()+"\t");
			
			int intSum = gs[i].getIntKor() + gs[i].getIntEng() + gs[i].getIntMath() ;
			
			System.out.print(intSum+"\t");
			System.out.println((intSum / 3));
			
		}
		System.out.println("======================");

		// 확장된 for를 이용한 총점 계산
		// v=gs의 요소 객체 한개 한개
		// 객체배열은 요소하나하나가 모두 객체들..
		for(Grade02 v : gs) {		// gs의 요소를 v에 복사
			
			int intSum = v.getIntKor() + v.getIntEng() + v.getIntMath() ;
			
			// 배열에 써 넣는게 아니라
			// 배열요소인 Grade02의 객체에 setting한 것
			// 그래서 확장된 for를 사용해서 
			// 값을 할당(set) 할 수 있다.
			v.setIntSum(intSum);
			v.setIntAvg(intSum / 3);
			// 객체 배열일 경우는 확장 for를 사용해서 
			// 각 member 변수에 값을 setting 할 수 있다.
			
		}
		
	}

}
