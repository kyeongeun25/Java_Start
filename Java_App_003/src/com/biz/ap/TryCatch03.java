package com.biz.ap;

import java.util.Scanner;

/*
 *  Ű���忡�� ���ڸ� �Է¹޾Ƽ�
 *  ������ ��� �����ϴ� �ڵ带 �ۼ�
 *  END ���ڿ��� �ԷµǸ� ����� ȭ�鿡 ���
 */

public class TryCatch03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int intSum = 0;
		
		while(true) {
			
			System.out.print("���� >> ");
			String num = scanner.nextLine();
			
			if(num.equals("END"))break;
			try {
			
				intSum += Integer.valueOf(num);
				
			} catch (Exception e) {
				
				System.out.println("���ڰ� �ƴ� ���� �ԷµǾ��׿�.");
				System.out.println("�ٽ� �Է��ϼ���.");
				
			}
		}
		System.out.println("�հ� : "+intSum);
	}
}
