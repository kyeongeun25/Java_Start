package com.biz.op;

/*
 * GradeVO Ŭ������ ����ǥ ��ü�� �����ؼ�
 * �� ������ ������ �������� ���� �Ҵ� �� ��
 * 
 * �л� ������ ������ ����� ���
 */
public class Op_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GradeVO[] ����ǥ = new GradeVO[10] ;
		
		//��ü�迭 ���� �� �� ��Ҹ� �ʱ�ȭ
		for(int i = 0 ; i < ����ǥ.length ; i++) {
			����ǥ[i] = new GradeVO();
		}
		
		// �� �л��� ���������� �Ҵ�
		for(int i = 0 ; i < ����ǥ.length ; i++) {
			// ����ǥ�� i��° ��� ��ü�� v�� ����(�ӽú���)
			GradeVO v = ����ǥ[i] ;
			
			// Math.random()�� �̿��ؼ� ������ ����
			// ���ǻ� 50������ 100������ 
			int intKor = (int)(Math.random() * (100-50) +50) ;
			// ������ �Ҵ�
			v.setIntKor(intKor);
			
			int intEng = (int)(Math.random() * (100-50)+50);
			v.setIntEng(intEng);
			
			int intMath = (int)(Math.random() * (100-50)+50);
			v.setIntMath(intMath);
			
			// i ������ ������ �л��� �й��� ����
			v.������(i+1);
			
		}
		
		// ����ǥ��
		// \t : Ű������ tabŰ�� �ѹ� ���� �� ó��
		//		���� ��ġ�� ���� ���ڸ� ǥ���ϰ��� �� �� ���
		// 		>> escape ���ڶ�� �Ѵ�.
		// \n : enter Ű ȿ��
		System.out.println("�й�\t����\t����\t����");
		System.out.println("=================");
		for(GradeVO v : ����ǥ) {
			System.out.print(v.getIntNum()+"\t");
			System.out.print(v.getIntKor()+"\t");
			System.out.print(v.getIntEng()+"\t");
			System.out.println(v.getIntMath());
		}
		System.out.println("=================");
		System.out.println();
		//1	2	3	4	5	6
		
		// ������ ����� ���� ǥ��
		System.out.println("�й�\t����\t����\t����\t����\t���");
		System.out.println("========================");
		for(GradeVO v : ����ǥ) {
			System.out.print(v.getIntNum()+"\t");
			System.out.print(v.getIntKor()+"\t");
			System.out.print(v.getIntEng()+"\t");
			System.out.print(v.getIntMath()+"\t");
			
			// ���� ���
			int intSum = v.getIntKor() + v.getIntEng() + v.getIntMath() ;
			
			System.out.print(intSum+"\t");
			System.out.println((intSum / 3));
			
 		}
		System.out.println("========================");
		
	}

}
