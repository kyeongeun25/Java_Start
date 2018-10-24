package com.biz.ap2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * 5개의 단어 중에서 임의의 단어를 선정하고
 * 그 단어의 알파벳을 무작위로 배열한 후 보여주고
 * 올바른 단어를 맞추는 게임
 */
public class Ap_04 {

	public static void main(String[] args) {
		
		// 단어를 담을 ArrayList를 만든다
		ArrayList<String> words = new ArrayList<String>();
		words.add("korea");
		words.add("america");
		words.add("africa");
		words.add("ostria");
		words.add("russia");
		
		// scanner 생성문을 반복문 내에서 사용하지 않도록
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			Collections.shuffle(words);
			String[] qw = words.get(0).split("");
			
			// Arrays 클래스의 asList() 메서드는 
			// qw 배열을 ArrayList로 변환시키는 기능
			ArrayList<String> arrStr = new ArrayList<String>(Arrays.asList(qw));
			// >> 배열을 ArrayList로 만드는 방법
			
			Collections.shuffle(arrStr);
			
			System.out.println("다음에 제시된 알파벳의 맞는 단어는?");
			System.out.println("~END는 게임 종료");
			
			// ArrayList를 println으로 콘솔 출력을 하면
			// ArrayList 요소 모두를 한줄로 표시한다.
			System.out.println(arrStr);
			
			String keyIn = scanner.nextLine();
			if(keyIn.equals("~END"))break;
			
			if(keyIn.equalsIgnoreCase(words.get(0))){
				System.out.println("정답!");
			}else {
				System.out.println("오답!");
				System.out.println("정답 : "+words.get(0));
			}
			
		}// while이 끝나는 부분
		System.out.println("게임 오버~~");
		

	}

}
