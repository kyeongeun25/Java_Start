package com.biz.be_05;

public class Be_02 {

	/*
	 * 정수형 숫자변수 intKor, intEng, intMath를 선언하고
	 * 각각 89,98,77 점수를 할당하고
	 * 총점을 계산하여 intSum에 보관하고, 평균을 계산하여 intAvg에 보관한 후
	 * 각 점수와, 총점, 평균을 console에 표시하시오
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intKor = 0 ;
		int intEng = 0;
		int intMath = 0;
		intKor = 89;
		intEng = 98;
		intMath = 77;
		
		int intSum = 0;
		intSum = intKor + intEng + intMath;
		int intAvg = 0;
		intAvg = intSum/3;
		
		System.out.println("국 어 : "+intKor);
		System.out.println("영 어 : "+intEng);
		System.out.println("수 학 : "+intMath);
		System.out.println("총 합 : "+intSum);
		System.out.println("평 균 : "+intAvg);
		System.out.println();
		
		intSum = sum(intKor, intEng, intMath);
		intAvg = avg(intSum);
		System.out.println("총 합 : "+intSum);
		System.out.println("평 균 : "+intAvg);
		
	}
	public static int sum(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	public static int avg(int num1) {
		return num1/3;
	}

}
