package com.biz.Be04;

public class Be_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// method를 호출해서 숫자 1개를 넘겨주고
		// 해당하는 숫자의 구구단을 출력
		/*gugudan(2);
		gugudan(3);
		gugudan(4);
		gugudan(5);
		gugudan(6);
		gugudan(7);
		gugudan(8);
		gugudan(9);*/
		
		// 같은 gugudan() 메서드를
		// 숫자만 바꾸어 9번 호출
		// 이런경우 for를 활용가능
		
		
		for(int i = 2 ; i < 10 ; i++) {
			gugudan(i);
		}
		
	}
	
	public static void gugudan(int num) {
		
		System.out.print(num);
		System.out.println("단");
		System.out.println("============");
		for(int i = 1 ; i < 10 ; i++) {
			System.out.print(num);
			System.out.print(" X ");
			System.out.print(i);
			System.out.print(" = ");
			System.out.println(num*i);
			
		}
		System.out.println("=============");
		System.out.println();
	}

}
