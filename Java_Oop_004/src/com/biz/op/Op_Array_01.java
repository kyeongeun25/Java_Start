package com.biz.op;

public class Op_Array_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 숫자형 변수 10개 생성
		//				  생성자
		int[] intNums = new int[10] ;
		
		// 이미 intNums는 10개가 생성된 상태인데
		// 다시 생성자를 통해서 20개를 생성하면
		// 기존의 intNums의 데이터들은 사라져버리고 
		// 새로운 기억장소에 intNums 20개 짜리가 새로
		// 만들어진다.
		intNums = new int[20] ; // 배열의 크기 변경은 할 수 없다. 
		// 배열은 1가지 type의 자료만을 저장 할 수 있다.
		// int형은 정수형만, String 형은 문자열형만
		// 그래서 별도로 사용자 클래스를 만들고
		// member변수들을 포함하여 사용 할 수 있도록 하고
		// 그 클래스를 객체배열로 만들어 사용한다.
		// 다만, 객체배열은 배열을 만든 후 
		// 각 요소를 다시 객체로 초기화 해야 한다.
		
		
		// 문자열 변수 10개 생성
		String[] strNames = new String[10];
		
	}

}
