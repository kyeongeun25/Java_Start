package com.biz.app;

public class App_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] lotto = new int[6];
		
		for(int i = 0 ; i < 6 ; i++) {
			
			int n =(int)(Math.random()*(45-1)+1);
			lotto[i] = n;

			for(int j = 0 ; j < i ; j ++) {
	
				if(lotto[j] == n) {
					i--;
					break;
				}
			}
		}
		for(int i : lotto) {
			System.out.println(i+" ");
		}
	}

}
