package com.biz.be_05;

public class Be_14 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		�ʴ�����(); // ȣ�⸸ �ؼ��� �ƹ��� ������ �� �� ����.
		// return�� ��, ������ ���� ������ = ���ʿ� �� �־�� �Ѵ�.
		String �̸� = �ʴ�����();
		System.out.println(�̸�); // ȫ�浿 ���ڿ��� �ֿܼ� ǥ��
		
		int ������� = 1995;
		����ϱ��(�������);
		
		int ���� = 0;
		���� = ����ϱ��(�������);
		System.out.println(����);
		
	}

	// method�� return ��ɹ��� �ִ� ���
	// ȣ���ϴ� ������ � ���� �ٽ� �����Ѵ�.(�ѱ��, �����Ѵ�)
	// �̷� ��� void Ű���� ���
	// return �� ��, ������ �ڷ����� ���־�� �Ѵ�.
	public static String �ʴ�����() {
		return "ȫ�浿";
	}
	
	public static int ����ϱ��(int intBirth) {
		int ���� = 0;
		���� = 2018 - intBirth + 1;
		return ����;
	}
}
