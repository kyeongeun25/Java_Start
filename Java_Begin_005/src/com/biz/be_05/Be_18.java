package com.biz.be_05;

public class Be_18 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		����(-1);
		����(2);
	}
	
	// void ��(return ���� ����) method�� ����µ�
	// �Ѱ��� ������ �Ű������� �ް� 
	// ���޹��� ���� -1 �̸� �ƹ��� �ϵ� ���� ���� 
	// �׷��� ������ '�ȳ��ϼ���'��� ���ڿ���
	// �ֿܼ� ������
	
	public static void ����(int �Ű�����) {
		if(�Ű����� == -1) {
			// �Ű����� ���� -1�̸�
			// ����() �޼��带 �ߴ��϶�
			return;
		}else {
			System.out.println("�ȳ��ϼ���");
		}
	}

}
