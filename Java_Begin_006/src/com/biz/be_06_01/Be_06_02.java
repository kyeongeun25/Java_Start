package com.biz.be_06_01;

public class Be_06_02 {

	// ������ main(), �Ǵ� ����() method �ۿ���
	// ���� �� �� �ִ�.
	
	// Ŭ���� ����(��ü����)����
	// Ŭ���� ������ � method������ �����Ͽ�
	// �б�, ���Ⱑ �����ϰ�
	// � method���� ����� ���� 
	// �� � method���� Ȯ�� �����ϴ�
	static int intNum = 0;
	static String strName = "ȫ�浿";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// method �ۿ��� ����� ������ ���� �� �� �ִ�.
		System.out.println("main���� : "+intNum);
		����();
		System.out.println("main���� ����ȣ�� �� : "+intNum);
		�̸�();
		System.out.println("main���� �̸�ȣ�� �� : "+intNum);
		
	}

	public static void ����() {
		intNum += 20;
	}
	
	// static�� ���� method
	public static void �̸�() {
		
		// Ŭ���� ���������� ���� �̸�����
		// method ���ο��� ������ �����ϸ�
		// �� ���� Ŭ���� ���������� ��������.
		// �׸��� method ������ ������ method�� ����, �ߴܵǸ�
		// ����� ������.
		
		// >> method ����������
		int intNum = 100;
		System.out.println("�̸����� : "+strName);
		
		// ��, ���������� ������� ���� strName�� �״�� �����ȴ�.
		
	}
	
}
