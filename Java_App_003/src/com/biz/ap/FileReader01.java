package com.biz.ap;

import java.io.FileReader;

/*
 * com.biz.ap 패키지내에 있는
 * data.txt 파일을 읽어서
 * 내용을 콘솔에 표시
 * 
 * 파일 읽기 절차
 * 1. 파일이 어디에 있는지 알아야 한다.
 * 		- 실제 물리적 파일이 있는 곳을 알아야 한다.
 * 2. 파일 열기
 * 3. 파일 내용 읽기
 * 4. 파일 닫기
 * 		- java 1.7 이상에서는 자동으로 닫히기는 하나, 
 * 		 열어 놓은 파일은 가급적 닫아주는 것이 좋다.
 * 5. 파일 내용 화면에 출력
 */

public class FileReader01 {

	public static void main(String[] args) {
		
		// 읽을 파일의 물리적 위치, 파일이름
		String fileName = "src/com/biz/ap/data.txt" ;
		
		// 파일을 읽기 위해서 열기
		// FileReader라는 JDK 클래스를 사용한다. p807
		// FileReader fileReader = new FileReader(fileName);
		
		int num = 0;
		num = Integer.valueOf("10");
		
		try {
			num = Integer.valueOf(" 10");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("숫자 앞, 뒤, 사이에 문자열이 포함되면 안됨");
		}
		// try는 안에 들어있는 코드를 한번 실행해 보고
		// 만약 exception이 발생한다면
		// 그 exception이 무엇인지 확인하라
		// Java 기본내장된 method()
		 
		// num = Integer.valueOf(" 10");
		// 위 코드는 보기에는 별 문제가 없어 보이는데
		// 숫자 앞에 빈칸(space)가 있어서
		// 숫자로 변환 할 수 없다는 exception을 발생시킨다.
		// 사용자에게 프로젝트를 배포했을 때 이런 exception이 발생하면
		// 사용자는 프로젝트(프로그램)에 신뢰성을 의심할 것이다.
		// 개발자는 이런 경우가 발생할지도 모르는 부분에
		// 임의로 exception handling이란 것을 처리해서
		// 사용자에게 도움말을 주어야 한다.
		
		
		
		
		
		
		
		
		
		
		
	}

}
