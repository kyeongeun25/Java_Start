package com.biz.op;

public class Op_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// GradeVO Ŭ������ ����ؼ�
		// 10�� ���� ������ random���� �����ϰ�
		// ������ ����� ��� ����.
		
		// GradeVO�� �迭�� �����϶�
		GradeVO[] gs = new GradeVO[100];
		
		
		// ���� �迭�� 
		// �迭�� �����ϸ� ����ȣ(nums[0] ~ nums[9])����
		// ��� 0���� �ڵ� �ʱ�ȭ �Ѵ�. 
		int[] nums = new int[10];
		// �׷���, Ŭ������ �迭�� �����ϸ�
		// �� ��Ҵ� ���� ��ü�� ������� ���°� �ƴϴ�.
		// ��, ���� gs[0] ���� gs[99]������ 
		// �ƹ��� ���� ���� �����̴�.
		// ==>> null(null pointer)�� ����
		
		// ��ü�� �迭�� ������ ������
		// �� ��ҵ��� �ݵ�� �ٽ� ��ü�ʱ�ȭ �� �־�� �Ѵ�.
		
		// ��ü �迭 ��Ҹ� �ʱ�ȭ �ϴ� ���
		for(int i = 0 ; i < gs.length ; i++) {
			gs[i] = new GradeVO() ;
		}
		// >> ��ü �迭�� �迭�� ���� ��
		// 		�� ��Ҹ� �ʱ�ȭ ���� ������
		//		�б⵵, ���⵵ �ƹ��͵� �� �� ����.
		
		// ������ ������ ���� �Ҵ�
		for(int i = 0; i < gs.length ; i++) {
			
			int intKor = (int)(Math.random() * 100);
			gs[i].setIntKor(intKor) ;
			
			int intEng = (int)(Math.random() * 100);
			gs[i].setIntEng(intEng);
			
			int intMath = (int)(Math.random() * 100);
			gs[i].setIntMath(intMath);
		}
		
		// ���� ���ϱ�
		int intSum = 0 ;
		for(int i = 0 ; i < gs.length ; i++) {
			intSum = gs[i].getIntKor() + gs[i].getIntEng() + gs[i].getIntMath();
			System.out.println(intSum);
		}
		
		
	}

}
