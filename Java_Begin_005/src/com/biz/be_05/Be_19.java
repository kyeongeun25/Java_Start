package com.biz.be_05;

public class Be_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		����(1);
		����(2);
		����(3);
		����(4);
	}
	
	// 1���� ������ �Ű������� �ް�
	// ���� ���� ���� ����, ����, ������ �ϵ��� 
	// method�� �����.
	public static void ����(int �Ű�����) {
		if( �Ű����� > 3 ) {
			return;
		}
		if( �Ű����� == 1 ) {
			System.out.println(30+30);
			return;
		}
		if( �Ű����� == 2 ) {
			System.out.println(30*30);
			return;
		}
		if( �Ű����� == 3) {
			System.out.println(30-30);
		}
	}

}
