package com.biz.Be04;

public class Be_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// method�� ȣ���ؼ� ���� 1���� �Ѱ��ְ�
		// �ش��ϴ� ������ �������� ���
		/*gugudan(2);
		gugudan(3);
		gugudan(4);
		gugudan(5);
		gugudan(6);
		gugudan(7);
		gugudan(8);
		gugudan(9);*/
		
		// ���� gugudan() �޼��带
		// ���ڸ� �ٲپ� 9�� ȣ��
		// �̷���� for�� Ȱ�밡��
		
		
		for(int i = 2 ; i < 10 ; i++) {
			gugudan(i);
		}
		
	}
	
	public static void gugudan(int num) {
		
		System.out.print(num);
		System.out.println("��");
		System.out.println("============");
		for(int i = 1 ; i < 10 ; i++) {
			System.out.print(num);
			System.out.print(" X ");
			System.out.print(i);
			System.out.print(" = ");
			System.out.println(num*i);
			
		}
		System.out.println("=============");
		System.out.println();
	}

}
