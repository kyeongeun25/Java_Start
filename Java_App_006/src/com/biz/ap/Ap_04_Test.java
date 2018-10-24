package com.biz.ap;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 2018.jpeg �׸������� �о 
 * �ٽ� 2018_copy.jpeg ���Ͽ� ���
 * 
 * >>> ���� �����ϱ�
 */

public class Ap_04_Test {

	public static void main(String[] args) {
			
		String sourceFile = "src/com/biz/ap/2018.jpg" ;
		String targetFile = "src/com/biz/ap/2018_copy2.jpg" ;
		
		FileInputStream fi = null ;
		BufferedInputStream bInput = null ;
		
		FileOutputStream fo = null ;
		BufferedOutputStream bOutput = null ;
		
		try {
			fi = new FileInputStream(sourceFile) ;
			bInput = new BufferedInputStream(fi) ;
			
			fo = new FileOutputStream(targetFile) ;
			bOutput = new BufferedOutputStream(fo) ;
			
			byte[] reader = new byte[1024] ;
			
			while(true) {
				if(bInput.read(reader) < 0) break;
				bOutput.write(reader);
			}
			bOutput.flush();
			bOutput.close();
			fo.close();
			
			System.out.println("����Ϸ�");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
