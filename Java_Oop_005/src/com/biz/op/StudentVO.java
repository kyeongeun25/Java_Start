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
	
	// VOŬ������ Object�� ���� ��ӹ���
	// toString() �޼��带 ������ �ߴ�.
	@Override
	public String toString() {
		return "StudentVO [intNum=" + intNum + ", strName=" + strName + ", intAge=" + intAge + "]";
	}
	
	// StudentVO�� �̿��ؼ� ��ü�� �����ϰ�
	// �� member������ ���� ������ ��
	// ������ ���� ������ �ܼ��� �˾ƺ��� ����
	// ����� �ϴ� method�� ������ �� ��
	
	
	
	
	
}
