package com.biz.b02;

public class Be_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNum1 = 10;
		int intNum2 = 5;
		
		int intResult = 0;
		
		intResult = intNum1 + intNum2;
		System.out.println("덧셈결과:"+ intResult);
		
		intResult = intNum1 - intNum2;
		System.out.println("뺄셈결과:"+ intResult);
		
		intResult = intNum1 * intNum2;
		System.out.println("곱셈결과:"+ intResult);
		
		intResult = intNum1 / intNum2;
		System.out.println("나눗셈결과:"+ intResult);
		
		// % mod연산, 나머지연산
		intResult = intNum1 % intNum2;
		System.out.println("나머지계산결과:"+ intResult);
		
		int num =0;
		int intSum = 0;
		int intSum2 = 0;
		for(int i =0;i<100;i++) {
			num++;
			// num가 짝수인 경우만 console에 표시
			// 비교판단 구문사용
			if( num%2==0) {
				System.out.println("짝수 : "+num);
				intSum = intSum + num;
			}else {
				System.out.println("홀수 : "+num);
				intSum2 = intSum2 + num;
			}
		}
		System.out.println("1부터 100까지 짝수들의 함 : "+intSum);
		System.out.println("1부터 100까지 홀수들의 합 : "+intSum2);
		
		num = 0;
		int intEven = 0; // 짝수의 합
		int intOdd = 0; //홀수의 합
		for(int i = 0; i<100; i++) {
			num++;
			if(num%2==0) {
				intEven = intEven + num;
			}else {
				intOdd = intOdd + num;
			}
		}
		System.out.println("짝수들의 함 : "+intEven);
		System.out.println("홀수들의 합 : "+intOdd);
		
		int intNum = 10;
		if(intNum == 10) {
			System.out.println("숫자 10이다");
		}
		if(intNum>5) {
			System.out.println("5보다 크다");
		}
		if(intNum<20) {
			System.out.println("20보다 작다");
		}
		if(intNum != 20) {
			System.out.println("20이 아니다");
		}
	}

}
