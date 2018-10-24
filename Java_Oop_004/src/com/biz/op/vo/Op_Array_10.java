package com.biz.op.vo;

import java.util.ArrayList;
import java.util.Collections;

/*
 * ArrayList에 숫자 10개를 담아서
 * 정렬
 */
public class Op_Array_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		// 난수를 만들어서 ArrayList에 10개 추가 
		for(int i = 0 ; i < 10 ; i++) {
			nums.add((int)(Math.random()*100));
		}
		// 추가한 ArrayList를 확인
		System.out.println("원래 숫자=========================");
		for(int i : nums) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		// ArrayList를 정렬
		// 직접 정렬하려면 앞에서 사용한 중첩for를 이용해야 하는데
		// Collections라는 JDK 클래스의 도움을 받아서 
		// 쉽게 정렬이 가능
		
		// Ascending asc = new Ascending();
		Collections.sort(nums); // 오름차순만 (기본)
		
		
		System.out.println(nums);
		
		// Collection은 Java에 있는 배열 클래스들(ArrayList, List, HashMap, Map)을 말하고 
		// Collections는 Collection들을 관리하기 쉽게 도와주는 클래스
		// Collections.sort() 메서드는 ArrayList<Integer>의 
		// 정렬을 다른 코드 없이 쉽게 구현해준다.
		// sort() 메서드는 ArrayList외에 다른 확장된 JDK를 연결해야 하는데 뒤에 언급하겠다.
		// Collections.sort(ArrayList,ASC 또는 DSC과 관련된 확장 JDK)
		
	}

}
