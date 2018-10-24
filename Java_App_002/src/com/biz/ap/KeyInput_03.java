package com.biz.ap;

import java.util.Scanner;

public class KeyInput_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		// 숫자를 직접 숫자형으로 입력 받을 수도 있다
		System.out.println("숫자1>>");
		int num1 = scanner.nextInt();
		// nextInt()와 nextLine()을 연속으로 사용하면
		// nextInt()다음에 nectLine()을 건너뛰는 문제가 있다.
		// 그래서 nextInt() 사용 안함.
		
		
		System.out.println("숫자2>>");
		String num2 = scanner.nextLine();
		int intNum2 = Integer.valueOf(num2);
		
	}

}
