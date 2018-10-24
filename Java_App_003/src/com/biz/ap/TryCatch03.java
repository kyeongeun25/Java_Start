package com.biz.ap;

import java.util.Scanner;

/*
 *  키보드에서 숫자를 입력받아서
 *  값들을 모두 덧셈하는 코드를 작성
 *  END 문자열이 입력되면 결과를 화면에 출력
 */

public class TryCatch03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int intSum = 0;
		
		while(true) {
			
			System.out.print("숫자 >> ");
			String num = scanner.nextLine();
			
			if(num.equals("END"))break;
			try {
			
				intSum += Integer.valueOf(num);
				
			} catch (Exception e) {
				
				System.out.println("숫자가 아닌 값이 입력되었네요.");
				System.out.println("다시 입력하세요.");
				
			}
		}
		System.out.println("합계 : "+intSum);
	}
}
