package com.biz.ap;

import java.util.Scanner;

/*
 * 5���� ū ���� �Է¹޾Ƽ�
 * 1���� ������ ������ ����
 * 
 * ���� 5������ ���� �Է��ϸ�
 * �޽����� �����ְ�
 * �ٽ� �Է¹޵��� �ڵ带 �ۼ�
 * 
 */
public class KeyInput_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("5���� ū �� >>");
			String strNum = scanner.nextLine();
			
			int intNum = Integer.valueOf(strNum);
			if(intNum <= 5) {
				System.out.println("5���� ū ���� �Է��ϼ���.");
				continue ;
			}
			int intSum = 0;
			for(int i = 0 ; i <= intNum ; i++) {
				intSum += i;
			}
			System.out.println("�հ� : "+intSum);
			break;
		}
		
	}

}
