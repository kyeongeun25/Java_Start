package com.biz.ap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * data.txt ������ �Ѳ����� �о
 * �� byte�� 1�� ���ϰ�
 * data1.txt. ���Ͽ� ��� 
 */
public class Ap_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sourceFile = "src/com/biz/ap/data.txt" ;
		String targetFile = "src/com/biz/ap/data1.txt" ;
		
		// �����б�
		FileInputStream fi = null ;
		
		// ���ϱ��
		FileOutputStream fo = null ;
		
		try {
			fi = new FileInputStream(sourceFile) ;
			fo = new FileOutputStream(targetFile) ;
			
			int reader = 0;
			while(true) {
				
				reader = fi.read() ;
				if(reader < 0) break ;
				reader += 1;
				fo.write(reader);
						
			}
			fo.flush();
			fo.close();
			
			System.out.println("�Ϸ�");
			
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
