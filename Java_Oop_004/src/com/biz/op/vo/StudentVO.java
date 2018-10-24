package com.biz.op.vo;
/*
 * StudentVO에는 아래의 member 변수를 갖는다.
 * 학번 : intNum
 * 이름 : strName
 * 전화번호 : strTel
 * 나이 : intAge
 * 
 * member변수는 정보은닉을 하고
 * 각 member변수에외부에서 접근 할 수 있도록
 * getter와 setter를 생성
 */
public class StudentVO {

	private int intNum  = 0;
	private String strName  = ""; 
	private String strTel = "" ;
	private int intAge = 0 ;
	
	
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
	public int getIntAge() {
		return intAge;
	}
	public void setIntAge(int intAge) {
		this.intAge = intAge;
	}
	
	
	
	
}
