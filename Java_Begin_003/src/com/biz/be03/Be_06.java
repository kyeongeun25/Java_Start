package com.biz.be03;

public class Be_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 국어, 영어, 수학 과목을 저장할 변수를 만들고
		// 총점과 평균을 구하라
		
		int intKorGrade = 90;
		int intEngGrade = 82;
		int intMathGrade = 85;
		int intSum = 0;
		int intAvg = 0;
		
		// 세 과목의 총 점
		intSum = intKorGrade + intEngGrade + intMathGrade;
		intAvg = intSum / 3;
		
		
		intSum = intKorGrade ;
		intSum += intEngGrade ;
		intSum += intMathGrade ;
		
		System.out.println("총 점 : "+intSum);
		System.out.println("평 균 : "+intAvg);
		System.out.println("평 균 : "+intSum/3);
		
		float flAvg = intSum / 3;
		System.out.println("평 균 : "+flAvg);
	}

}
