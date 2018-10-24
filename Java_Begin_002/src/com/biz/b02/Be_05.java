package com.biz.b02;

public class Be_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 성적처리 연습
		// 3과목 점수를 덧셈, 평균을 계산
		
		int intKorGrade = 80;
		int intEngGrade = 90;
		int intMathGrade = 69;
		
		int intSum = 0;
		int intAvg = 0;
		
		//총점계산
		intSum = intKorGrade ;
		intSum = intSum + intEngGrade ;
		intSum = intSum + intMathGrade ;
		
		intSum = intKorGrade + intEngGrade + intMathGrade ;
		
		intAvg = intSum / 3;
		
		System.out.println("총점 : " + intSum );
		System.out.println("평균 : " + intAvg);
		
		float flAvg = intSum / 3;
		System.out.println("평균1 : " + flAvg);
		
		flAvg = intAvg; // 자동으로 정수를 실수형 변수에 
					// 저장하라
		
		intAvg = (int)flAvg; // 강제로 실수형변수의 값을
						// 정수형 변수에 넣어라
						// 소수점 이하 값을 무조건 짤라라
		
		
	}

}
