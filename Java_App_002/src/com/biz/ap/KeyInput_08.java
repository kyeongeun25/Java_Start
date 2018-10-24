package com.biz.ap;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 숫자를 입력받아서 ArrayList에 추가하고
 * END를 입력하면 입력을 종료하고
 * 입력된 숫자들의 합계를 계산한 후 출력
 */
public class KeyInput_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> nums = new ArrayList<String>();
		
		
		int cnt = 0;
		while(true) {
			cnt++;
			System.out.print(cnt+"번째 수 >>");
			String num = scanner.nextLine();
			// if 조건 다음에 명령문이 1줄만 나올 때는 {}로 묶지 않아도 된다.
			if(num.equals("END")) break;
			nums.add(num);
		}
		
		// 입력을 종료하고 계산
		int intSum = 0;
		for(String s : nums) {
			intSum += Integer.valueOf(s);
		}
		System.out.println("합계 : "+intSum);
		
		
	}

}
