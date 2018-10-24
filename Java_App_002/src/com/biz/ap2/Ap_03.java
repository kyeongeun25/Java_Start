package com.biz.ap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ap_03 {

	public static void main(String[] args) {

		String word = "Korea";
		String[] words = word.split("");
		
		// �迭�� �������� ����� �ϴµ�,
		// �迭�� ���� �������� ����� ����� �ڵ尡 �ȴ�.
		// Collections.shuffle()�� ����ϱ� ���ؼ�
		// �迭�� ArrayList�� ���
		
		ArrayList<String> ws = new ArrayList<String>();
		
		for(String s : words) {
			ws.add(s);
		}
		
		Collections.shuffle(ws);
		
		System.out.println("���� ���ĺ��� �ùٸ� �ܾ�� ? ");
		for(String s : ws) {
			System.out.print(s+", ");
		}
		
		// Ű����� �Է¹ޱ�
		Scanner scanner = new Scanner(System.in);
		String key = scanner.nextLine();
		
		if(key.equalsIgnoreCase(word)) {
			System.out.println("����!");
		}else {
			System.out.println("����!");
		}
		
		

	}

}
