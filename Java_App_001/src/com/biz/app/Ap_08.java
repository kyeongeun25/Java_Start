package com.biz.app;

public class Ap_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 7  ;
		int index = 0;
		
		for(index = 2 ; index<num ; index++) {
			if(num % index==0) {
				System.out.println(num+"은 소수 아님");
				break;
			}
		}
		System.out.println("index="+index);
		if(index>=num) {
			System.out.println(num+"은 소수임");
		}
	}

}
