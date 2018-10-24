 package com.biz.op;

 /*
  * ����ǥ�� ���� value object ( member���� + getter,setter ) ����
  * member ��
  * �й�		: intNum
  * ��������	: intKor
  * ��������	: intEng
  * ��������	: intMath
  * ����		: intSum
  * ���		: intAvg
  * 
  * member ���� �µ��� member ������ �����ϰ�
  * getter�� setter�� �ۼ��Ͻÿ�
  */
 
public class Grade02 {

	private int intNum = 0;
	private int intKor = 0;
	private int intEng = 0;
	private int intMath = 0;
	private int intSum = 0;
	private int intAvg = 0;
	
	
	public int getIntNum() {
		return intNum;
	}
	public void setIntNum(int intNum) {
		this.intNum = intNum;
	}
	public int getIntKor() {
		return intKor;
	}
	
	// intKor member������
	// ���ʿ��� ���� �Է�(�߰�, �Ҵ�)�Ǵ� ���� ���� ���� ��ġ
	public void setIntKor(int intKor) {
		if(intKor <0 || intKor >100) {
			System.out.println("�Էµ� ���� : "+intKor);
			System.out.println("���������� 0~100������ �Է� �����մϴ�.");
			return ;
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
	public int getIntSum() {
		return intSum;
	}
	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}
	public int getIntAvg() {
		return intAvg;
	}
	public void setIntAvg(int intAvg) {
		this.intAvg = intAvg;
	}
	
	
	
}
