package com.biz.op_2;

public class Op_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3���� ��ü ����
		GradeVO_1 g = new GradeVO_1 () ;
		GradeVO_1 g1 = new GradeVO_1 () ;
		GradeVO_1 g2 = new GradeVO_1 () ;
		
		// ���� ��ü�� �������� �Ҵ�(Setting)
		g.intKor = 30 ;
		g.intEng = 90 ;
		g.intMath = 70 ;
		
		g1.intKor = 89 ;
		g1.intEng = 77 ;
		g1.intMath = 87 ;
		
		g2.intKor = 66 ;
		g2.intEng = 55 ;
		g2.intMath = 88 ;
		
		/*for(int i = 0; i < 10 ; i++) {
			GradeVO_1 i = new GradeVO_1() ;
			
		}*/
		
		// ����() method ȣ��
		// return ���� intSum�� �Ҵ�
		int intSum = g.����() ;
		System.out.println("g�� ���� : "+intSum);
		
		System.out.println("g1�� ���� : "+g1.����());
		System.out.println("g2�� ���� : "+g2.����());
		
		/*
		 * Ŭ������ ����� method��
		 * �� Ŭ������ ����� �ٸ� ��ü���� ���� ������
		 * ��ġ�� �ʴ´�.
		 * 
		 */
	}

}
