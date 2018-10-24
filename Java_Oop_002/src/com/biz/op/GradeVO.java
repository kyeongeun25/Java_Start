package com.biz.op;

/*
 * GradeVO Ŭ���� : Value Object
 * 		�������� �������� ��� �ϳ��� �ڷ���ó��
 * 		����ϱ� ���� Ŭ����
 * 
 * 		member �������� ����
 * 		member �������� private���� ����ȴ�.
 * 		�ܺο��� ����(�а�, ����)�ϱ� ���ؼ�
 * 			getter�� setter�� ���� �ȴ�.
 * 
 *  	�й� : intNum
 *  	�̸� : strName
 *  	�������� : intKor
 *  	�������� : intEng
 *  	�������� : intMath
 *  
 *  	�̷��� 5���� member ����(�޼��� ���ΰ� �ƴ� Ŭ���� ������ ����� ����)�� ����
 *  	GradeVO() Ŭ������ �ϼ�
 */
public class GradeVO {

	 // member ������ private �����ϴ� ����
	private int intNum ;
	private String strName ;
	private int intKor ; 
	private int intEng ;
	private int intMath ;
	
	// �ڵ������ �̿��ؼ� getter�� setter�� ����
	
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



