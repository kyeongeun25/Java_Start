package com.biz.op_2;

// VO class
public class Grade03 {

	// VO class를 만들때는
	// 일단 member 변수를 모두 private해서 감춘다.
	
	private int intNum = 0 ;
	private String strName = "" ;
	private int intKor = 0 ;
	private int intEng = 0 ;
	private int intMath = 0 ;
	
	public void setIntKor(int intKor) {
		// 조건을 넣고
		this.intKor = intKor ;
	}
	
	public int getInKor() {
		return this.intKor ;
	}
	
}
