package com.biz.be03;

public class Be_04 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNum = 0;
		
		// 고전방식
		intNum = intNum + 10;
		// Java 스러운 방식
		intNum += 10;
		
		System.out.println(intNum);
		
		
		intNum += 1; // 1증가
		intNum ++; // 1증가
		
		// i값이 0부터 10미만(9까지) 1씩 증가되도록
		// for문 내의 명령문을 반복 실행한다.
		
		int intNum1 = 0;
		for(int i = 0; i<10; i++) {
			intNum1 ++;
			System.out.println(intNum1);
		}
		System.out.println("최종값");
		System.out.println(intNum1);
		
		System.out.println("i값 확인");
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("i값 확인");
		for(int i = 1 ; i<=10; i++) {
			System.out.println(i);
		}
		
		int intSum = 0;
		for(int i=1; i<=10; i++) {
			intSum += i;
		}
		System.out.println("1부터 10까지 합:"+intSum);
	}

}
