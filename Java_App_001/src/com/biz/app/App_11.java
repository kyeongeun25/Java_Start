package com.biz.app;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 	2���� 100���� �� ��
 * 	�Ҽ��� ã�Ƽ� 
 * 	ArrayList�� ���
 */
public class App_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// �迭�� ���̸� �˱� ����� ��� ArrayList�� ����ϸ� ȿ����!
		ArrayList<Integer> prims = new ArrayList<Integer>();
		
		for(int i = 2 ; i<=100 ; i++) {
			if(App_09.primeCheck(i)) {
				prims.add(i); // ArrayList�� �߰�
			}
		}
		
		// for�� ū ������ 0���� �������� �ݺ�
		// ���� ū ������ ���� �� ������ ǥ��
		for(int i = prims.size()-1 ; i >= 0 ; i--) {
			System.out.print(prims.get(i)+" ");
		}
		System.out.println();
		
		// ��������(���� �� ���� ū �� ��)����
		for(int i : prims) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		// prims�� �� ���� ��
		Collections.shuffle(prims);
		for(int i : prims) {
			System.out.print(i+" ");
		}
		System.out.println();
		
	}

}
