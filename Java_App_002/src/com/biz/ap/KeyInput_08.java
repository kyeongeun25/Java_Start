package com.biz.ap;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ���ڸ� �Է¹޾Ƽ� ArrayList�� �߰��ϰ�
 * END�� �Է��ϸ� �Է��� �����ϰ�
 * �Էµ� ���ڵ��� �հ踦 ����� �� ���
 */
public class KeyInput_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> nums = new ArrayList<String>();
		
		
		int cnt = 0;
		while(true) {
			cnt++;
			System.out.print(cnt+"��° �� >>");
			String num = scanner.nextLine();
			// if ���� ������ ��ɹ��� 1�ٸ� ���� ���� {}�� ���� �ʾƵ� �ȴ�.
			if(num.equals("END")) break;
			nums.add(num);
		}
		
		// �Է��� �����ϰ� ���
		int intSum = 0;
		for(String s : nums) {
			intSum += Integer.valueOf(s);
		}
		System.out.println("�հ� : "+intSum);
		
		
	}

}
