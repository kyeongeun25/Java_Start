package com.biz.ap;

import java.util.Scanner;

public class KeyInput_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자1입력>>");
		String num1 = scanner.nextLine();
		// 문자열로 입력된 숫자를 
		// 4칙연산에서 사용되는 숫자형으로 바꾸어서
		// 연산에 사용을 해야한다.
		
		int intNum1 = Integer.valueOf(num1);
		// num1에 담긴 문자열형 숫자를 정수형으로 변경
		float fNum1 = Float.valueOf(num1);
		// 실수형으로 변경
		
		System.out.print("숫자2입력>>");
		String num2 = scanner.nextLine();
		int intNum2 = Integer.valueOf(num2);			
		
		System.out.println(num1+num2);
		System.out.println(intNum1+intNum2);
	}

}
