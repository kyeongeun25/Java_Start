package com.biz.op;

/*
 * GradeVO 클래스 : Value Object
 * 		여러가지 변수들을 묶어서 하나의 자료형처럼
 * 		사용하기 위한 클래스
 * 
 * 		member 변수들이 존재
 * 		member 변수들은 private으로 선언된다.
 * 		외부에서 접근(읽고, 쓰기)하기 위해서
 * 			getter와 setter를 갖게 된다.
 * 
 *  	학번 : intNum
 *  	이름 : strName
 *  	국어점수 : intKor
 *  	영어점수 : intEng
 *  	수학점수 : intMath
 *  
 *  	이렇게 5개의 member 변수(메서드 내부가 아닌 클래스 내에서 선언된 변수)를 갖는
 *  	GradeVO() 클래스를 완성
 */
public class GradeVO {

	 // member 변수를 private 시작하는 생성
	private int intNum ;
	private String strName ;
	private int intKor ; 
	private int intEng ;
	private int intMath ;
	
	// 자동기능을 이용해서 getter와 setter을 생성
	
	public int getIntNum() {
		return intNum;
	}
	public void setIntNum(int intNum) {
		this.intNum = intNum;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	
	
}



