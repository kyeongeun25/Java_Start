package com.biz.be03;

public class Be_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<100; i=i+2) {
			System.out.println(i);
		}
		
		// 0���� 100���� ���� �߿� ¦���� ���� ���϶�
		int intSum = 0;
		for(int i=0; i<=100; i+=2) {
			intSum = intSum + i;
		}
		System.out.println("¦���� �� : "+intSum);
		
		// 1���� 100���� ���� �߿��� Ȧ���� ���� ���϶�
		int intOdd = 0;
		for(int i=1;i<=100;i+=2) {
			intOdd += i;
		}
		System.out.println("Ȧ���� �� : "+intOdd);
		
		intOdd = 0;
		for(int i = 0; i<=100; i++) {
			if(i%2!=0) {
				intOdd += i;
			}
		}
		System.out.println("if�� �̿��� Ȧ���� �� : "+intOdd);
		
	}

}
