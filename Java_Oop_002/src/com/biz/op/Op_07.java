package com.biz.op;

public class Op_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ �迭�� ����� for�� �̿��ؼ� �ݺ��� ��,
		// �迭�� ������ �׻� ����ؾ� �ϴ� ������ �ִ�.
		
		// ��) 10���� ������ �迭�� �����
		int[] intNums = new int[10] ;
		
		// �迭�� ���� ���� �Ҵ�
		for(int i = 0 ; i < 10 ; i ++) {
			intNums[i] = (int)(Math.random() * 100);
		}
		
		// �Ҵ�� ���� Ȯ��
		//for ( int i = 0 ; i < 100 ; i++) {
		//	System.out.println(intNums[i]);
		//}
		
		// ���� �� �ڵ忡�� �迭�� ������ �ٲٷ���
		// ����κ�, �Ҵ�κ�, Ȯ�κκ� 3���� ���� �ٲپ�� �Ѵ�.
		// �Ѱ����� �����ϴµ� ���� ���� �ڵ带 �����ϴ� ���� 
		// ���� �߻� Ȯ���� ���δ�.
		// �׷��� �ּ����� �ڵ带 �ٲپ� ��� ������ �� �� �ֵ���
		// �ڵ带 �ۼ��ؾ� �Ѵ�.
		
		// ù��° ���
		// �迭�� ��쿡 �迭 ������ ������ ����
		int nCnt = 100;
		int[] intNum2 = new int[nCnt];
		for(int i = 0; i <nCnt ; i++) {
			intNum2[i] = (int)(Math.random() * 100);
		}
		for( int i = 0 ; i < nCnt ; i++) {
			System.out.println(intNum2[i]);
		}
		System.out.println();
		
		// Ŭ������ Ȯ���� ����ϴ� ���
		int[] intNum3 = new int[199];
		// �迭.length�� �迭�� ũ�⸦ ���� �Ӽ�(����)��.
		// �ٸ� �迭.length�� �б� ����
		// intNum3.length = 10 : �Ұ��� �ڵ�(=�б�����)
		System.out.println(intNum3.length);
		
		// 000.method() : �̶� 000�� ��ü��� �ҷ��� ����
		// 000.method()�� ��ȣ�ȿ� ���� �����ϸ�
		// 			���� setting �϶�� ����
		// ���� = 000.method()�� ���� �б�(getting) �϶�� ����
		
		// 000.property : property�� ������ ������ ����.
		// 000.property = �� : ���� ����(����, �Ҵ�) �϶�� ����
		// ���� = 000.property : ���� �б� ����
		// �׷��� 000.property�� �б�����, ���������� �ִ�.
		
		// �迭�� ũ�Ⱑ �ٲ���� �� �ڵ带 �ּ��� �����ϴ�
		// �ι�° ���
		// �迭�� length �Ӽ��� �̿��ϴ� ���
		
		// �� �Ҵ�
		for(int i = 0 ; i < intNum3.length ; i++) {
			intNum3[i] = (int)(Math.random()*100);
		}
		
		// �� �б�
		for( int i = 0 ; i < intNum3.length ; i++) {
			System.out.println(intNum3[i]);
		}
		
		
		

		
		
	
		
		
	}

}
