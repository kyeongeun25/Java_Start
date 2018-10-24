package com.biz.ap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "src/com/biz/ap/data1.txt";

		// fileReader 처럼 try catch문이 강제 조건인 경우 
		// try를 실행하기 전에 객체, 변수 등을 미리 선언해 두는 것이 좋다.
		FileReader fileReader = null;
		BufferedReader buffer = null;
		int intSum = 0;
		
		try {
			// 생성자를 실행 할 때 exception이 발생하므로 
			// fileReader의 선언은 미리 해두고 
			// 생성부분만 try 구문 내에서 실행한다.
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			String line = new String();
			
			while(true) {
				line = buffer.readLine();
				if(line == null)break;
				intSum += Integer.valueOf(line);
			}
			buffer.close();
			fileReader.close();
			
		}/* catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		// catch Exception은 등급이 있어서
		// 높은 등급의 handling이 아래에 있어야 한다.
		// 높은 등급이 위쪽에 있으면
		// 낮은 등급의 다른 handling을 모두 무시해 버린다.
		} */ catch(Exception e) {
			
		}
		System.out.println("합계 : "+intSum);
	}

}
