package com.biz.ap;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 그림파일을 읽는데
 * fileInputStream에
 * BufferedInputStream연결해서
 * 파일을 읽기
 */
public class Ap_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "src/com/biz/ap/2018.jpg" ;

		FileInputStream fs = null;
		BufferedInputStream buffer = null ;
		
		try {
			// fs에서 직접 읽을 때는 int형으로 읽기
			fs = new FileInputStream(fileName) ;
			// buffer를 통해서 읽으면 
			// byte[] 단위로 읽는다.
			buffer = new BufferedInputStream(fs) ;
			
			// buffer로 부터 읽어서 보관 할 변수를 선언
			// 파일의 전체크기만큼의 byte 배열을 생성
			byte[] reader = new byte[fs.available()] ;
			// fs.available() : 파일의 전체 크기를 몇 byte인가 알려주는 method
			
			// 변수 = buffer.읽기();
			buffer.read(reader);
			// read() 메서드에게 전달되는 reader 바이트 배열은
			// 값의 복사본이 전달되는 것이 아니라
			// reader 바이트 배열이 있는 메모리 주소를 주는 것이다.
			// 그러면 read() 메서드는 buffer로부터 값을 읽어서
			// reader 바이트 배열의 메모리 영역에 데이터를 채워 넣는다.
			// 데이터를 모두 채웠다고 return값을 넘겨준다.
			// read()가 return하는 값은 데이터값이 아니고 reader에 채워넣은 데이터의 크기를 return
			// 실제 데이터는reader로부터 꺼내 쓰면 된다.
			
			for( byte b : reader ) {
				// 읽어들인 reader 배열의 각 요소들을
				// 16진수 문자열로 콘솔에 표시
				System.out.println(Integer.toHexString(b));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
