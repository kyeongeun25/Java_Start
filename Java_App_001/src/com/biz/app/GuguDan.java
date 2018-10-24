package com.biz.app;

/*
 *  1개의 정수를 전달받아서 
 *  그 정수에 해당하는 구구단을 화면에 출력하는 기능
 */
public class GuguDan {

	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void guguDan() {

		// num : member변수에 세팅된 값
		System.out.println(num + "단");
		System.out.println("================");
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " X " + i + " = " + num * i);
		}
		System.out.println("================");
		System.out.println();
	}
	
	public void guguDan(int num) {
		// num : method를 호출하면서 전달 받은 값
		System.out.println(num + "단");
		System.out.println("================");
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " X " + i + " = " + num * i);
			System.out.println();
		}
		System.out.println("================");
		System.out.println();
	}

}
