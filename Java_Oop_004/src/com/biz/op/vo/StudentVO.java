package com.biz.op.vo;
/*
 * StudentVO���� �Ʒ��� member ������ ���´�.
 * �й� : intNum
 * �̸� : strName
 * ��ȭ��ȣ : strTel
 * ���� : intAge
 * 
 * member������ ���������� �ϰ�
 * �� member�������ܺο��� ���� �� �� �ֵ���
 * getter�� setter�� ����
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
