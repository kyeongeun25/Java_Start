package com.biz.be_06;

public class Be_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int�� Integer�� ���� �����͸� �ְ� ���� �� �ִ�.
		Integer num1 = 0; // Integer ����
		Integer num2 = 0;
		
		num1 = 30;
		num2 = 20;
		
		System.out.println(num1 + num2); // 50
		System.out.println(num1.toString()+num2.toString()); // 3020
		
		// Integer�� int�� Ŭ������(type)
		// 	int�� �������� ����� Ȯ��, �߰��ϱ� ���ؼ�
		// 	JDK�� ���Ե� ������ Ŭ����
		
		System.out.println(num1.toString());
		// >> ������ Ŭ����(Integer class)���� ���� ���� ���Ǵ�
		// 		method�� ������ ���ڿ� ���·� �ٲپ� �ش�.
		
		num1 = 19293919 ; 
		// Integer���� String ������ �����ϰ�
		String strNum = num1.toString();
		
		// ���ڿ��� 1�ڸ��� ����
		// >> substring()�� ����ؼ� ����
		int intSum = 0 ;
		for( int i = 0; i <strNum.length();i++) {
			
			// String.substring() ���ڸ��� ���ڿ� ����
			String s = strNum.substring(i, i+1);
			
			// ���ڿ��� ���ڷ� �ٲ۴�.
			int intNum = Integer.valueOf(s); // s��� ������ ��� "������ ���ڿ�"��
											// ���������� �ٲٴ� ��
			intSum += intNum;
			
		}
		System.out.println(intSum);
		
	}

}
