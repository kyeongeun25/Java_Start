package com.biz.Be04;

public class Be_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ������
		for(int i=2; i<10 ; i++) {
			System.out.println();
			System.out.println(i+"��");
			for (int j=1;j<10;j++) {
				System.out.print(i+"*"+j+"="+(i*j));
				System.out.println();
			}
		}
		
		System.out.println("������");
		System.out.println("===========");
		for(int i = 1; i<10; i++) {
			System.out.print("2 X ");
			System.out.print(i);
			System.out.print(" = ");
			System.out.println(2*i);
		}
		System.out.println("===========");
		
	}

}
