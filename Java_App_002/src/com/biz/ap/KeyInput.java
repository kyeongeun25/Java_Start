package com.biz.ap;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class KeyInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Console : 모니터와 키보드
		// Console 출력 : Console out
		System.out.println();
		OutputStream os = System.out;
		((PrintStream) os).println();
		
		
		// Console로 부터 입력
		// 실제로 키보드로 부터 이진수로 된 코드, 신호를
		// 입력받는 클래스
		InputStream is = System.in ;
		Scanner scanner = new Scanner(is);
		
		Scanner scanner1  = new Scanner(System.in);
		// is로부터 입력된 스트림 데이터를 모아 완성한 후
		// 문자열, 숫자 등을 꺼내 쓸 수 있도록 scanner에게 전달
		
		// scanner로 부터 문자열을 꺼내기
		String key = scanner.nextLine();
		// 이 명령문이 실행되면 사용자로부터 키보드가 입력되기를 기다림
		// 어떤 문자열 등을 입력한 후 Enter키를 입력 할 때까지 
		// 마냥 기다리기만 한다.
		
		System.out.println(key);		
		
		
		
		while(true) {} // 무한반복 blocking
		// 프로그램이 실행되다가 멈추고 더 이상 앞으로 진행되지 않는 상태
		
		
		
		
		
		
		
		
		
	}

}
