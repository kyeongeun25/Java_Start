package com.biz.app;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 	2부터 100까지 수 중
 * 	소수를 찾아서 
 * 	ArrayList에 담기
 */
public class App_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 배열의 길이를 알기 어려운 경우 ArrayList를 사용하면 효율적!
		ArrayList<Integer> prims = new ArrayList<Integer>();
		
		for(int i = 2 ; i<=100 ; i++) {
			if(App_09.primeCheck(i)) {
				prims.add(i); // ArrayList에 추가
			}
		}
		
		// for를 큰 값부터 0까지 역순으로 반복
		// 값이 큰 수부터 작은 수 순으로 표시
		for(int i = prims.size()-1 ; i >= 0 ; i--) {
			System.out.print(prims.get(i)+" ");
		}
		System.out.println();
		
		// 정순으로(작은 수 부터 큰 수 순)으로
		for(int i : prims) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		// prims를 뒤 섞은 후
		Collections.shuffle(prims);
		for(int i : prims) {
			System.out.print(i+" ");
		}
		System.out.println();
		
	}

}
