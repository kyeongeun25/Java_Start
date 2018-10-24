package com.biz.ap;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * data.txt ������
 * FileInputStream��
 * BufferedInputStream�� �̿��ؼ� �о��
 * 
 * text ����������
 * ������� ������ �ջ�Ǿ�
 * �޸������� ���� ���ϴµ�,
 * �Ϻζ� ������ Ȯ���ϰ��� �� ��
 * ����ϴ� ����̱⵵ �մϴ�.
 */
public class Ap_03 {

	public static void main(String[] args) {
		
		String fileName = "src/com/biz/ap/data.txt" ;
		
		FileInputStream fs = null ;
		BufferedInputStream buffer = null ;
		
		try {
			fs = new FileInputStream(fileName) ;
			buffer = new BufferedInputStream(fs) ;
			
			// ������ �о ���� ������ ����
			// byte[]�� �����Ѵ�.
			byte[] reader = new byte[fs.available()] ;
			buffer.read(reader) ;
			
			// byte�迭�� ������ ���ڿ��� �ٲپ��
			String text = new String(reader);
			System.out.println(text);
			
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
