package com.biz.op;

/*
 * ���� ó���� ���ؼ� �Ʒ� member������ ����
 * Value Object Ŭ������ ������(proto type����)
 * 
 *  >> ����Ϸ��� ��ü�� ������ �ؾ߸� ��밡��
 *  member ���� ��
 *  �й� : intNum
 *  �̸� : strName
 *  ���� : intKor
 *  ���� : intEng
 *  ���� : intMath
 */

public class GradeVO {

	// private : public�� �ݴ밳������ �ٸ������� member������
	//				���� ���� �� �� ������ ������ �����ϴ� ��
	// public : �ٸ������� GradeVO�� member������, method��
	//   	     ���� �� �� �ֵ��� ����
	
	private int intNum = 0 ;
	private String strName = " " ;
	private int intKor = 0;
	private int intEng = 0;
	private int intMath = 0;
	/**
	 * @return the intNum
	 */
	
	// getter�� setter�� �ܺο��� member������
	// �����ϴ� ����̹Ƿ�
	// public���� �����Ѵ�.
	public int getIntNum() {
		return intNum;
	}
	/**
	 * @param intNum the intNum to set
	 */
	
	// method�� �ܺο��� �������� ���ϵ���
	// private�� ���� �� �� �ִ�.
	// �� ����� method�� ���� �׽�Ʈ ���̰ų� 
	// Ư���� ���ο����� ��� �� �� �ֵ��� �ϴ� ����̴�.
	private void setIntNum(int intNum) {
		this.intNum = intNum;
	}
	
	public void ������(int intNum) {
		setIntNum(intNum) ;
	}
	/**
	 * @return the strName
	 */
	public String getStrName() {
		return strName;
	}
	/**
	 * @param strName the strName to set
	 */
	public void setStrName(String strName) {
		this.strName = strName;
	}
	/**
	 * @return the intKor
	 */
	public int getIntKor() {
		return intKor;
	}
	/**
	 * @param intKor the intKor to set
	 */
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	/**
	 * @return the intEng
	 */
	public int getIntEng() {
		return intEng;
	}
	/**
	 * @param intEng the intEng to set
	 */
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	/**
	 * @return the intMath
	 */
	public int getIntMath() {
		return intMath;
	}
	/**
	 * @param intMath the intMath to set
	 */
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	
	// �ܺο��� ���� �� �� �ִ� ��θ� ����
	// getter�� setter
	
	
	
}
