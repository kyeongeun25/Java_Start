package com.biz.be_05;

public class Be_15 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// return ���� �ִ� �޼���� �Ϲ������� 
		// �� return ���� ���� ������ = ���ʿ� �´�.
		// ������ ������ �޼��忡�� return�ϴ� ��, ������
		// �ڷ����� ���ƾ� �Ѵ�.
		// String s = ����(30,40); // ������ return ���� int ���ε�
				// s�� String ���̾ ������ �߻��Ѵ�.
		
		String s = str����(30,40);
				// s ������ �����ʿ� ���� method�� return ���� �ݵ�� String�� �̾�� �Ѵ�.
		
		float f = ����(30,40);
		// return ���� int ���� �������� ���� ���� ����
		// float f�� �����Ϸ��� �õ��ϸ�
		// f�� int ������ ū float ���̹Ƿ� ���� ����
		// ������ �ȴ�.
	}

	// �Ű������� ���� 2���� �ް� 
	// �� ������ ������ �����ؼ� 
	// ����� return ���ֵ��� 
	
	public static int ����(int ����1, int ����2) {
		int ���ϱ� = ����1 + ����2 ;
		return ���ϱ�;
	}
	
	public static String str����(int ����1, int ����2) {
		return "����";
	}
}
