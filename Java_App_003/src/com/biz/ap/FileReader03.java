package com.biz.ap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * data1.txt 파일을 읽어서
 * 전체 숫자들의 합계를 계산
 */
public class FileReader03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "src/com/biz/ap/data1.txt";
				
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader buffer = new BufferedReader(fileReader);
			
			String line = new String();
			
			int intSum = 0;
			while(true) {
				line = buffer.readLine();
				if(line == null)break;
				intSum += Integer.valueOf(line);
				
			}
			
			buffer.close();
			fileReader.close();
			
			System.out.println("합계 : "+intSum);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("점수 변환 과정에서 문제 발생");
		}
		// System.out.println("합계 : "+intSum);
	}

}
