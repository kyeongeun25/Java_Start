package com.biz.op;

/*
 * 문자열 배열을 생성 연습
 */

public class Op_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열의 특징
		// 미리 요소에 저장 될 값이 정해진 경우가 많다.
		// 일반적인 방법으로 배열을 만들기도 하지만
		// 다른 방법으로 배열을 만들기도 한다.
		String[] strName = new String[10] ; //일반적인 방법
		strName[0] = "홍길동";
		strName[1] = "이몽룡";
		strName[2] = "성춘향";
		
		// 다른방법
		// 배열생성 키워드에 배열의 크기를 정하지 않는다.
		String[] strNation = new String[]{
			"대한민국", "미합중국", "중화민국", "일본",
			"이탈리아", "영국", "독일"
		};
		//{} 사이에 배열요소를 컴마(,)로 구분하여 직접 지정
		// 배열의 크기를 요소개수만큼 자동으로 설정
		
		// strName을 표시
		for(String s : strName) {
			System.out.println(s);
		}
		
		System.out.println("=========");
		//strNation을 표시
		for( String s : strNation ) {
			System.out.println(s);
		}
		
	}

}
