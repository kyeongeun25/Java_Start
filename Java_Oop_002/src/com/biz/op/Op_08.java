package com.biz.op;

public class Op_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// GradeVO 클래스를 사용해서
		// 10명 분의 성적을 random으로 생성하고
		// 총점과 평균을 계산 하자.
		
		// GradeVO를 배열로 생성하라
		GradeVO[] gs = new GradeVO[100];
		
		
		// 숫자 배열은 
		// 배열을 생성하면 각요호(nums[0] ~ nums[9])들을
		// 모두 0으로 자동 초기화 한다. 
		int[] nums = new int[10];
		// 그런데, 클래스를 배열로 선언하면
		// 각 요소는 아직 객체로 만들어진 상태가 아니다.
		// 즉, 현재 gs[0] 부터 gs[99]까지는 
		// 아무런 값이 없는 상태이다.
		// ==>> null(null pointer)인 상태
		
		// 객체는 배열로 선언한 다음에
		// 각 요소들을 반드시 다시 객체초기화 해 주어야 한다.
		
		// 전체 배열 요소를 초기화 하는 방법
		for(int i = 0 ; i < gs.length ; i++) {
			gs[i] = new GradeVO() ;
		}
		// >> 객체 배열은 배열을 만든 후
		// 		각 요소를 초기화 하지 않으면
		//		읽기도, 쓰기도 아무것도 할 수 없다.
		
		// 임의의 점수를 각각 할당
		for(int i = 0; i < gs.length ; i++) {
			
			int intKor = (int)(Math.random() * 100);
			gs[i].setIntKor(intKor) ;
			
			int intEng = (int)(Math.random() * 100);
			gs[i].setIntEng(intEng);
			
			int intMath = (int)(Math.random() * 100);
			gs[i].setIntMath(intMath);
		}
		
		// 총점 구하기
		int intSum = 0 ;
		for(int i = 0 ; i < gs.length ; i++) {
			intSum = gs[i].getIntKor() + gs[i].getIntEng() + gs[i].getIntMath();
			System.out.println(intSum);
		}
		
		
	}

}
