package com.biz.ap;

import java.util.Scanner;

/*
 * ���� 1���� �Է¹޾Ƽ�
 * 1���� ���ڱ��� ������ ���
 * */
public class KeyInput_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�����Է�>> ");
		
		String num = scanner.nextLine();
		
		// ���ڿ��� ������ ����
		int intNum = Integer.valueOf(num);
		
		if(intNum < 1) {
			System.out.println("1���� ū���� �Է����ּ���.");
		}else {
			int intSum  = 0;
			for(int i = 1 ; i <= intNum ; i++) {
				intSum += i;
			}
			System.out.println("�հ� : "+intSum);
		}
		
		
		
		
	}

}
