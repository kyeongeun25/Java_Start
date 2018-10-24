package com.biz.ap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * data.txt 파일을 한꺼번에 읽어서
 * 각 byte에 1을 더하고
 * data1.txt. 파일에 기록 
 */
public class Ap_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sourceFile = "src/com/biz/ap/data.txt" ;
		String targetFile = "src/com/biz/ap/data1.txt" ;
		
		// 파일읽기
		FileInputStream fi = null ;
		
		// 파일기록
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
			
			System.out.println("완료");
			
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
