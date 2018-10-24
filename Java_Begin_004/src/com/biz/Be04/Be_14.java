package com.biz.Be04;

public class Be_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int j=2; j<10; j++) {
			System.out.println(j+"단");
			System.out.println("===========");
			for(int i = 1; i<10; i++) {
				System.out.println(j);
				System.out.print(" X ");
				System.out.print(i);
				System.out.print(" = ");
				System.out.println(j*i);
			}
			System.out.println("===========");
			System.out.println();
		}
		//1번의 구구단 표시하는 부분
		
	}

}
