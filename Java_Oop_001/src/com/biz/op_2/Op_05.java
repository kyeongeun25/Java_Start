package com.biz.op_2;

public class Op_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grade05 g = new Grade05 () ;
		
		// ���� �Ҵ�, ���� Setting
		g.setIntNum(1);
		g.setStrName("ȫ�浿");
		g.setIntKor(90);
		g.setIntEng(80);
		g.setIntMath(80);
		
		// �о ���� ���� ���
		int intSum = g.getIntEng() + g.getIntKor() + g.getIntMath() ;
		
		System.out.print("�й� "+ g.getIntNum() + "�� ");
		System.out.println(g.getStrName()+"�� ");
		System.out.println("�������� : "+g.getIntKor());
		System.out.println("�������� : "+g.getIntMath());
		System.out.println("�������� : "+g.getIntEng());
		
		
	}

}
