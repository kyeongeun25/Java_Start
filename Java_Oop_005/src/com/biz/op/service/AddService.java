package com.biz.op.service;
/*
 * 클래스 이름 끝에 붙이는 접미사에 따라
 * 클래스의 기능적인면을 구분한다.
 * *VO : 사용자 정의 형 데이터 타입, Value Object
 * 		  다양한 형태의 member변수를 묶음 형태로 만든 클래스
 * 		  DTO(Data Transfer Object), DO(Data Object)
 * 		  member 변수(주인)가 있고, member 변수는 정보은닉이 되어 있고,
 * 		  getter와 setter가 설정
 * 
 * *Service : 동적인 연산 등을 수행하는 클래스
 * 				DAO(Data Access Object), Controller
 * 				method(주인)들로 이루어져 있다.
 */
public class AddService {
		
	// 정수 2개를 받아서 덧셈하고 
	// 결과를 return하는 method를 선언
		public int sum (int num1, int num2) {
			return num1 + num2 ;
		}
	
	
	// Service 클래스의 method는 public으로 시작
	// 외부에서 method에 접근해서 어떤 동작을 수행하기 위함
		

	
	// 판매금액과 매입금액을 받아서 
	// 이익금을 계산해서 return하는 method 선언
		public int 이익금(int 판매금액, int 매입금액) {
			return 판매금액 - 매입금액;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
