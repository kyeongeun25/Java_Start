package com.biz.op;

public class Op_Array_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strName = new String[] {
				"ȫ�浿",
				"�̸���",
				"������",
				"�庸��",
				"�念��",
				"�Ӳ���",
				"������",
				"�̸���",
				"������",
				"�庸��",
				"�念��"
				
		}; // ���ڿ� �迭 �ʱⰪ�� �����ϰ� �����ϴ� ���
			// ��� �ʱ� �� ������ ��� �迭�� ������ �ش�.
			// �߰�ȣ({}) ������ �ݵ�� �����ݷ�(;)�� ���� �Ѵ�.
		
		// ������ �̸��� �迭�� �� ��°�� �ִ��� Ȯ��
		// ���ʿ� �߰ߵ� ��ġ �˱�
		System.out.println("������ġ===============");
		for(int i = 0; i < strName.length ; i++) {
			if(strName[i].equals("������")){
				System.out.println("�������� "+i+"��° ����");
				break;		// for �ݺ��� �ߴ�
			}
		}
		System.out.println("��ü��ġ============");
		// ��ü ����� �ִ��� �˱�
		for(int i = 0; i < strName.length ; i++) {
			if(strName[i].equals("������")){
				System.out.println("�������� "+i+"��° ����");
				
			}
		}
		
	}

}
