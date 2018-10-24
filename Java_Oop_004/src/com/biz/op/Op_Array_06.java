package com.biz.op;

import java.util.ArrayList;

import com.biz.op.vo.GradeVO;

/*
 * GradeVO�� ArrayList�� ���
 * 10���� 3���� ������ random���� �����ϰ�
 * ArrayList�� add()
 */
public class Op_Array_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Java������ ������ �迭���� ArrayList�� �� ��ȣ�Ѵ�.
		ArrayList<GradeVO> gs = new ArrayList<GradeVO>();
		
		// for�� �̿��ؼ� 10���� ������ ����
		for( int i = 0 ; i < 10 ; i++) {
			GradeVO vo = new GradeVO();
			vo.setIntNum(i+1);		// �й����
			
			int intKor = (int)(Math.random()*(100-50)+50);
			vo.setIntKor(intKor);
			
			int intEng = (int)(Math.random()*(100-50)+50);
			vo.setIntEng(intEng);
			
			int intMath = (int)(Math.random()*(100-50)+50);
			vo.setIntMath(intMath);
			
			// vo�� ArrayList�� add()
			gs.add(vo);
		}
		
		// ȭ�鿡 ���
		// Ȯ��� for�� �̿�
		System.out.println("�й�\t����\t����\t����\t����\t���");
		System.out.println("=========================");
		for(GradeVO vo : gs) {
			System.out.print(vo.getIntNum()+"\t");
			System.out.print(vo.getIntKor()+"\t");
			System.out.print(vo.getIntEng()+"\t");
			System.out.print(vo.getIntMath()+"\t");
			
			int intSum = vo.getIntKor() + vo.getIntEng() + vo.getIntMath() ;
			System.out.print(intSum+"\t");
			System.out.println(intSum/3);
		}
		System.out.println("=========================");
		
	}

}
