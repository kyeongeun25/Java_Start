package com.biz.ap2;

import java.util.Scanner;

/*
 * 문자열이 korea 일 때
 * 이 문자열을 낱개로 분해 해서 뒤섞은 뒤 보여주고
 * 올바른 문자열을 입력하면 정답
 * 아니면 오답이라고 표시하는 간단한 게임
 */
public class Ap_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "Korea";
		// String 클래스에는 문자열을 낱개로 분리하는 method()가 있다.
		// String.split(기준);
		// 		String을 기준 문자열로 나누어 배열로 만들어주는 method()
		String w1 = "우:리:나:라:만:세";
		String[] ws = w1.split(":");
		String[] words = word.split("");
		
		// ws 개수가 몇개냐
		System.out.println(ws.length);
		
		// 내용확인
		for(String s : ws) {
			System.out.println(s);
		}
		
		System.out.println(words.length);
		for(String s : words) {
			System.out.println(s);
		}
		
		Scanner scanner = new Scanner(System.in);
		
	}

}
