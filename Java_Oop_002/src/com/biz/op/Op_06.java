package com.biz.op;

public class Op_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ������ �迭 10���� ����
		int[] intNums = new int[10];
		
		// 10���� �迭�� Math.randeom() �޼��带 �̿��ؼ�
		// ������ �Ҵ�(����)����
		
		// ����,
		// �׽�Ʈ 0 �� ��ġ�� �������� �ϳ� �Ҵ�
		intNums[0] = (int)(Math.random()*10 );
		// 		>> 0���� 9���� ���� ���� �Ҵ�
		System.out.println(intNums[0]);
		
		// for �ݺ����� �̿��ؼ� 10���� �迭��
		// ������ �Ҵ�
		System.out.println("��������Ʈ");
		System.out.println("==========");
		for ( int i = 0 ; i < 10 ; i++) {
			intNums[i] = (int)(Math.random()*100 );
			System.out.println(i + "��° ���� : "+ intNums[i]);
		}
		
		// ������ �迭�� ����� �������� ���� ���
		System.out.println("�հ� ���");
		System.out.println("==========");
		
		// �հ�� ���� ����
		int intSum = 0;
		for ( int i = 0 ; i  < 10 ; i++) {
			intSum += intNums[i];
		}
		System.out.println("���� ���� : "+ intSum);
		
		System.out.println();
		System.out.println("��� ���");
		System.out.println("===========");
		
		int intAvg = 0;
		for(int i =0 ; i < 10 ; i++) {
			// ���⿡�� ����� ���ؼ� ������ �ϸ�
			// ���� �ȵȴ�!!!
			intAvg += intNums[i] / 10 ;
		}
		System.out.println("���� ��� : "+ intAvg);
		System.out.println();
		
		intAvg = intSum / 10 ;
		System.out.println(intAvg);
		
	}

}
