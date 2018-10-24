package com.biz.op;

/*
 * �л��� ������ ���� Value Object Ŭ����
 * 
 * �й�		:	������, intNum
 * �̸�		:	���ڿ���, strName
 * ��ȭ��ȣ	: 	���ڿ���, strTel
 * �ּ�		:	���ڿ���, strAddr
 * ����		: 	������, intAge
 * �г�		:	������, intLevel
 * 
 */
public class StudentVO {

	// ������ ������ member ������ ����
	
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
