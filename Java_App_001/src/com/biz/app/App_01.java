package com.biz.app;

public class App_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ������ ǥ�ø� ���� ��ü ����
		GuguDan gu = new GuguDan();
		
		gu.guguDan(3); // �Ű������� ���� �����ϸ鼭
							// method�� ȣ��
		
		gu.setNum(4);	// member������ ���� ������ ��
		gu.guguDan();	// method�� ȣ��
		
		// for ������ �̿��ؼ� 2�ܺ��� 9�ܱ��� �������� ǥ��
		for(int i = 1 ; i <10 ; i++) {
			// member������ ���� �����ϴ� ������� ������ ȣ��
			gu.setNum(i);
			gu.guguDan();
		}
		
	}

}
