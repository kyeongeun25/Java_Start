package com.biz.be_05;

public class Be_05 {

	 /**
	  * ������ ���� �Ѱ��� �����ϰ�, 30�� �Ҵ� �� �� 
	  * 
	  * add() �޼��带 �����,
	  * add() �޼��忡 ������ �����Ѵ�.
	  * 
	  * add() �޼����
	  * ���� ���� ���� 10�� ���Ͽ� return �Ѵ�.
	  * 
	  * return ���� ���� �ֿܼ� ǥ���Ѵ�.
	  * @param args
	  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 30;
		System.out.println(num1+" + 10 = "+add(num1));
		int num2 = 20;
		System.out.println(num2+" + 10 = "+add(num2));
		
	}
	public static int add(int num1) {
		return num1+10;
	}

}
