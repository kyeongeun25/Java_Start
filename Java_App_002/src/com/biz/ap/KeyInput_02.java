package com.biz.ap;

import java.util.Scanner;

public class KeyInput_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����1�Է�>>");
		String num1 = scanner.nextLine();
		// ���ڿ��� �Էµ� ���ڸ� 
		// 4Ģ���꿡�� ���Ǵ� ���������� �ٲپ
		// ���꿡 ����� �ؾ��Ѵ�.
		
		int intNum1 = Integer.valueOf(num1);
		// num1�� ��� ���ڿ��� ���ڸ� ���������� ����
		float fNum1 = Float.valueOf(num1);
		// �Ǽ������� ����
		
		System.out.print("����2�Է�>>");
		String num2 = scanner.nextLine();
		int intNum2 = Integer.valueOf(num2);			
		
		System.out.println(num1+num2);
		System.out.println(intNum1+intNum2);
	}

}
