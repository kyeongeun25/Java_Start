package com.biz.op;

/*
 * GradeVO 클래스로 성적표 객체를 생성해서
 * 각 과목의 점수를 랜덤으로 생성 할당 한 후
 * 
 * 학생 점수의 총점과 평균을 계산
 */
public class Op_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GradeVO[] 성적표 = new GradeVO[10] ;
		
		//객체배열 생성 후 각 요소를 초기화
		for(int i = 0 ; i < 성적표.length ; i++) {
			성적표[i] = new GradeVO();
		}
		
		// 각 학생의 과목점수를 할당
		for(int i = 0 ; i < 성적표.length ; i++) {
			// 성적표의 i번째 요소 객체를 v에 복사(임시보관)
			GradeVO v = 성적표[i] ;
			
			// Math.random()을 이용해서 점수를 생성
			// 편의상 50점부터 100점까지 
			int intKor = (int)(Math.random() * (100-50) +50) ;
			// 점수를 할당
			v.setIntKor(intKor);
			
			int intEng = (int)(Math.random() * (100-50)+50);
			v.setIntEng(intEng);
			
			int intMath = (int)(Math.random() * (100-50)+50);
			v.setIntMath(intMath);
			
			// i 변수의 값으로 학생의 학번을 설정
			v.사용금지(i+1);
			
		}
		
		// 성적표시
		// \t : 키보드의 tab키를 한번 누른 것 처럼
		//		일정 위치에 다음 글자를 표시하고자 할 때 사용
		// 		>> escape 문자라고 한다.
		// \n : enter 키 효과
		System.out.println("학번\t국어\t영어\t수학");
		System.out.println("=================");
		for(GradeVO v : 성적표) {
			System.out.print(v.getIntNum()+"\t");
			System.out.print(v.getIntKor()+"\t");
			System.out.print(v.getIntEng()+"\t");
			System.out.println(v.getIntMath());
		}
		System.out.println("=================");
		System.out.println();
		//1	2	3	4	5	6
		
		// 총점과 평균을 구해 표시
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("========================");
		for(GradeVO v : 성적표) {
			System.out.print(v.getIntNum()+"\t");
			System.out.print(v.getIntKor()+"\t");
			System.out.print(v.getIntEng()+"\t");
			System.out.print(v.getIntMath()+"\t");
			
			// 총점 계산
			int intSum = v.getIntKor() + v.getIntEng() + v.getIntMath() ;
			
			System.out.print(intSum+"\t");
			System.out.println((intSum / 3));
			
 		}
		System.out.println("========================");
		
	}

}
