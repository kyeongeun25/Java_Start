package com.biz.op;

import java.util.ArrayList;

/*
 * JDK�� ���Ե� Ư���� �迭 Ŭ������ ���
 * ArrayList
 * 		�Ϲݹ迭�� �������� Ȯ��� ����� ������
 * 		JDK�� �迭 Ŭ����
 */
public class Op_Array_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList�� ����
		// Ŭ�����̱� ������ ���� ��ü�� ���� �� ���
		ArrayList<String> arr = new ArrayList<String>();
		// ArrayList : ũ�Ⱑ �������� ���� ä�� ����
		// ó������ �迭�� ũ�Ⱑ 0�λ���
		// �迭��Ҹ� add() �޼��带 �̿��ؼ� �߰��ؼ� ���
		
		System.out.println("�ʱ�ũ�� : "+arr.size());
		
		arr.add("�츮���󸸼�"); 	 // 1��° �� �߰� 
		arr.add("Korea");				 // 2��° �� �߰�
		arr.add("Republic of Kor");  // 3��° �� �߰�
		
		// arr�� ��Ұ����� �˰� ���� ��
		// size() �޼��带 ȣ���� ���� �� �� �ִ�.
		
		System.out.println("����ũ�� : "+arr.size());
		
		// arr�� ��ҿ� ���� ���� ��
		// get(index)�� �̿�
		System.out.println("0�� ��� : "+arr.get(0));
		System.out.println("1�� ��� : "+arr.get(1));
		System.out.println("2�� ��� : "+arr.get(2));
		
		// ArrayList�� �迭�� ������ ����ؼ�
		// �ִ�ũ�� -1�� ��ұ����� ���� �� �ִ�.
		// ���� size�� 3�̹Ƿ� ��������Ҵ� 2�������� ���� �� �ִ�.
		// �Ʒ� �ڵ�� IndexOutOfBound Exception �߻�
		System.out.println("3�� ��� : "+arr.get(3));
		
	}

}
