package com.biz.op;

public class Op_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �迭�� ����ڴ�.
		//		�迭�� �̸�
		//						ũ�Ⱑ 10�� �迭�� ������
		// ** ���⿡�� ������ ���� ���� �� �� �ִ�.
		int[] intNums = new int[10] ;
		
		// ���� �Ҵ�
		// �迭�� index = ÷�ڶ�� �θ���.
		//  	  >> �迭�� ��ġ
		intNums[0] = 1 ;
		intNums[1] = 5 ;
		intNums[2] = 10 ;
		intNums[3] = 9 ;
		intNums[4] = 3 ;
		intNums[5] = 5 ;
		intNums[6] = 2 ;
		intNums[7] = 8 ;
		intNums[8] = 20 ;
		intNums[9] = 10;
		// �迭�� 10�� �����
		// 		index�� 0���� 9������ �����ȴ�.
		// �׷��� 10�� index�� 11�̶�� ���� 
		// �Ҵ��϶�� �ϴ� ũ�Ⱑ �ʰ��ż� exception�� �߻�
		// intNums[10] = 10 ;
		
		// �迭 �� ���
		System.out.println(intNums[0]);
		System.out.println(intNums[1]);
		System.out.println(intNums[2]);
		System.out.println(intNums[3]);
		System.out.println(intNums[4]);
		System.out.println(intNums[5]);
		System.out.println(intNums[6]);
		System.out.println(intNums[7]);
		System.out.println(intNums[8]);
		System.out.println(intNums[9]);
		
		for ( int index = 0 ; index < 10 ; index ++) {
			System.out.println(intNums[ index ]);
		}
		
	}

}
