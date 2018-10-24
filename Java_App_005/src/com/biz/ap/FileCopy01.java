package com.biz.ap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 영어이름.txt파일을 읽어서
 * 영문이름만 추출해서
 * 영문이름.txt파일에 저장
 */
public class FileCopy01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String readFile = "src/com/biz/ap/영어이름.txt" ;
		String writeFile = "src/com/biz/ap/영문이름.txt" ;
		
		// 읽기용 클래스
		FileReader fileReader = null ;
		BufferedReader rBuffer = null ;
		
		// 저장용 클래스
		FileWriter fileWriter = null ;
		BufferedWriter wBuffer = null ;
		
		try {
			fileReader = new FileReader(readFile) ;
			rBuffer = new BufferedReader(fileReader) ;
			
			fileWriter = new FileWriter(writeFile);
			wBuffer = new BufferedWriter(fileWriter);
			
			String line = new String();
			while(true) {
				line = rBuffer.readLine();
				if(line == null) break ;
				
				String names[] = line.split(":");
				
				// names[1] 영문이름이 저장되어 있다.
				
				wBuffer.write(names[1]);
				wBuffer.newLine();
				
			}
			wBuffer.flush();
			wBuffer.close();
		
			fileWriter.close();
			rBuffer.close();
			fileReader.close();
			
			System.out.println("파일 복사 완료");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
