package com.biz.ap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "src/com/biz/ap/data.txt" ;
		
		try {
			// 파일 열기
			FileReader fileReader = new FileReader(fileName);
			// 정상적으로 파일이 열리면
			// fileReader는 운영체제와 읽기 코드 사이에서
			// 파일 정보, 파일 내용을 교환 할 수 있도록 역할을 한다.
			
			// 파일 읽기
			// 1. 파일을 한줄 씩 읽어서 문자열에 저장하기 위해
			//		문자열 변수를 선언
			// String line = "";		// 1.8 이상에서는 정상
			String line = new String();
			
			// 2. 한줄 읽기 실행 준비
			// 		fileReader.read()는 파일로 부터 코드 단위로 읽기 실행을 한다.
			// 		읽어 들인 코드를 한줄의 문자열로 변환시키기 위해
			//		또 다른 클래스의 도움을 받아야 한다.
			// line = fileReader.read();
			BufferedReader buffer = new BufferedReader(fileReader);
			
			// fileReader는 파일 내용을 모두 읽어서 BufferedReader에게 전달해주고
			// BufferedReader는 파일 내용을 문자열 형태로 바꾸어서 buffer에 저장해 놓는다.
			
			
			while(true) {
				// 3. 한줄 씩 읽기(한줄만)
				// buffer.readLine()은 한번 실행 될 때마다
				// buffer로부터 한줄 씩 읽어서 line변수에 저장
				line = buffer.readLine();
				if(line == null) break;
				// 4. 읽은 내용 콘솔에 표시
				System.out.println(line);
		
			}
			
				
			// System.out.println(buffer.readLine());
			// System.out.println(buffer.readLine());
			// System.out.println(buffer.readLine());
			
			// 최신 자바에서는 자동으로 close를 시키지만
			// 가급적 close() 메서드를 실행 해 주는 것이 좋다.
			// 닫을 때는 buffer >> fileReader 순으로 닫는 것이 좋다.
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(fileName + "파일이 없네요");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일 읽기 중 문제 발생");
		}
		
	}

}
