package com.biz.Be04;

public class Be_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strNation = "대한민국";
		
		// 문자열형 변수는 '=='을 이용해서 비교하면
		// 비교대상과 같은 값임에도 불구하고 
		// 아니라고 나타나는 경우가 있다.
		// 그래서 문자열형 변수는 '=='을 이용해서 값이 같은지
		// 비교하지 않는다.
		if(strNation == "대한민국") {
			System.out.println("변수 값이 '대한민국' 입니다.");
		} else {
			System.out.println("변수 값은 '대한민국'이 아닙니다.");
		}
		
	}

}
