package com.biz.ap;

import java.util.Scanner;

import com.biz.ap.vo.GradeVO;

/*
 * GradeVO �迭�� 3�� �����
 * 3���� ������ �Է¹޾Ƽ�
 * ���� ������ ����� ���
 */
public class KeyInput_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		GradeVO[] gradeVO = new GradeVO[3];
		
		for(int i = 0 ; i < gradeVO.length ; i++) {
			gradeVO[i] = new GradeVO();
			
			System.out.print("�й� : ");
			gradeVO[i].setStrNum(scanner.nextLine());
			
			System.out.print("�������� : ");
			gradeVO[i].setIntKor(Integer.valueOf(scanner.nextLine()));
			
			System.out.print("�������� : ");
			gradeVO[i].setIntEng(Integer.valueOf(scanner.nextLine()));
			
			System.out.print("�������� : ");
			gradeVO[i].setIntMath(Integer.valueOf(scanner.nextLine()));
		}
		
		System.out.println("�й�\t����\t����\t����\t����\t���");
		System.out.println("=============================");
		
		for(GradeVO v : gradeVO) {
			System.out.print(v.getStrNum()+"\t"+v.getIntKor()+"\t"+v.getIntEng()+"\t"+v.getIntMath()+"\t");
			
			int intSum = v.getIntKor() + v.getIntEng() + v.getIntMath();
			System.out.print(intSum+"\t"+intSum/3+"\n");
		}
		
	}

}
