package com.biz.ap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ap_03 {

	public static void main(String[] args) {

		String word = "Korea";
		String[] words = word.split("");
		
		// 배열을 무작위로 섞어야 하는데,
		// 배열을 직접 섞으려면 상당히 어려운 코드가 된다.
		// Collections.shuffle()을 사용하기 위해서
		// 배열을 ArrayList에 담기
		
		ArrayList<String> ws = new ArrayList<String>();
		
		for(String s : words) {
			ws.add(s);
		}
		
		Collections.shuffle(ws);
		
		System.out.println("다음 알파벳의 올바른 단어는 ? ");
		for(String s : ws) {
			System.out.print(s+", ");
		}
		
		// 키보드로 입력받기
		Scanner scanner = new Scanner(System.in);
		String key = scanner.nextLine();
		
		if(key.equalsIgnoreCase(word)) {
			System.out.println("정답!");
		}else {
			System.out.println("오답!");
		}
		
		

	}

}
