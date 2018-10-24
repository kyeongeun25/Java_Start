package com.biz.ap;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * data.txt 파일을
 * FileInputStream과
 * BufferedInputStream을 이용해서 읽어보자
 * 
 * text 파일이지만
 * 어떤이유로 파일이 손상되어
 * 메모장으로 읽지 못하는데,
 * 일부라도 내용을 확인하고자 할 때
 * 사용하는 방법이기도 합니다.
 */
public class Ap_03 {

	public static void main(String[] args) {
		
		String fileName = "src/com/biz/ap/data.txt" ;
		
		FileInputStream fs = null ;
		BufferedInputStream buffer = null ;
		
		try {
			fs = new FileInputStream(fileName) ;
			buffer = new BufferedInputStream(fs) ;
			
			// 파일을 읽어서 담을 변수를 선언
			// byte[]로 선언한다.
			byte[] reader = new byte[fs.available()] ;
			buffer.read(reader) ;
			
			// byte배열의 내용을 문자열로 바꾸어라
			String text = new String(reader);
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
