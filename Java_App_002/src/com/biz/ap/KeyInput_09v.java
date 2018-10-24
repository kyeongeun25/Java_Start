package com.biz.ap;

import java.util.Scanner;

import com.biz.ap.vo.GradeVO;

/*
 * 학번, 국어점수, 영어점수, 수학점수를 입력받아서 
 * GradeVO에 저장하고
 * 총점과 평균을 계산
 */
public class KeyInput_09v {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		GradeVO vo = new GradeVO();
		System.out.print("학번 : ");
		vo.setStrNum(scanner.nextLine());
		
		System.out.print("국어점수 : ");
		String strKor = scanner.nextLine();
		int intKor = Integer.valueOf(strKor);
		vo.setIntKor(intKor);
		
		System.out.print("영어점수 : ");
		vo.setIntEng(Integer.valueOf(scanner.nextLine()));
		
		System.out.print("수학점수 : ");
		vo.setIntMath(Integer.valueOf(scanner.nextLine()));
		
		// 합계계산
		int intSum = vo.getIntKor() + vo.getIntEng() + vo.getIntMath() ;
		
		System.out.println("점수 총 합 : "+intSum);
		System.out.println("점수 평 균 : "+intSum/3);
	}

}
