package com.biz.app;

import java.util.ArrayList;
import java.util.Collections;

public class App_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
		for(int i = 1 ; i <= 45 ; i++) {
			num.add(i);
		}
		Collections.shuffle(num);
		
		for(int i = 0 ; i < 6 ; i++) {
			lotto.add(num.get(i));
		}
		Collections.sort(lotto);
		
		System.out.println("이번주 1등 lotto 번호");
		System.out.println("================");
		for(int i : lotto) {
			System.out.print(i+" ");
		}
		
		
	}

}
