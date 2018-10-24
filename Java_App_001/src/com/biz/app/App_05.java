package com.biz.app;

import java.util.ArrayList;
import java.util.Collections;

/*
 *  ArrayList를 이용해서
 *  lotto 번호를 추출해 본다.
 */
public class App_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
		for(int i = 1; i<=45 ; i++) {
			lotto.add(i);
		}
		
		// shuffle은 sort와 반대되는 개념
		// 무작위로 순서를 뒤섞기
		Collections.shuffle(lotto);
		
		for(int i : lotto) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("이번 주 lotto 1등 번호");
		System.out.println("==================");
		for(int i = 0 ; i < 6 ; i++) {
			System.out.print(lotto.get(i) + " ");
		}
		
	}

}
