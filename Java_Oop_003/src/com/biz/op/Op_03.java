package com.biz.op;

/*
 * ���ڿ� �迭�� ���� ����
 */

public class Op_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���ڿ��� Ư¡
		// �̸� ��ҿ� ���� �� ���� ������ ��찡 ����.
		// �Ϲ����� ������� �迭�� ����⵵ ������
		// �ٸ� ������� �迭�� ����⵵ �Ѵ�.
		String[] strName = new String[10] ; //�Ϲ����� ���
		strName[0] = "ȫ�浿";
		strName[1] = "�̸���";
		strName[2] = "������";
		
		// �ٸ����
		// �迭���� Ű���忡 �迭�� ũ�⸦ ������ �ʴ´�.
		String[] strNation = new String[]{
			"���ѹα�", "�����߱�", "��ȭ�α�", "�Ϻ�",
			"��Ż����", "����", "����"
		};
		//{} ���̿� �迭��Ҹ� �ĸ�(,)�� �����Ͽ� ���� ����
		// �迭�� ũ�⸦ ��Ұ�����ŭ �ڵ����� ����
		
		// strName�� ǥ��
		for(String s : strName) {
			System.out.println(s);
		}
		
		System.out.println("=========");
		//strNation�� ǥ��
		for( String s : strNation ) {
			System.out.println(s);
		}
		
	}

}
