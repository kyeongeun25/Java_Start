package com.biz.ap;

import java.util.Scanner;

public class KeyInput_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		// ���ڸ� ���� ���������� �Է� ���� ���� �ִ�
		System.out.println("����1>>");
		int num1 = scanner.nextInt();
		// nextInt()�� nextLine()�� �������� ����ϸ�
		// nextInt()������ nectLine()�� �ǳʶٴ� ������ �ִ�.
		// �׷��� nextInt() ��� ����.
		
		
		System.out.println("����2>>");
		String num2 = scanner.nextLine();
		int intNum2 = Integer.valueOf(num2);
		
	}

}
