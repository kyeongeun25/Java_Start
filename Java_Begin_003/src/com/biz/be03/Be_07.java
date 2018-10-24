package com.biz.be03;

public class Be_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수를 정수형으로 만들었을 경우
		// 평균같은 실수(float)결과가 나오는 연산에서
		// 오차가 발생 할 수 있다.
		// 이럴 때 오차를 줄이기 위해서는 모든 변수를
		// float(실수형)으로 선언, 작성해야 한다.
		
		float foKor = 90.0f; // 1.8 이상에서만 사용 가능
		float foEng = 70.0f; // 자바 1.7 이하에 공통
		float foMath = 85.0f;
		
		float foSum = 0.0f;
		float foAvg = 0.0f;
		
		foSum = foKor + foEng + foMath ;
		foAvg = foSum / 3;
		
		System.out.println("총 점 : "+foSum);
		System.out.println("평 균 : "+foAvg);
		
	}

}
