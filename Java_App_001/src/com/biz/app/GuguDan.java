package com.biz.app;

/*
 *  1���� ������ ���޹޾Ƽ� 
 *  �� ������ �ش��ϴ� �������� ȭ�鿡 ����ϴ� ���
 */
public class GuguDan {

	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void guguDan() {

		// num : member������ ���õ� ��
		System.out.println(num + "��");
		System.out.println("================");
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " X " + i + " = " + num * i);
		}
		System.out.println("================");
		System.out.println();
	}
	
	public void guguDan(int num) {
		// num : method�� ȣ���ϸ鼭 ���� ���� ��
		System.out.println(num + "��");
		System.out.println("================");
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " X " + i + " = " + num * i);
			System.out.println();
		}
		System.out.println("================");
		System.out.println();
	}

}
