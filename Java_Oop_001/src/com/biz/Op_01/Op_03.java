package com.biz.Op_01;

public class Op_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intAge = 20 ;
		int intYear = 2018 ;
		int intBirth = 1995 ;
		
		ǥ��(intAge, intYear, intBirth);
		
		// HappyBirth��� Ŭ������ �̿��ؼ�
		// b ������ �����϶�
		HappyBirth b = new HappyBirth ();
		b.intYear = 2018 ;
		b.intAge = 20 ;
		b.intBirth = 1998 ;
		ǥ��(b);
		
	}
	static void ǥ��(HappyBirth a) {
		System.out.println(
				"���ش� "+a.intYear + "�̰�, "+"����� �¾ �ش� "+a.intBirth+"�̸� "+a.intAge+"�� �Դϴ�."
				
				);
	}
	static void ǥ��(int intAge, int intYear, int intBirth) {
		System.out.println("���ش� "+intYear+"�̰�,"+" ����� �¾ �ش� "+intBirth+"�̸� "+intAge+"�� �Դϴ�.");
	}

}
