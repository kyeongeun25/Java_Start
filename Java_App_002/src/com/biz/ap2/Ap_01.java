package com.biz.ap2;

public class Ap_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열형 숫자를 정수형 숫자로 변환
		int num = Integer.valueOf("30");
		
		
		// 순수한 숫자가 아닌 빈칸, 다른 문자열이 포함되면 
		// 변환 오류 발생
		Integer.valueOf("30 ");
		Integer.valueOf(" 30");
		Integer.valueOf("A30");
		
	}

}
