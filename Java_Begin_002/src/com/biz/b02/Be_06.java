package com.biz.b02;

public class Be_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * �ڷ���, ������
		 * 		� ������ ���� ���� �� ���ΰ�?
		 */
		
		
		// ������
		int intNum = 0; // ����(����, �Ǽ�)�� ���� �� ������
						// �ϴ� 0���� �ʱ�ȭ�� ���ִ� ���� ����.
		
		// �Ǽ���
		float flNum = 0.0f ; // �Ǽ����� ���� f�� ���δ�.
		boolean bo = true ; // true, false�� ���� ����
		String strName = ""; //���ڿ��� �����ϴ� ����
		double doNum = 0;
		
		
		int intSum = 3+4; // 3+4�� ���� �����  intSum�� �Ҵ�
		String strSum = "3+4="; // 3+4 ���ڿ��� strSum�� �Ҵ�
		System.out.println(strSum + intSum);
		
		intSum = 10 + 10;
		intSum = 20 + 20;
		System.out.println(intSum);
		
		// ������ ���� ����� ���ڿ��� ������ ������ �� ����.
		// strSum = 3+3;
		// strSum = 4+4;
		
		String strName1 = "ȫ";
		String strName2 = "�浿";
		// ���ڿ��� + ������ ���ڿ��� �̾� ���̶�� ��
		strName = strName1 + strName2;
		System.out.println(strName);
		
		String strNum = "3" + 3;
		System.out.println(strNum);
		strNum = 3 + "3";
		System.out.println(strNum);
		
		strNum = "���:"+3+3;
		System.out.println(strNum);
		
		strNum = "���:"+(3+3);
		System.out.println(strNum);
		
		strNum = "" + (3+3); // null ���ڿ��� �ٿ�
							// ������ ������ ���ڿ������� ��ȯ��Ų��.
		System.out.println(strNum);
		
		// strNum = 3+3; �ܼ��� ���ڴ� ���ڿ��� ��ȯ �ȵ�
		
	
	
		
	}

}
