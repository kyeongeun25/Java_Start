package com.biz.op;

/*
 * Grade02 Ŭ������ �̿��Ͽ�
 * gs ��ü�迭�� 10�� �����ϰ�
 * �ʱ�ȭ �Ͻÿ�.
 */

public class Op_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grade02[] gs = new Grade02[10] ;
		
		for( int i = 0; i<gs.length ; i++) {
			gs[i] = new Grade02();
		}
		
		// �ʱ�ȭ�� gs �迭��
		// �� ������ Math.random() �޼��带 ����ؼ�
		// 0���� 99������ ������ �Ҵ�
		
		System.out.println("����\t����\t����\t����\t���");
		System.out.println("======================");
		for ( int i = 0 ; i < gs.length ; i++) {
			
			int intKor = (int)(Math.random()*1000);
			gs[i].setIntKor(intKor);
			
			int intEng = (int)(Math.random()*100);
			gs[i].setIntEng(intEng);
			
			int intMath = (int)(Math.random()*100);
			gs[i].setIntMath(intMath);
			
			System.out.print(gs[i].getIntKor()+"\t");
			System.out.print(gs[i].getIntEng()+"\t");
			System.out.print(gs[i].getIntMath()+"\t");
			
			int intSum = gs[i].getIntKor() + gs[i].getIntEng() + gs[i].getIntMath() ;
			
			System.out.print(intSum+"\t");
			System.out.println((intSum / 3));
			
		}
		System.out.println("======================");

		// Ȯ��� for�� �̿��� ���� ���
		// v=gs�� ��� ��ü �Ѱ� �Ѱ�
		// ��ü�迭�� ����ϳ��ϳ��� ��� ��ü��..
		for(Grade02 v : gs) {		// gs�� ��Ҹ� v�� ����
			
			int intSum = v.getIntKor() + v.getIntEng() + v.getIntMath() ;
			
			// �迭�� �� �ִ°� �ƴ϶�
			// �迭����� Grade02�� ��ü�� setting�� ��
			// �׷��� Ȯ��� for�� ����ؼ� 
			// ���� �Ҵ�(set) �� �� �ִ�.
			v.setIntSum(intSum);
			v.setIntAvg(intSum / 3);
			// ��ü �迭�� ���� Ȯ�� for�� ����ؼ� 
			// �� member ������ ���� setting �� �� �ִ�.
			
		}
		
	}

}
