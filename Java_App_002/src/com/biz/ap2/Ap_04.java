package com.biz.ap2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * 5���� �ܾ� �߿��� ������ �ܾ �����ϰ�
 * �� �ܾ��� ���ĺ��� �������� �迭�� �� �����ְ�
 * �ùٸ� �ܾ ���ߴ� ����
 */
public class Ap_04 {

	public static void main(String[] args) {
		
		// �ܾ ���� ArrayList�� �����
		ArrayList<String> words = new ArrayList<String>();
		words.add("korea");
		words.add("america");
		words.add("africa");
		words.add("ostria");
		words.add("russia");
		
		// scanner �������� �ݺ��� ������ ������� �ʵ���
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			Collections.shuffle(words);
			String[] qw = words.get(0).split("");
			
			// Arrays Ŭ������ asList() �޼���� 
			// qw �迭�� ArrayList�� ��ȯ��Ű�� ���
			ArrayList<String> arrStr = new ArrayList<String>(Arrays.asList(qw));
			// >> �迭�� ArrayList�� ����� ���
			
			Collections.shuffle(arrStr);
			
			System.out.println("������ ���õ� ���ĺ��� �´� �ܾ��?");
			System.out.println("~END�� ���� ����");
			
			// ArrayList�� println���� �ܼ� ����� �ϸ�
			// ArrayList ��� ��θ� ���ٷ� ǥ���Ѵ�.
			System.out.println(arrStr);
			
			String keyIn = scanner.nextLine();
			if(keyIn.equals("~END"))break;
			
			if(keyIn.equalsIgnoreCase(words.get(0))){
				System.out.println("����!");
			}else {
				System.out.println("����!");
				System.out.println("���� : "+words.get(0));
			}
			
		}// while�� ������ �κ�
		System.out.println("���� ����~~");
		

	}

}
