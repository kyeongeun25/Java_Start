package com.biz.ap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * �׸����� 2018.jpeg�� �о
 * ���� ������ �ֿܼ� ǥ���غ���
 * 
 * ��, ������ � �������� Ȯ�� �� �� ����
 * ���� byte ������ �ڵ尪�� Ȯ�ΰ���
 */
public class Ap_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "src/com/biz/ap/2018.jpg" ;
		
		// BIN ������ ���� ����
		// FileInputStream�̶�� Ŭ������ �ϴ� ����ؼ�
		// ������ open
		FileInputStream fs = null ;	// ��ü����
		
		try {
			fs = new FileInputStream(fileName) ;
			// byte������ �о ������ �ֿܼ� ǥ��
			// byte������ ���� ���� �о ������ ������
			// byte���̳�, char������ ������ �Ѵ�.
			// int������ �����ص� ������ ����.
			// int���� �⺻ ũ�Ⱑ 4byte
			// byte, char ũ�Ⱑ 1byte
			char aChar = 0 ;
			int intChar = 0;
			while(true) {
				
				// read() �޼����
				// BIN ������ 1byte�� �ݺ������� �дµ�
				// ���� ������ ���� �ٴٸ���
				// -1�� ��Ÿ����.
				intChar = fs.read();	// 1byte�� �о
				
				// intChar ���� 0�̸��̸�
				// ������ ��� �о���.
				if(intChar < 0) break ;
				System.out.print(intChar+"\t");	// ȭ�鿡 ǥ��
				System.out.println(Integer.toHexString(intChar));	// �������� 16���� ���ڿ� ���·� ��ȯ�ؼ� �����ֱ�
				
			}
			
			
			fs.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
