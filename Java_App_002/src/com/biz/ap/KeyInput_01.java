package com.biz.ap;

import java.util.Scanner;

public class KeyInput_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 키보드로 부터 문자열을 입력 받으려면
		Scanner scanner  = new Scanner(System.in);
		
		// 키 입력되기 전에
		// 사용자에게 무엇을 해야 할지를 아려주는 메시지
		// prompt라고 한다.
		System.out.println("문자열을 입력하세요 >>");
		// 입력대기
		String key1 = scanner.nextLine();
		// 입력대기 중 문자열을 입력하고 enter 누르면
		// key 변수에 문자열을 저장하고 
		// 다음으로 진행
		
		System.out.println("문자열을 또 입력하세요 >>");
		String key2 = scanner.nextLine();
		
		System.out.println("입력한 문자열들 : "+key1+key2);
		
		scanner.close();
	}

}
