package com.biz.app;

import java.util.ArrayList;
import java.util.Collections;

/*
 *  ArrayList�� �̿��ؼ�
 *  lotto ��ȣ�� ������ ����.
 */
public class App_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
		for(int i = 1; i<=45 ; i++) {
			lotto.add(i);
		}
		
		// shuffle�� sort�� �ݴ�Ǵ� ����
		// �������� ������ �ڼ���
		Collections.shuffle(lotto);
		
		for(int i : lotto) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("�̹� �� lotto 1�� ��ȣ");
		System.out.println("==================");
		for(int i = 0 ; i < 6 ; i++) {
			System.out.print(lotto.get(i) + " ");
		}
		
	}

}
