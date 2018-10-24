package com.biz.ap;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*
 *  Text 파일을 만들 때 
 *  FileWriter외에 PrintWriter라는 클래스를 사용하기도 한다.
 */
public class Ap_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "src/com/biz/ap/data2.txt" ;
		
		// JDK7 까지 주로 사용하던 Text 파일 기록 클래스
		PrintWriter printWriter = null ;
		
		try {
			printWriter = new PrintWriter(fileName) ;
			
			for(int i = 1 ; i <= 100 ; i++) {
				printWriter.print(i);
				printWriter.print(" : ");
				int kor = (int)(Math.random()*(100-50)+50) ;
				printWriter.println(kor);
			}
			printWriter.flush();
			printWriter.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
