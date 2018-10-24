package com.biz.ap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 영문이름.txt 파일을 읽어서
 * 영문이름을 가져오고
 * 
 * 학번 : 영문이름 : 국어점수 : 영어점수 : 수학점수를 만들어서
 * 성적표.txt 파일에 저장
 */
public class Grade01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String readFile = "src/com/biz/ap/영문이름.txt" ;
		String writeFile = "src/com/biz/ap/성적표.txt" ;
		
		FileReader fileReader = null ;
		BufferedReader rBuffer = null ;
		
		FileWriter fileWriter = null ;
		BufferedWriter wBuffer = null ;
		
		try {
			fileReader = new FileReader(readFile);
			rBuffer = new BufferedReader(fileReader);
			
			fileWriter = new FileWriter(writeFile);
			wBuffer = new BufferedWriter(fileWriter);
			
			String line = new String();
			int num = 0;
			while(true) {
				line = rBuffer.readLine();
				if(line == null) break ;
				
				num ++;
				int intKor = (int)(Math.random()*(100-50)+50);
				int intEng = (int)(Math.random()*(100-50)+50);
				int intMath = (int)(Math.random()*(100-50)+50);
				
				String writeLine = String.valueOf(num); //학번
				writeLine += ":" + line ;				// 추출된영문이름
				writeLine += ":" +String.valueOf(intKor);
				writeLine += ":" +String.valueOf(intEng);
				writeLine += ":" +String.valueOf(intMath);
				wBuffer.write(writeLine);
				wBuffer.newLine();
				
				
				
			}
			wBuffer.flush();
			wBuffer.close();
			fileWriter.close();
			
			rBuffer.close();
			fileReader.close();
			
			System.out.println("성적표 작성 완료");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
