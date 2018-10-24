package com.biz.ap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader02 {

	public static void main(String[] args) {

		String fileName = "src/com/biz/ap/data.txt" ;
	
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader buffer = new BufferedReader(fileReader);
			
			String line = new String();
			while(true) {
				line = buffer.readLine();
				if(line == null)break;
				System.out.println(line);
				
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일을 열 수 없음");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일 읽기 문제 발생");
		}

	}

}
