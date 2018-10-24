package com.biz.ap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * data1.txt 파일을 읽어서
 * 값을 정수로 변환하고 
 * 전체 덧셈을 하고 
 * 전체 평균을 계산하는
 * 코드를 작성해 봅니다.
 */
public class FileReaderTest {

	public static void main(String[] args) {
		
		String fileName = "src/com/biz/ap/data1.txt";
		
		FileReader fileReader = null ;
		BufferedReader buffer = null ;
		int intSum = 0 ;
		int cnt = 0;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			String line = new String();
			
			while(true){
				
				line = buffer.readLine();
				if(line == null) break ;
				intSum += Integer.valueOf(line);
				cnt ++;
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			
		}
		System.out.println("합계 : "+intSum);
		System.out.println("평균 : "+intSum / cnt);

	}

}
