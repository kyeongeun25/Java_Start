package com.biz.op_2;

public class Grade02 {
	
	// private key word로 시작되는 member 변수는
	// 다른 클래스에서 접근 불가능
	private int intNum = 0 ;
	private String strName = "" ;
	private int intKor = 0 ;
	private int intEng = 0 ;
	private int intMath = 0 ;
	
	// private 변수는 접근 할 수 없기 때문에 메서드를 통해서 접근
	public void setIntKor(int intKor) {
		
		if( intKor <0 ) {
			System.out.println("국어점수는 0점 미만이 될 수 없습니다.");
			return ;
		}
		
		if( intKor > 100 ) {
			System.out.println("국어점수는 100을 넘길 수 없습니다.");
			return ; 
		}
		
		this.intKor = intKor ; // this.intKor은 member변수 intKor은 매개변수
		
	}
	
	
}
