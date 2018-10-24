package com.biz.op;

/*
 * 학생의 정보를 담을 Value Object 클래스
 * 
 * 학번		:	정수형, intNum
 * 이름		:	문자열형, strName
 * 전화번호	: 	문자열형, strTel
 * 주소		:	문자열형, strAddr
 * 나이		: 	정수형, intAge
 * 학년		:	정수형, intLevel
 * 
 */
public class StudentVO {

	// 위에서 나열된 member 변수를 선언
	
	private int intNum ;
	private String strName ;
	private String strTel ;
	private String strAddr ;
	private int intAge ;
	private int intLevel ;
	
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
	public String getStrTel() {
		return strTel;
	}
	public void setStrTel(String strTel) {
		this.strTel = strTel;
	}
	public String getStrAddr() {
		return strAddr;
	}
	public void setStrAddr(String strAddr) {
		this.strAddr = strAddr;
	}
	public int getIntAge() {
		return intAge;
	}
	public void setIntAge(int intAge) {
		this.intAge = intAge;
	}
	public int getIntLevel() {
		return intLevel;
	}
	public void setIntLevel(int intLevel) {
		this.intLevel = intLevel;
	}
	
	
	
}
