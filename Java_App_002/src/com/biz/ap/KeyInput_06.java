package com.biz.ap;

import java.util.Scanner;

/*
 * 5���� ū ���� �Է¹ް�
 * 1���� ������ ������ ����
 * 
 * ���� 5�̸��� ���� �Է��ϸ�
 * �޽����� �����ְ� �ٽ� �Է¹޾Ƽ� ����
 * 
 * ���� END�� �Է��ϸ�
 * �׸��ϰ� �����ϱ�
 */
public class KeyInput_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("5���� ū�� >>");
			String strNum = scanner.nextLine();
			if(strNum.equals("END")) {
				System.out.println("�����մϴ�.");
				break;
			}
			
			int intNum = Integer.valueOf(strNum);
			if(intNum <= 5) {
				System.out.println("5���� ū ���� �Է��ϼ���.");
				continue ;
			}
			int intSum = 0;
			for(int i = 0 ; i <= intNum ; i++) {
				intSum += i ;
			}
			System.out.println("1���� "+intNum+"���� �հ� : "+intSum);
		}
		
	}

}
