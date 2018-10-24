package com.biz.Be04;

public class Be_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0 ; i < 10 ; i++ ) {
			System.out.println("K");
			
			for(int j = 0; j < 10 ; j++) {
				System.out.println("M");
			}
		}
		
		for(int i = 0; i<10; i++) {
			
			for(int j = 0 ; j < 10 ; j++) {
				System.out.print("M");
			}
			System.out.println(); // ÁÙ¹Ù²Þ
		}
		
		for(int i = 0 ; i < 10 ; i++) {
			for(int j = i ; j < 10 ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for( int i = 10; i > 0 ; i--) {
			for(int j = i ; j>0 ;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
