package com.biz.op;

import java.util.ArrayList;

/*
 * JDK에 포함된 특별한 배열 클래스를 사용
 * ArrayList
 * 		일반배열에 여러가지 확장된 기능을 포함한
 * 		JDK의 배열 클래스
 */
public class Op_Array_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList의 사용법
		// 클래스이기 때문에 먼저 객체로 만든 후 사용
		ArrayList<String> arr = new ArrayList<String>();
		// ArrayList : 크기가 지정되지 않은 채로 생성
		// 처음에는 배열의 크기가 0인상태
		// 배열요소를 add() 메서드를 이용해서 추가해서 사용
		
		System.out.println("초기크기 : "+arr.size());
		
		arr.add("우리나라만세"); 	 // 1번째 값 추가 
		arr.add("Korea");				 // 2번째 값 추가
		arr.add("Republic of Kor");  // 3번째 값 추가
		
		// arr의 요소개수를 알고 싶을 때
		// size() 메서드를 호출해 보면 알 수 있다.
		
		System.out.println("나중크기 : "+arr.size());
		
		// arr의 요소에 값을 읽을 때
		// get(index)를 이용
		System.out.println("0번 요소 : "+arr.get(0));
		System.out.println("1번 요소 : "+arr.get(1));
		System.out.println("2번 요소 : "+arr.get(2));
		
		// ArrayList도 배열과 성질이 비슷해서
		// 최대크기 -1의 요소까지만 읽을 수 있다.
		// 현재 size가 3이므로 마지막요소는 2번까지만 읽을 수 있다.
		// 아래 코드는 IndexOutOfBound Exception 발생
		System.out.println("3번 요소 : "+arr.get(3));
		
	}

}
