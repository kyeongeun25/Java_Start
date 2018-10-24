package com.biz.ap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 영어이름.txt 파일을 읽어서
 * 영문 이름만 추출
 */
public class FileReader01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "src/com/biz/ap/영어이름.txt" ;
		
		FileReader fileReader = null ;
		BufferedReader buffer = null ;
		
		try {
			fileReader = new FileReader(fileName) ;
			buffer = new BufferedReader(fileReader) ;
			
			String line = new String();
			
			while(true) {
				line = buffer.readLine();			
				if(line == null)break;
				
				String[] names = line.split(":");
				System.out.print(names[0]+"\t"); // 번호
				System.out.println
				
				(names[1]+"\t"); // 영문이름
				// System.out.println(names[2]);
				
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
