package com.biz.be_05;

public class Be_01 {

	/*
	 * 
	 * 2���� ������ ���ں����� �����ϰ�,
	 * ���� 10�� 20�� ���ڸ� �Ҵ��� ��
	 * ����, ����, ����, �������� ǥ���ϴ� 
	 * �ڵ带 �ۼ��մϴ�.
	 *
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNum1 =20;
		int intNum2 =10;
		
		System.out.println(intNum1+"+"+intNum2+"="+(intNum1+intNum2));
		System.out.println(intNum1+"*"+intNum2+"="+(intNum1*intNum2));
		System.out.println(intNum1+"-"+intNum2+"="+(intNum1-intNum2));
		System.out.println(intNum1+"/"+intNum2+"="+(intNum1/intNum2));
		
		String strName1 = "+";
		if(strName1=="+") {
			System.out.println(intNum1+"+"+intNum2+"="+(intNum1+intNum2));
		}
		
		System.out.println("���� : "+sum(intNum1, intNum2));
		
	}
	
	public static int sum(int num1, int num2) {
		return num1+num2;
	}

}
