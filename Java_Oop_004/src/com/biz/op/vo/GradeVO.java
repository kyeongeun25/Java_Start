package com.biz.op.vo;

/*
 *  성적 저장을 위한 VO
 *  member 변수
 *  학번		: intNum
 *  국어점수 : intKor
 *  영어점수 : intEng
 *  수학점수 : intMath
 */
public class GradeVO {

	private int intNum = 0 ;
	private int intKor = 0 ;
	private int intEng = 0;
	private int intMath = 0;
	
	public int getIntNum() {
		return intNum;
	}
	public void setIntNum(int intNum) {
		this.intNum = intNum;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		if(intKor < 0 || intKor > 100) {
			return;
		}
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
