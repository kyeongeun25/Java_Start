package com.biz.app;

import java.util.ArrayList;
import java.util.Collections;

/*
 * � ȸ�翡�� 
 * ���ο� ȸ���� ������ �ߴ�.
 * 
 * ȸ�������� �ϸ鼭 �̺�Ʈ�� �ɾ��µ�
 * ��÷�� ���ؼ� 
 * ��ǰ���� �����Ѵٰ� ����� �ߴ�.
 * 
 * ������ �Ǿ ��÷�� �ؾ� �ϴµ�
 * ������ �Ϸ��� �����ϰ� 
 * �ŷڼ��� ������ �����ϴ� ��� ���� �� ����.
 * 
 * ��÷ ������ Ư���� ���� ����.
 * 
 * ȸ�� �߿� ��ǰ���� ���� ����� ��÷�ϴ� �ڵ带 �ۼ��Ѵ�.
 * 
 * >> Raffle �ڵ�
 * 
 */

public class App {
	
	public static void main(String[] args) {
		
		// ArrayList�� ������ ȸ������ �̸��� ���
		ArrayList<String> members = new ArrayList<String>();
		
		// ȸ���̸��� �߰�
		members.add("ȫ�浿");
		members.add("�̸���");
		members.add("������");
		members.add("�庸��");
		members.add("�念��");
		members.add("�Ӳ���");
		members.add("������");
		members.add("�庸��");
		members.add("�念��");
		members.add("�Ӳ���");
		members.add("������");
		
		
		// shuffle
		Collections.shuffle(members);
		
		// �� ��� �� 2�� �̱�
		for(int i = 0 ; i < 2 ; i++) {
			System.out.println(i+" �� ��÷ : "+members.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
