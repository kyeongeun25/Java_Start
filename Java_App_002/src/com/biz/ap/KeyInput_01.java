package com.biz.ap;

import java.util.Scanner;

public class KeyInput_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ű����� ���� ���ڿ��� �Է� ��������
		Scanner scanner  = new Scanner(System.in);
		
		// Ű �ԷµǱ� ����
		// ����ڿ��� ������ �ؾ� ������ �Ʒ��ִ� �޽���
		// prompt��� �Ѵ�.
		System.out.println("���ڿ��� �Է��ϼ��� >>");
		// �Է´��
		String key1 = scanner.nextLine();
		// �Է´�� �� ���ڿ��� �Է��ϰ� enter ������
		// key ������ ���ڿ��� �����ϰ� 
		// �������� ����
		
		System.out.println("���ڿ��� �� �Է��ϼ��� >>");
		String key2 = scanner.nextLine();
		
		System.out.println("�Է��� ���ڿ��� : "+key1+key2);
		
		scanner.close();
	}

}
