package com.biz.app;

/*
 *  � ȸ�翡�� �޿��� �������� �����Ϸ� �Ѵ�.
 *  �� �� �ּ����� ȭ��ż��� ���ϴ� �ڵ带 �ۼ�
 */

public class App_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int money = 2785430 ;
		int m = 0;
		
		m = (money / 50000);
		System.out.println("5������ "+m+"��");
		money = money - m*50000 ;
		
		m = (money / 10000);
		System.out.println("1������ "+m+"��");
		money = money - m*10000 ;
		
		m = (money / 5000);
		System.out.println("5õ���� "+m+"��");
		money = money - m*5000 ;
		
		m = (money / 1000);
		System.out.println("1õ���� "+m+"��");
		money = money - m*1000 ;
		
		m = (money / 500);
		System.out.println("5���¥�� "+m+"��");
		money = money - m*500 ;
		
		m = (money / 100);
		System.out.println("���¥�� "+m+"��");
		money = money - m*100 ;
		
		m = (money / 10);
		System.out.println("�ʿ�¥�� "+m+"��");
		money = money - m*10 ;
		
	}

}
