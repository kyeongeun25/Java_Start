package com.biz.op;

import java.util.ArrayList;

import com.biz.op.vo.GradeVO;

/*
 * GradeVO를 ArrayList에 담기
 * 10명의 3과목 점수를 random으로 생성하고
 * ArrayList에 add()
 */
public class Op_Array_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Java에서는 오히려 배열보다 ArrayList를 더 선호한다.
		ArrayList<GradeVO> gs = new ArrayList<GradeVO>();
		
		// for를 이용해서 10명의 점수를 생성
		for( int i = 0 ; i < 10 ; i++) {
			GradeVO vo = new GradeVO();
			vo.setIntNum(i+1);		// 학번등록
			
			int intKor = (int)(Math.random()*(100-50)+50);
			vo.setIntKor(intKor);
			
			int intEng = (int)(Math.random()*(100-50)+50);
			vo.setIntEng(intEng);
			
			int intMath = (int)(Math.random()*(100-50)+50);
			vo.setIntMath(intMath);
			
			// vo를 ArrayList에 add()
			gs.add(vo);
		}
		
		// 화면에 출력
		// 확장된 for를 이용
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
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
