package com.biz.ap;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 2018.jpeg 그림파일을 읽어서 
 * 다시 2018_copy.jpeg 파일에 기록
 * 
 * >>> 파일 복사하기
 */
public class Ap_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sourceFile = "src/com/biz/ap/2018.jpg" ;
		String targetFile = "src/com/biz/ap/2018_copy.jpg" ;
		
		// 파일 읽기 클래스 선언
		FileInputStream fi = null ;
		BufferedInputStream bInput = null ;
		
		// 파일 기록 클래스 선언
		FileOutputStream fo = null ;
		BufferedOutputStream bOut = null ;
		
		
		try {
			// 읽기 클래스 생성
			fi = new FileInputStream(sourceFile) ;
			bInput = new BufferedInputStream(fi) ;
		
			// 기록 클래스 생성
			fo = new FileOutputStream(targetFile);
			bOut = new BufferedOutputStream(fo);
		
			// 읽기용 byte 배열을 생성
			byte[] reader = new byte[1024] ;			// 1Kbyte 단위로 설정한다.
			
			// byte가 1Kbyte 단위 이므로 반복문을 이용해서 파일을 읽어 들여야 한다.
			while(true) {
				// 파일을 정상으로 읽으면 1024가 return
				// 파일을 다 읽었으면 -1을 return
				if(bInput.read(reader) < 0) break;
				
				// 파일 내용을 기록
				bOut.write(reader);
			}
			
			// 읽기용은 사용 후 닫지 않아도 큰 문제가 없지만
			// 기록용은 반드시 flush() 하고, 닫아 주어야 한다.
			bOut.flush();
			bOut.close();
			fo.close();
			
			
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
