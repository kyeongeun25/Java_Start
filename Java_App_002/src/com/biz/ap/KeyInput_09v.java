package com.biz.ap;

import java.util.Scanner;

import com.biz.ap.vo.GradeVO;

/*
 * �й�, ��������, ��������, ���������� �Է¹޾Ƽ� 
 * GradeVO�� �����ϰ�
 * ������ ����� ���
 */
public class KeyInput_09v {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		GradeVO vo = new GradeVO();
		System.out.print("�й� : ");
		vo.setStrNum(scanner.nextLine());
		
		System.out.print("�������� : ");
		String strKor = scanner.nextLine();
		int intKor = Integer.valueOf(strKor);
		vo.setIntKor(intKor);
		
		System.out.print("�������� : ");
		vo.setIntEng(Integer.valueOf(scanner.nextLine()));
		
		System.out.print("�������� : ");
		vo.setIntMath(Integer.valueOf(scanner.nextLine()));
		
		// �հ���
		int intSum = vo.getIntKor() + vo.getIntEng() + vo.getIntMath() ;
		
		System.out.println("���� �� �� : "+intSum);
		System.out.println("���� �� �� : "+intSum/3);
	}

}
