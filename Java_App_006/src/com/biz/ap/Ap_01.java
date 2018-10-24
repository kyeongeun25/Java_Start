package com.biz.ap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 그림파일 2018.jpeg를 읽어서
 * 읽힌 내용을 콘솔에 표시해보자
 * 
 * 단, 내용이 어떤 것인지는 확인 할 수 없고
 * 단지 byte 단위의 코드값만 확인가능
 */
public class Ap_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "src/com/biz/ap/2018.jpg" ;
		
		// BIN 파일을 읽을 때는
		// FileInputStream이라는 클래스를 일단 사용해서
		// 파일을 open
		FileInputStream fs = null ;	// 객체선언
		
		try {
			fs = new FileInputStream(fileName) ;
			// byte단위로 읽어서 내용을 콘솔에 표시
			// byte단위로 읽을 때는 읽어서 보관할 변수를
			// byte형이나, char형으로 선언을 한다.
			// int형으로 선언해도 문제는 없다.
			// int형은 기본 크기가 4byte
			// byte, char 크기가 1byte
			char aChar = 0 ;
			int intChar = 0;
			while(true) {
				
				// read() 메서드는
				// BIN 파일을 1byte씩 반복적으로 읽는데
				// 만약 파일의 끝에 다다르면
				// -1이 나타난다.
				intChar = fs.read();	// 1byte만 읽어서
				
				// intChar 값이 0미만이면
				// 파일을 모두 읽었다.
				if(intChar < 0) break ;
				System.out.print(intChar+"\t");	// 화면에 표시
				System.out.println(Integer.toHexString(intChar));	// 정수값을 16진수 문자열 형태로 변환해서 보여주기
				
			}
			
			
			fs.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
