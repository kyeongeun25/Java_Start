package com.biz.ap2;

import java.util.Scanner;

/*
 * ���ڿ��� korea �� ��
 * �� ���ڿ��� ������ ���� �ؼ� �ڼ��� �� �����ְ�
 * �ùٸ� ���ڿ��� �Է��ϸ� ����
 * �ƴϸ� �����̶�� ǥ���ϴ� ������ ����
 */
public class Ap_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "Korea";
		// String Ŭ�������� ���ڿ��� ������ �и��ϴ� method()�� �ִ�.
		// String.split(����);
		// 		String�� ���� ���ڿ��� ������ �迭�� ������ִ� method()
		String w1 = "��:��:��:��:��:��";
		String[] ws = w1.split(":");
		String[] words = word.split("");
		
		// ws ������ ���
		System.out.println(ws.length);
		
		// ����Ȯ��
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
