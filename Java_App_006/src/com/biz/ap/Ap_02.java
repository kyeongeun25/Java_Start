package com.biz.ap;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * �׸������� �дµ�
 * fileInputStream��
 * BufferedInputStream�����ؼ�
 * ������ �б�
 */
public class Ap_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "src/com/biz/ap/2018.jpg" ;

		FileInputStream fs = null;
		BufferedInputStream buffer = null ;
		
		try {
			// fs���� ���� ���� ���� int������ �б�
			fs = new FileInputStream(fileName) ;
			// buffer�� ���ؼ� ������ 
			// byte[] ������ �д´�.
			buffer = new BufferedInputStream(fs) ;
			
			// buffer�� ���� �о ���� �� ������ ����
			// ������ ��üũ�⸸ŭ�� byte �迭�� ����
			byte[] reader = new byte[fs.available()] ;
			// fs.available() : ������ ��ü ũ�⸦ �� byte�ΰ� �˷��ִ� method
			
			// ���� = buffer.�б�();
			buffer.read(reader);
			// read() �޼��忡�� ���޵Ǵ� reader ����Ʈ �迭��
			// ���� ���纻�� ���޵Ǵ� ���� �ƴ϶�
			// reader ����Ʈ �迭�� �ִ� �޸� �ּҸ� �ִ� ���̴�.
			// �׷��� read() �޼���� buffer�κ��� ���� �о
			// reader ����Ʈ �迭�� �޸� ������ �����͸� ä�� �ִ´�.
			// �����͸� ��� ä���ٰ� return���� �Ѱ��ش�.
			// read()�� return�ϴ� ���� �����Ͱ��� �ƴϰ� reader�� ä������ �������� ũ�⸦ return
			// ���� �����ʹ�reader�κ��� ���� ���� �ȴ�.
			
			for( byte b : reader ) {
				// �о���� reader �迭�� �� ��ҵ���
				// 16���� ���ڿ��� �ֿܼ� ǥ��
				System.out.println(Integer.toHexString(b));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
