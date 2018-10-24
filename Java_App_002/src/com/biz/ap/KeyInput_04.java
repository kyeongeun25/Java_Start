package com.biz.ap;

import java.util.Scanner;

/*
 * 숫자 1개를 입력받아서
 * 1부터 숫자까지 덧셈을 계산
 * */
public class KeyInput_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자입력>> ");
		
		String num = scanner.nextLine();
		
		// 문자열을 정수로 변경
		int intNum = Integer.valueOf(num);
		
		if(intNum < 1) {
			System.out.println("1보다 큰값을 입력해주세요.");
		}else {
			int intSum  = 0;
			for(int i = 1 ; i <= intNum ; i++) {
				intSum += i;
			}
			System.out.println("합계 : "+intSum);
		}
		
		
		
		
	}

}
