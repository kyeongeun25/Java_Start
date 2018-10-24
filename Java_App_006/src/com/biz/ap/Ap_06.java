package com.biz.ap;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * data1.txt 파일을 읽어서
 * 화면에 보이기
 */
public class Ap_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String targetFile = "src/com/biz/ap/data1.txt" ;
		FileInputStream fi = null ;
		BufferedInputStream buffer = null ;
		
		try {
			fi = new FileInputStream(targetFile) ;
			buffer = new BufferedInputStream(fi);
			
			byte[] reader = new byte[fi.available()];
			buffer.read(reader) ;
			
			
			for(int i = 0 ; i < reader.length ; i++) {
				reader[i] -= 1 ;
			}
			
			String text = new String(reader) ;
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
