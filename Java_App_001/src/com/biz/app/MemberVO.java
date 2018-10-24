package com.biz.app;

public class MemberVO {

	private String strName = "" ;
	private String strTel = "" ;
	
	/*
	 * 	생성자
	 * 
	 *  클래스의 이름과 같고
	 *  return 형(void, String, int)이 없는 특별한 method
	 */
	public MemberVO(String strName, String strTel) {
		super();
		this.strName = strName;
		this.strTel = strTel;
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
	
	@Override
	public String toString() {
		return "MemberVO [strName=" + strName + ", strTel=" + strTel + "]";
	}
	
	
	
}
