package com.biz.Be04;

public class Be_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNum = 0;
		intNum = make();
		System.out.println(intNum);
		
		intNum = make(20);
		System.out.println(intNum);
		
		intNum = make(20, 30);
		System.out.println(intNum);
		
	}

	// return ���� �ִ� method��� �Ѵ�.
	// 30+40�� ����ؼ� return
	public static int make() {
		return 30 + 40 ;
	}
	
	// �Ѱ��� �������� �޾Ƽ�
	// �ι� �����ؼ� return
	public static int make(int num) {
		return num + num;
	}
	
	// �� ���� �������� �޾Ƽ�
	// �� ���� ������ �� return
	public static int make(int num1, int num2) {
		return num1 + num2 ;
	}
}
