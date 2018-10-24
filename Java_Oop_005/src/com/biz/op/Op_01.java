package com.biz.op;

import com.biz.op.service.AddService;

public class Op_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정의한 AddService 클래스를 사용해서
		// 덧셈과 이익금을 계산
		
		
		
		// 1. 클래스를 객체로 생성
		AddService service = new AddService();
		
		// 2. 덧셈method를 호출하는데 2개의 정수를 전달하고
		//	  결과를 intSum에 할당 받는다.
		int intSum = service.sum(30, 50);
		
		
		// 3. 결과를 화면에 표시
		System.out.println(intSum);
		

		// 판매금액과 매입금액을 이익금() method에 전달하고
		// 이익금() method를 호출해서 이익금 계산 결과를 intMargin 변수에 할당
		
		// 1. 판매금액과 매입금액 변수 선언
		int 판매금액 = 120000;
		int 매입금액 = 100000;
		
		int intMargin = service.이익금(판매금액, 매입금액);
		
		System.out.println(intMargin);
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
