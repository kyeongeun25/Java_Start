package com.biz.ap;

import java.util.Scanner;

/*
 * 5보다 큰 수를 입력받아서
 * 1부터 수까지 덧셈을 실행
 * 
 * 만약 5이하의 수를 입력하면
 * 메시지를 보여주고
 * 다시 입력받도록 코드를 작성
 * 
 */
public class KeyInput_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("5보다 큰 수 >>");
			String strNum = scanner.nextLine();
			
			int intNum = Integer.valueOf(strNum);
			if(intNum <= 5) {
				System.out.println("5보다 큰 수를 입력하세요.");
				continue ;
			}
			int intSum = 0;
			for(int i = 0 ; i <= intNum ; i++) {
				intSum += i;
			}
			System.out.println("합계 : "+intSum);
			break;
		}
		
	}

}
