package com.biz.Op_01;

public class Op_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Grade 클래스를 이용해서 grade 변수를 생성(선언, 초기화)
		Grade grade = new Grade();
		
		// grade.member 변수에 값을 할당
		grade.num = 1;
		grade.name = "홍길동";
		grade.kor = 90;
		grade.eng = 80;
		grade.math = 80;
		
		// 홍길동의 성적 총점 구하기
		int intSum = grade.kor + grade.eng + grade.math ;
		intSum = 총점(grade.kor, grade.eng, grade.math);
		// >> 일반적인 방법
		
		// 각각의 점수가 아닌 grade를 전달하는 총점()을 만들고
		// 성적 총점을 구한다.
		총점(grade);
		
		// 홍길동의 성적을 총점() method에 전달하고 
		// 총점결과를 return 받고 싶다
		
		int intNum = 2;
		String strName = "이몽룡";
		int intKor = 80;
		int intEng = 70;
		int intMath = 90;
		
		intSum = intKor + intEng + intMath ;
		
		// 이몽룡의 성적을 총 점() method에 전달하고
		// 총점 결과를 return 받고 싶다.
		intSum = 총점(intKor, intEng, intMath);
		
	}
	static int 총점 (Grade grade) {
		int intSum = grade.kor ;
		intSum = grade.eng ;
		intSum = grade.math ;
		
		return intSum ; 
	}
	
	static int 총점(int intKor, int intEng, int intMath) {
		return intKor + intEng + intMath ;
	}
	

}
