package com.biz.op;

public class StudentVO {

	private int intNum = 0;
	private String strName = "";
	private int intAge = 0;
	
	
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
	public int getIntAge() {
		return intAge;
	}
	public void setIntAge(int intAge) {
		this.intAge = intAge;
	}
	
	// VO클래스에 Object로 부터 상속받은
	// toString() 메서드를 재정의 했다.
	@Override
	public String toString() {
		return "StudentVO [intNum=" + intNum + ", strName=" + strName + ", intAge=" + intAge + "]";
	}
	
	// StudentVO를 이용해서 객체를 생성하고
	// 각 member변수의 값을 세팅한 후
	// 세팅한 값이 얼마인지 단순히 알아보기 위한
	// 기능을 하는 method로 재정의 한 것
	
	
	
	
	
}
