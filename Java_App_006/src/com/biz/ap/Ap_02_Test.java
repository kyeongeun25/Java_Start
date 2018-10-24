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

public class Ap_02_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "src/com/biz/ap/2018.jpg" ;
		
		FileInputStream fs = null ;
		BufferedInputStream buffer = null ;
		
		try {
			fs = new FileInputStream(fileName) ;
			buffer = new BufferedInputStream(fs) ;
			byte[] reader = new byte[fs.available()] ;
			
			buffer.read(reader) ;
			
			for(byte b : reader) {
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
