package com.biz.ap;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class KeyInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Console : ����Ϳ� Ű����
		// Console ��� : Console out
		System.out.println();
		OutputStream os = System.out;
		((PrintStream) os).println();
		
		
		// Console�� ���� �Է�
		// ������ Ű����� ���� �������� �� �ڵ�, ��ȣ��
		// �Է¹޴� Ŭ����
		InputStream is = System.in ;
		Scanner scanner = new Scanner(is);
		
		Scanner scanner1  = new Scanner(System.in);
		// is�κ��� �Էµ� ��Ʈ�� �����͸� ��� �ϼ��� ��
		// ���ڿ�, ���� ���� ���� �� �� �ֵ��� scanner���� ����
		
		// scanner�� ���� ���ڿ��� ������
		String key = scanner.nextLine();
		// �� ��ɹ��� ����Ǹ� ����ڷκ��� Ű���尡 �ԷµǱ⸦ ��ٸ�
		// � ���ڿ� ���� �Է��� �� EnterŰ�� �Է� �� ������ 
		// ���� ��ٸ��⸸ �Ѵ�.
		
		System.out.println(key);		
		
		
		
		while(true) {} // ���ѹݺ� blocking
		// ���α׷��� ����Ǵٰ� ���߰� �� �̻� ������ ������� �ʴ� ����
		
		
		
		
		
		
		
		
		
	}

}
