package com.biz.be03;

public class Be_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ������ ���������� ������� ���
		// ��հ��� �Ǽ�(float)����� ������ ���꿡��
		// ������ �߻� �� �� �ִ�.
		// �̷� �� ������ ���̱� ���ؼ��� ��� ������
		// float(�Ǽ���)���� ����, �ۼ��ؾ� �Ѵ�.
		
		float foKor = 90.0f; // 1.8 �̻󿡼��� ��� ����
		float foEng = 70.0f; // �ڹ� 1.7 ���Ͽ� ����
		float foMath = 85.0f;
		
		float foSum = 0.0f;
		float foAvg = 0.0f;
		
		foSum = foKor + foEng + foMath ;
		foAvg = foSum / 3;
		
		System.out.println("�� �� : "+foSum);
		System.out.println("�� �� : "+foAvg);
		
	}

}
