package com.biz.op_2;

/*
 * 변수를 묶어서
 * method에 전달하는 목적으로 생성한 클래스를 
 * Value Object Class 라고 부른다.
 * 
 * 클래스를 만들 때 클래스이름 끝에 VO라고 표기한다.
 * 
 */

public class GradeVO {

	// VO 클래스는 member 변수를 기본을 포함한다.
	
	int num = 0 ;
	String strName = new String() ; //클래스변수, 문자열객체
	int intKor = 0 ;
	int intEng = 0 ;
	int intMath = 0 ;
	
}
