package com.biz.ap;

import java.io.FileReader;

/*
 * com.biz.ap ��Ű������ �ִ�
 * data.txt ������ �о
 * ������ �ֿܼ� ǥ��
 * 
 * ���� �б� ����
 * 1. ������ ��� �ִ��� �˾ƾ� �Ѵ�.
 * 		- ���� ������ ������ �ִ� ���� �˾ƾ� �Ѵ�.
 * 2. ���� ����
 * 3. ���� ���� �б�
 * 4. ���� �ݱ�
 * 		- java 1.7 �̻󿡼��� �ڵ����� ������� �ϳ�, 
 * 		 ���� ���� ������ ������ �ݾ��ִ� ���� ����.
 * 5. ���� ���� ȭ�鿡 ���
 */

public class FileReader01 {

	public static void main(String[] args) {
		
		// ���� ������ ������ ��ġ, �����̸�
		String fileName = "src/com/biz/ap/data.txt" ;
		
		// ������ �б� ���ؼ� ����
		// FileReader��� JDK Ŭ������ ����Ѵ�. p807
		// FileReader fileReader = new FileReader(fileName);
		
		int num = 0;
		num = Integer.valueOf("10");
		
		try {
			num = Integer.valueOf(" 10");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("���� ��, ��, ���̿� ���ڿ��� ���ԵǸ� �ȵ�");
		}
		// try�� �ȿ� ����ִ� �ڵ带 �ѹ� ������ ����
		// ���� exception�� �߻��Ѵٸ�
		// �� exception�� �������� Ȯ���϶�
		// Java �⺻����� method()
		 
		// num = Integer.valueOf(" 10");
		// �� �ڵ�� ���⿡�� �� ������ ���� ���̴µ�
		// ���� �տ� ��ĭ(space)�� �־
		// ���ڷ� ��ȯ �� �� ���ٴ� exception�� �߻���Ų��.
		// ����ڿ��� ������Ʈ�� �������� �� �̷� exception�� �߻��ϸ�
		// ����ڴ� ������Ʈ(���α׷�)�� �ŷڼ��� �ǽ��� ���̴�.
		// �����ڴ� �̷� ��찡 �߻������� �𸣴� �κп�
		// ���Ƿ� exception handling�̶� ���� ó���ؼ�
		// ����ڿ��� ������ �־�� �Ѵ�.
		
		
		
		
		
		
		
		
		
		
		
	}

}
