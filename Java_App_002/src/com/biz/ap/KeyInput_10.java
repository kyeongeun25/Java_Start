package com.biz.ap;

import java.util.Scanner;

import com.biz.ap.vo.GradeVO;

/*
 * GradeVO 배열을 3개 만들고
 * 3명의 점수를 입력받아서
 * 각각 총점과 평균을 계산
 */
public class KeyInput_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		GradeVO[] gradeVO = new GradeVO[3];
		
		for(int i = 0 ; i < gradeVO.length ; i++) {
			gradeVO[i] = new GradeVO();
			
			System.out.print("학번 : ");
			gradeVO[i].setStrNum(scanner.nextLine());
			
			System.out.print("국어점수 : ");
			gradeVO[i].setIntKor(Integer.valueOf(scanner.nextLine()));
			
			System.out.print("영어점수 : ");
			gradeVO[i].setIntEng(Integer.valueOf(scanner.nextLine()));
			
			System.out.print("수학점수 : ");
			gradeVO[i].setIntMath(Integer.valueOf(scanner.nextLine()));
		}
		
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=============================");
		
		for(GradeVO v : gradeVO) {
			System.out.print(v.getStrNum()+"\t"+v.getIntKor()+"\t"+v.getIntEng()+"\t"+v.getIntMath()+"\t");
			
			int intSum = v.getIntKor() + v.getIntEng() + v.getIntMath();
			System.out.print(intSum+"\t"+intSum/3+"\n");
		}
		
	}

}
